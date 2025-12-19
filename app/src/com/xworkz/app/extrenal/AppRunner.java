package com.xworkz.app.extrenal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3360/Sky_database";
            String userName="root";
            String password="root";
            String query="insert into sky_info values(1,'cloud')";
            Connection connection =DriverManager.getConnection(url,userName,password) ;
                Statement statement = connection.createStatement();
                int rows = statement.executeUpdate(query);
                if (rows == 1) {
                    System.out.println(rows);
                } else {
                    System.out.println("not inserted");
                }if (connection!=null){

                }

            }catch (SQLException e){
            e.printStackTrace();
        }//catch (ClassNotFoundException e){
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // e.printStackTrace();
       // }
    }
}
