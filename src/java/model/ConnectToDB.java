/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tran Van Tung
 */
public class ConnectToDB {

    public ConnectToDB() {
    }

    public static Connection getConnect() {
        Connection connection = null;
        try {
            String user = "sa";
            String pass = "123";
            String url = "jdbc:sqlserver://DESKTOP-O4P9U20\\TUNG:1433;databaseName=MyShop";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Lỗi kết nối DB - " + ex.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        System.out.println(getConnect());
    }

    //Hàm thực thi truy vấn
    public void excuteSql(String sql) throws Exception {
        Connection connect = getConnect();
        Statement stmt = connect.createStatement();
        stmt.executeUpdate(sql);
    }

    public ResultSet selectData(String sql) throws Exception {
        Connection connect = getConnect();
        Statement stmt = connect.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        return rs;
    }

}
