package com.xworkz.fan.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FanRunner {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/fan_database";
            String userName = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, userName, password);
            if (connection != null) {
                System.out.println("its connected");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
