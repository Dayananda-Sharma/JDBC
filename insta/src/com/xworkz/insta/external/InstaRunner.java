package com.xworkz.insta.external;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InstaRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/alco_database";
            String userName="root";
            String password="root";
            String query="insert into alco_info values(1,'signature')";
            Connection connection =DriverManager.getConnection(url,userName,password);
            Statement statement =connection.createStatement();
            int rows = statement.executeUpdate(query);
            if (rows==1){
                System.out.println(rows);
            }else {
                System.out.println("not inserted");
            }
            if (connection!=null){
                System.out.println("its connected");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
