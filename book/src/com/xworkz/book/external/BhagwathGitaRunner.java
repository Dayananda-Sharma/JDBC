package com.xworkz.book.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BhagwathGitaRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/book_database";
            String userName="root";
            String passWord="root";
            Connection connection =DriverManager.getConnection(url,userName,passWord);
            if (connection!=null){
                System.out.println("its connected");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
