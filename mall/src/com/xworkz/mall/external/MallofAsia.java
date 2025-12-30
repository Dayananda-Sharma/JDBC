package com.xworkz.mall.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MallofAsia {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/Orion_db";
            String userName="root";
            String password="root";
            String query="insert into Orion_info values(2,'Urban vogue','Dress')";
            String query1="insert into Orion_info values(3,'Luxe threads','cloths')";
            String query2="insert into Orion_info values(4,'Trend','shirts')";
            String query3="insert into Orion_info values(5,'modish mantra','pants')";
            String query4="insert into Orion_info values(6,'Style','dress code')";
            String query5="insert into Orion_info values(7,'Nova','cloths')";
            String query6="insert into Orion_info values(8,'vista','watch')";
            String query7="insert into Orion_info values(10,'fast','smartWatch')";
            String query8="insert into Orion_info values(11,'Fashion','FashionDress')";
            String query9="insert into Orion_info values(12,'street','shoe')";
            String query10="insert into Orion_info values(13,'trend','slippers')";
            String query11="insert into Orion_info values(14,'zudio','cloths')";
            String query12="insert into Orion_info values(15,'aura','phone')";
            String query13="insert into Orion_info values(16,'attitude','cloths')";
            String query14="insert into Orion_info values(17,'Flairs','Iphone')";
            String query15="insert into Orion_info values(18,'bagShop','bag')";
            Connection connection =DriverManager.getConnection(url,userName,password);
            Statement statement =connection.createStatement();
            int rows=statement.executeUpdate(query);
            if (rows==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows1=statement.executeUpdate(query1);
            if (rows1==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows2=statement.executeUpdate(query2);
            if (rows2==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows3=statement.executeUpdate(query3);
            if (rows3==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows4=statement.executeUpdate(query4);
            if (rows4==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows5=statement.executeUpdate(query5);
            if (rows5==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows6=statement.executeUpdate(query6);
            if (rows6==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows7=statement.executeUpdate(query7);
            if (rows7==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows8=statement.executeUpdate(query8);
            if (rows8==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows9=statement.executeUpdate(query9);
            if (rows9==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows10=statement.executeUpdate(query10);
            if (rows10==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows11=statement.executeUpdate(query11);
            if (rows11==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows12=statement.executeUpdate(query12);
            if (rows12==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows13=statement.executeUpdate(query13);
            if (rows13==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }

            int rows14=statement.executeUpdate(query14);
            if (rows14==1){
                System.out.println("its connected");
            }else {
                System.out.println("its not connected");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
