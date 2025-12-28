package com.xworkz.dmart.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Dmart {
    public static void main(String[] args) {
           try {
               String url="jdbc:mysql://localhost:3306/Sky_database";
               String userName="root";
               String password="root";
               String query="insert into sky_info values(1,'product')";
               String query1="insert into sky_info values(2,'dress')";
               String query2="insert into sky_info values(3,'soap')";
               String query3="insert into sky_info values(4,'jug')";
               String query4="insert into sky_info values(5,'buket')";
               Connection connection =DriverManager.getConnection(url,userName,password);
               Statement statement=connection.createStatement();
               int rows = statement.executeUpdate(query);
               int rows1= statement.executeUpdate(query1);
               int rows2= statement.executeUpdate(query2);
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
           }catch (SQLException e){
               e.printStackTrace();
           }
    }
}
