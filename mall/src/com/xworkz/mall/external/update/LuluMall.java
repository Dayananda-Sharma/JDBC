package com.xworkz.mall.external.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LuluMall {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/Orion_db";
            String userName="root";
            String password="root";
            String updatequery="update Orion_info set Mall_shops='mobileShop' where mall_id='2'";
//            String updatequery1="update mall_info set mall_proudct='box' where mall_id='2'";
//            String updatequery2="update mall_info set mall_proudct='water' where mall_id='2'";
//            String updatequery3="update mall_info set mall_proudct='mango' where mall_id='2'";
//            String updatequery4="update mall_info set mall_proudct='books' where mall_id='2'";

            Connection connection =DriverManager.getConnection(url,userName,password);
            Statement statement =connection.createStatement();
            int rows=statement.executeUpdate(updatequery);
//
            if (rows==1){
                System.out.println("row added");
            }else {
                System.out.println("not added");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
