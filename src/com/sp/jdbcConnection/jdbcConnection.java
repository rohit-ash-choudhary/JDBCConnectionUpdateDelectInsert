package com.sp.jdbcConnection;

import java.sql.*;

public class jdbcConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = null;


            // Load and register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Get the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "Rooh@#2001");

            //
        PreparedStatement ps= con.prepareStatement("insert into account values(?,?,?,?)");
        ps.setInt(1,3434);
        ps.setString(2, "Rohit");
        ps.setString(3,"Choudhary");
        ps.setInt(4,45454);
        int count=ps.executeUpdate();
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
