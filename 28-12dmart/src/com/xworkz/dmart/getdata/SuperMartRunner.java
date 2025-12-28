package com.xworkz.dmart.getdata;

import java.sql.*;

public class SuperMartRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver folder exist");
            String url="jdbc:mysql://localhost:3306/Sky_database";
            String userName="root";
            String password="root";
            String queryexecute="select * from sky_info";
            Connection connection =DriverManager.getConnection(url,userName,password);


           if (connection!=null){
               System.out.println("its connected");
           }else {
               System.out.println("not connected");
           }
           Statement statement =connection.createStatement();
            ResultSet resultSet=statement.executeQuery(queryexecute);

            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+
                        resultSet.getString(2));

            }

        }catch (ClassNotFoundException s){
            s.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
