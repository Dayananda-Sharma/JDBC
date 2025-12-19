package com.xworkz.albums.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class AlbumsRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/sky_database";
            String userName="root";
            String password="root";
            String query="insert into sky_info values(1,'cloud')";
            Connection connection =DriverManager.getConnection(url,userName,password);
            Statement statement =connection.createStatement();
            int rows=statement.executeUpdate(query);
            if (rows==1){
                System.out.println(rows);
            }if (connection!=null){
                System.out.println("its connected");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
