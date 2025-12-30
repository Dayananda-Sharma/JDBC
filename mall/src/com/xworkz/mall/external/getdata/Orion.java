package com.xworkz.mall.external.getdata;

import java.sql.*;

public class Orion {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Orion_db";
            String userName="root";
            String password="root";
            String query1="select * from Orion_info";

            Connection connection=DriverManager.getConnection(url,userName,password);



            if (connection!=null){
                System.out.println("its connected");
            }else {
                System.out.println("not connected");
            }

            Statement statement=connection.createStatement();
          
           ResultSet resultSet1=statement.executeQuery(query1);


            while (resultSet1.next()){
                System.out.println(resultSet1.getString(1)
                        +""+resultSet1.getString(2)
                        +""+resultSet1.getString(3));
            }




        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
