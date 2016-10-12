package br.edu.com.uricer.p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/exemplo",
                "usuario", "teste");
        System.out.println("Conexão aberta");
        conn.close();
    }
}
