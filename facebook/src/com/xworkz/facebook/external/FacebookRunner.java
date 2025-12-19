package com.xworkz.facebook.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FacebookRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/face_database";
            String userName="root";
            String password="root";
            String query="insert into face_info values(22,'signature')";
            Connection connection =DriverManager.getConnection(url,userName,password);
            if (connection!=null){
                System.out.println("its connected");
            }
            Statement statement =connection.createStatement();
            int rows = statement.executeUpdate(query);
            System.out.println(rows);
          if (rows==1){
                System.out.println("hhgg");
            }else {
                System.out.println("not connected");
            }

        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
