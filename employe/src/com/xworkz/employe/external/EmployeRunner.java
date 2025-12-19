package com.xworkz.employe.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/face_database";
            String username="root";
            String password="root";
            String query="insert into face_info values(112,'prasad')";
            Connection connection=DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("its running");
            }
            Statement statement=connection.createStatement();
            int rows=statement.executeUpdate(query);
            System.out.println(rows);
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
