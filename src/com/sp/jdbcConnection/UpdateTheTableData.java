package com.sp.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTheTableData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = null;


        // Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Get the connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "Rooh@#2001");

        //
        PreparedStatement ps= con.prepareStatement("update account set lastname=? where accountnumber=?");
        ps.setString(1,"Saharan");
        ps.setInt(2,3434);
        int count=ps.executeUpdate();
        System.out.println("No of rows effected "+count);
        if(count>0)
        {
            System.out.println("User insert the record and processs the result");
            System.out.println("No of rows effected "+count);
        }
        else{
            System.out.println("their is issue in insert record");
        }
        ps.close();
        con.close();
    }
}
