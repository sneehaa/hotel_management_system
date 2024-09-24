package controller;

import database.Dbconnection;
import model.Employee;
import model.Receptionist;
import view.login.EmployeeLogin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeController {
    Dbconnection dbconnection = new Dbconnection();

    public int registerEmployeePreparedStatement(Employee employee) {
        try {
            String query = "insert into employee(Name,Username,Email,Password) values(?,?,?,?)";

            PreparedStatement st = dbconnection.connection.prepareStatement(query);
            st.setString(1, employee.getName());
            st.setString(2, employee.getUsername());
            st.setString(3, employee.getEmail());
            st.setString(4, employee.getPassword());

            return dbconnection.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;

        }

    }

    public Employee loginEmployeePS(String username, String password) {
        Employee employee = null;
        try {
            String query;
            query = "select custId from manager where username =? and password =?";
            PreparedStatement pt = dbconnection.connection.prepareStatement(query);
            pt.setString(1, username);
            pt.setString(2, password);
            ResultSet rs = dbconnection.retrieve(pt);
            while (rs.next()) {
                employee = new Employee();
                employee.setCustId(rs.getInt("custId"));
                EmployeeLogin. Employee_ID=rs.getInt("custId");
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }

        return employee;
    }


    public Employee fetchLoggedInEmployee() {
        Employee employee = null;
        try {
            String query;
            query = "select * from manager where custId =?";
            PreparedStatement pt = dbconnection.connection.prepareStatement(query);
            pt.setInt(1, EmployeeLogin.Employee_ID);
            ResultSet rs = dbconnection.retrieve(pt);
            while (rs.next()) {
                employee = new Employee();
                employee.setCustId(rs.getInt("custId"));
                employee.setName(rs.getString("Name"));
                employee.setUsername(rs.getString("Username"));
                employee.setEmail(rs.getString("Email"));
                employee.setPassword(rs.getString("Password"));

            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
        return employee;
    }

    public int updateProfilePreparedStatement(Employee employee) {
        try {
            String query;
            query ="update employee set name=?,email= ?, address=?,gender=?,contact=?" +
                    "where username= ?";
            PreparedStatement pt = dbconnection.connection.prepareStatement(query);
            pt.setString(1,employee.getName());
            pt.setString(2,employee.getEmail());
            pt.setString(3,employee.getAddress());
            pt.setString(4,employee.getGender());
            pt.setString(5,employee.getContact());
            pt.setString(6,employee.getUsername());
            return dbconnection.manipulate(pt);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
            return 0;
        }
    }

}