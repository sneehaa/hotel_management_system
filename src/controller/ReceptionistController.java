package controller;

import database.Databasee;
import model.Manager;
import model.Receptionist;
import view.login.ManagerLogin;
import view.login.ReceptionistLogin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReceptionistController {
    Databasee databasee= new Databasee();

    public int registerReceptionistPreparedStatement(Receptionist receptionist) {
        try {
            String query = "insert into receptionist(Name,Username,Email,Password) values(?,?,?,?)";

            PreparedStatement st = databasee.connection.prepareStatement(query);
            st.setString(1, receptionist.getName());
            st.setString(2, receptionist.getUsername());
            st.setString(3, receptionist.getEmail());
            st.setString(4, receptionist.getPassword());
            return databasee.manipulate(st);


        } catch (SQLException e) {
            e.printStackTrace();
            return 0;

        }

    }

    public Receptionist loginReceptionistPS(String username, String password) {
       Receptionist receptionist = null;
        try {
            String query;
            query = "select custId from manager where username =? and password =?";
            PreparedStatement pt = databasee.connection.prepareStatement(query);
            pt.setString(1, username);
            pt.setString(2, password);
            ResultSet rs = databasee.retrieve(pt);
            while (rs.next()) {
                receptionist = new Receptionist();
                receptionist.setCustId(rs.getInt("custId"));
                ReceptionistLogin.Receptionist_ID=rs.getInt("custId");
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
        return receptionist;
    }


    public Receptionist fetchLoggedInReceptionits() {
        Receptionist receptionist = null;
        try {
            String query;
            query = "select * from employee where custId =?";
            PreparedStatement pt = databasee.connection.prepareStatement(query);
            pt.setInt(1, ReceptionistLogin.Receptionist_ID);
            ResultSet rs = databasee.retrieve(pt);
            while (rs.next()) {
                receptionist = new Receptionist();
                receptionist.setCustId(rs.getInt("custId"));
                receptionist.setName(rs.getString("Name"));
                receptionist.setUsername(rs.getString("Username"));
                receptionist.setEmail(rs.getString("Email"));
                receptionist.setPassword(rs.getString("Password"));

            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
        return receptionist;
    }

    public int updateProfilePreparedStatement(Receptionist receptionist) {
        try {
            String query;
            query ="update receptionist set name=?,email= ?, address=?,gender=?,contact=?" +
                    "where username= ?";
            PreparedStatement pt = databasee.connection.prepareStatement(query);
            pt.setString(1,receptionist.getName());
            pt.setString(2,receptionist.getEmail());
            pt.setString(3,receptionist.getAddress());
            pt.setString(4,receptionist.getGender());
            pt.setString(5,receptionist.getContact());
            pt.setString(6,receptionist.getUsername());
            return databasee.manipulate(pt);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
            return 0;
        }
    }


}
