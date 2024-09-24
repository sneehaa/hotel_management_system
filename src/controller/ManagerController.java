package controller;

import database.Database;
import model.Manager;
import view.login.ManagerLogin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerController {
    Database db= new Database();

    public int registerManagerPreparedStatement(Manager manager) {
        try {
            String query = "insert into manager(Name,Username,Email,Password) values(?,?,?,?)";

            PreparedStatement st = db.connection.prepareStatement(query);

            st.setString(1, manager.getName());
            st.setString(2, manager.getUsername());
            st.setString(3, manager.getEmail());
            st.setString(4, manager.getPassword());
//            st.setString(5,manager.getData2());
            return db.manipulate(st);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }




    }
    public Manager loginManagerPreparedStatement(String username, String password) {
        Manager manager = null;
        try {
            String query;
            query = "select custId from manager where username =? and password =?";
            PreparedStatement pt = db.connection.prepareStatement(query);
            pt.setString(1, username);
            pt.setString(2, password);
            ResultSet rs = db.retrieve(pt);
            while (rs.next()) {
                manager = new Manager();
                manager.setCustId(rs.getInt("custId"));
                ManagerLogin.MANAGER_ID=rs.getInt("custId");
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
        return manager;
    }

    public Manager fetchLoggedInManager() {
        Manager manager = null;
        try {
            String query;
            query = "select * from manager where custId =?";
            PreparedStatement pt = db.connection.prepareStatement(query);
            pt.setInt(1, ManagerLogin.MANAGER_ID);
            ResultSet rs = db.retrieve(pt);
            while (rs.next()) {
                manager = new Manager();
                manager.setCustId(rs.getInt("custId"));
                manager.setName(rs.getString("Name"));
                manager.setUsername(rs.getString("Username"));
                manager.setEmail(rs.getString("Email"));
                manager.setPassword(rs.getString("Password"));

            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
        return manager;
    }

    public int updateProfilePreparedStatement(Manager manager) {
        try {
            String query;
            query ="update manager set name=?,email= ?, address=?,gender=?,contact=?" +
                    "where username= ?";
            PreparedStatement pt = db.connection.prepareStatement(query);
            pt.setString(1, manager.getName());
            pt.setString(2, manager.getEmail());
            pt.setString(3,manager.getAddress());
            pt.setString(4,manager.getGender());
            pt.setString(5,manager.getContact());
            pt.setString(6, manager.getUsername());
            return db.manipulate(pt);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
            return 0;
        }
    }

    public int forgotManagerPreparedStatement(String username, String security, String secq) {
        Manager manager = null;
        try {
            String query;
            query = "update manager set password=? where username=? ";
            PreparedStatement pt = db.connection.prepareStatement(query);
            pt.setString(1, manager.getPassword());
            pt.setString(2, manager.getUsername());

            return db.manipulate(pt);


        } catch (Exception ex) {
            System.out.println("Error " + ex);
            return 0;
        }

    }

}
