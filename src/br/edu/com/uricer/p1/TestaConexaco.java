package br.edu.com.uricer.p1;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class TestaConexaco {
    
    public static void main(String[] args) throws SQLException {
        Connection connection = Database.getConnection();
        System.out.println("Conexão aberta");
        connection.close();
    }
    
}
