package br.edu.com.uricer.p2;

import br.edu.com.uricer.p1.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class TestaInsercao {
    
    public static void main(String[] args) throws SQLException {
        Connection con = Database.getConnection();
        
        String sql = "insert into Pessoas(nome) values ('Rodrigo Rosa')";
        Statement stm = con.createStatement();
        boolean resultado = stm.execute(sql, Statement.RETURN_GENERATED_KEYS);
        System.out.println("Resultado: " + resultado);
        
        ResultSet resultSet = stm.getGeneratedKeys();
        
        while(resultSet.next()) {
            Integer id = resultSet.getInt(1);
            System.out.println(id);
        }

        stm.close();
        resultSet.close();
        con.close();        
    }
    
}
