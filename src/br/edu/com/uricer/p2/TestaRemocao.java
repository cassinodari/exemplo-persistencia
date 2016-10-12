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
public class TestaRemocao {

    public static void main(String[] args) throws SQLException {
        Connection con = Database.getConnection();
        
        String sql = "delete from Pessoas where id > 3";
        Statement stm = con.createStatement();
        stm.execute(sql, Statement.RETURN_GENERATED_KEYS);
        int count = stm.getUpdateCount();
        System.out.println(count + " registros excluídos");

        stm.close();
        con.close();        
    }
}
