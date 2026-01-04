package com.xworkz.gt.external;

import java.sql.*;

public class GTBike {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Show_Room";
            String userName="root";
            String password="root";
            String query="insert into bike_info values(?,?,?)";
            Connection connection =DriverManager.getConnection(url,userName,password);
            PreparedStatement pr =connection.prepareStatement(query);
            pr.setInt(1,101);
            pr.setString(2,"Divya");
            pr.setString(3,"RajajiNagar");

            int rows=pr.executeUpdate();
            if (rows==1){
                System.out.println("its connected");
            }else {
                System.out.println(" not connected");
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException m){
            m.printStackTrace();
        }
    }
}
