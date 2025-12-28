package com.xworkz.dmart.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MartRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/Sky_database";
            String userName="root";
            String password="root";
            String query="update sky_info set sky_name='book' where sky_id ='5'";
            String query1="update sky_info set sky_name='pen' where sky_id ='1'";
            String query2="update sky_info set sky_name='scale' where sky_id ='2'";
            String query3="update sky_info set sky_name='pencil' where sky_id ='3'";
            String query4="update sky_info set sky_name='sheet' where sky_id ='4'";
            Connection connection=DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
            int rows =statement.executeUpdate(query);
            int rows1 =statement.executeUpdate(query1);
            int rows2=statement.executeUpdate(query2);
            int rows3=statement.executeUpdate(query3);
            int rows4=statement.executeUpdate(query4);
            System.out.println(rows);
            if (rows==1){
                System.out.println("its connected");
            }else {
                System.out.println("not connected");
            }
            if (rows1==2){
                System.out.println("its connected");
            }else {
                System.out.println("not connected");
            }
            if (rows2==3){
                System.out.println("its connected");
            }else {
                System.out.println("not connected");
            }
            if (rows3==4){
                System.out.println("its connected");
            }else {
                System.out.println("not connected");
            }
            if (rows4==5){
                System.out.println("its connected");
            }else {
                System.out.println("not connected");
            }

        }  catch (SQLException e){
            e.printStackTrace();
        }
    }
}
