package jm.task.core.jdbc.util;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String hostName = "localhost";
    private static final String dbName = "table";
    private static final String userName = "root";
    private static final String password = "Lijyg741";
 /* public static Connection getConnection() throws SQLException, ClassNotFoundException {

        return getConnection(hostName, dbName, userName, password);
    }*/
    public static Connection getConnection(/*String hostName, String dbName,
                                           String userName, String password*/)
                                           throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }


}
