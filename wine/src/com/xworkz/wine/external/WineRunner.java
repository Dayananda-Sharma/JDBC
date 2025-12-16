package com.xworkz.wine.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WineRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/Wine_database";
            String username="root";
            String password="root";
            Connection connection=DriverManager.getConnection(url,username,password);

            if (connection !=null){
                System.out.println("its conected");
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
