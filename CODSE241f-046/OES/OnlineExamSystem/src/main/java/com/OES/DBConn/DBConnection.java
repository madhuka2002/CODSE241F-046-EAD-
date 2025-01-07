package com.OES.DBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/onlineexam01";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
