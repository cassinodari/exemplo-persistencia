package br.edu.com.uricer.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class Database {
    
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/exemplo", "usuario", "teste");
        return connection;
    }
}
