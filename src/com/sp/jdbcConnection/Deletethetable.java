package com.sp.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletethetable {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = null;


        // Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Get the connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "Rooh@#2001");

        //
        PreparedStatement ps= con.prepareStatement("delete from account  where accountnumber=?");
        ps.setInt(1,3434);
        int count=ps.executeUpdate();
        System.out.println("number of rows affect  "+count);
        if(count>0)
        {
            System.out.println("number of rows delete  "+count);
        }
        else{
            System.out.println("Issue in data deletion");
        }


        ps.close();
        con.close();
    }
}
