package br.edu.com.uricer.p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class TestaPesquisa {
    
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/exemplo", 
                "usuario", "teste");
        
        String sql = "select * from Pessoas";
        Statement stm = conn.createStatement();
        boolean resultado = stm.execute(sql);
        System.out.println("Resultado: " + resultado);

        ResultSet resultSet = stm.getResultSet();
        
        while(resultSet.next()) {
            String nome = resultSet.getString("nome");
            System.out.println(nome);
        }
        
        stm.close();
        resultSet.close();
        conn.close();
    }
    
}
