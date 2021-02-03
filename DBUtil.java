package com.klu.Connections;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DBUtil {

  final static String forNameURL="oracle.jdbc.driver.OracleDriver";
    final static String DBURL="jdbc:oracle:thin:@localhost:1521:XE";
    final static String username="system";
    final static String password="Bhavya8*";
    public static Connection DBConnection() throws SQLException, ClassNotFoundException{
        Class.forName(forNameURL);
        Connection con=DriverManager.getConnection(DBURL,username,password);
        return con;
    }     

}
