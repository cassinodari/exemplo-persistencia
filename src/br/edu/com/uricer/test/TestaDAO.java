package br.edu.com.uricer.test;

import br.edu.com.uricer.p2.DataBase;
import br.edu.com.uricer.p3.Pessoa;
import br.edu.com.uricer.p3.PessoaDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class TestaDAO {

    public static void main(String[] args) throws SQLException {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Barack Obama");

        Integer idCriado;

        try (Connection con = DataBase.getConnection()) {
            PessoaDAO pessoaDAO = new PessoaDAO(con);
            idCriado = pessoaDAO.create(pessoa);
            System.out.println("Criada pessoa com id " + idCriado);

            Pessoa outraPessoa = pessoaDAO.findById(idCriado);
            System.out.println("Pesquisada pessoa " + outraPessoa);

            List<Pessoa> pessoas = pessoaDAO.findByNome("rodrigo");
            System.out.println("Pesquisada por nome");
            for (Pessoa p : pessoas) {
                System.out.println(p);
            }

            System.out.println("Testa Update");
            List<Pessoa> pessoasParaAtualizar = pessoaDAO.findByNome("obama");
            Pessoa pessoaParaAtualizar = pessoasParaAtualizar.get(0);
            System.out.println("Pessoa antes de atualizar " + pessoaParaAtualizar);
            pessoaParaAtualizar.setNome("Michele Obama");
            pessoaDAO.update(pessoaParaAtualizar);
            pessoaParaAtualizar = pessoaDAO.findById(17);
            System.out.println("Pessoa após atualizar " + pessoaParaAtualizar);
            
            System.out.println("Testa Exclusão");
            List<Pessoa> pessoasAExcluir = pessoaDAO.findByNome("obama");
            System.out.println("Excluindo pessoa " + pessoasAExcluir.get(0));
            pessoaDAO.delete(pessoasAExcluir.get(0));
        }
    }
}
