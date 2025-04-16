///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.example.electricity_billing_system;
//
///**
// *
// * @author VISHAL
// */
//import java.sql.*;
//
//public class conn
//{
//    Connection c;
//    Statement s;
//    public conn()
//    {
//        try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity_billing","vishal","vishal0987");
//            s=c.createStatement();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//}
//    


package com.example.electricity_billing_system;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Correct driver
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity_billing", "root", "Abhi@8340");
            s = c.createStatement();
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
        }
    }
}