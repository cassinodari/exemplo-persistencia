package br.edu.com.uricer.p2;

import br.edu.com.uricer.p1.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class TestaInsercao3 {

    public static void main(String[] args) throws SQLException {
        try (Connection con = Database.getConnection()) {
            con.setAutoCommit(false);

            String sql = "insert into Pessoas(nome) values (?)";

            try (PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stm.setString(1, "Rodrigo C. Rosa");
                boolean resultado = stm.execute();
                con.commit();
                System.out.println("Resultado: " + resultado);

                try (ResultSet resultSet = stm.getGeneratedKeys()) {
                    while (resultSet.next()) {
                        Integer id = resultSet.getInt(1);
                        System.out.println(id);
                    }
                }
            } catch (Exception ex) {
                System.out.println("Erro ao tentar executar insercao: " + ex.getMessage());
                con.rollback();
            }
        }
    }
}
