package database;

import java.sql.*;

public class Databasee {
    public Connection connection;
    Statement statement;
    ResultSet resultSet;
    int val;


    public Databasee(){
        try{
            String username="root";
            String password= null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            // establishing connection in the connection object
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hmdb",
                    username,
                    password);
            if (connection !=null){
                System.out.println("Connected to database");
            }else {
                System.out.println("Database Error");
            }
            // creating the statement object
            statement = connection.createStatement();
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    //function to insert, update, delete
    public int manipulate(String query){
        try {
            val = statement.executeUpdate(query);
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return val;
    }
    public ResultSet retrieve(String query){
        try {
            resultSet=statement.executeQuery(query);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }

    // PREPARED STATEMENT SYNXTAX
    // manipulate

    public int manipulate(PreparedStatement pS){
        try {
            val = pS.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }return val;
    }

    // for retrieving
    public ResultSet retrieve (PreparedStatement ps){
        try{
            resultSet = ps.executeQuery();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return resultSet;
    }


    public static void main(String[] args) {
        new Databasee();
    }
}



