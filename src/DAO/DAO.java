/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LEGION
 */
public class DAO {

    public static Connection conn;

    public DAO() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/realbtl?useSSL=false";
        String username = "root";
        String password = "0963063105";
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}