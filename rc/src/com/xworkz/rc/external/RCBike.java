package com.xworkz.rc.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RCBike {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/Show_Room";
            String userName="root";
            String password="root";
            String query="insert into bike_info values(?,?,?) ";
            Connection connection = DriverManager.getConnection(url,userName,password);
            PreparedStatement pr=connection.prepareStatement(query);
            pr.setInt(1,109);
            pr.setString(2,"Navya");
            pr.setString(3,"electronic city");

            int rows=pr.executeUpdate();
            if (rows==1){
                System.out.println("its connected");
            }else {
                System.out.println("not connected");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        }

}
