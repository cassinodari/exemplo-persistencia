package br.edu.com.uricer.view;

import br.edu.com.uricer.dao.DataBase;
import br.edu.com.uricer.dao.PessoaDAO;
import br.edu.com.uricer.model.Pessoa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@uricer.edu.br>
 */
public class PessoaForm extends javax.swing.JFrame {

    /**
     * Creates new form PessoaForm
     */
    public PessoaForm() {
        initComponents();
        inicializar();
    }

    private void inicializar() {
        try {
            pessoaDAO = new PessoaDAO(DataBase.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        pessoas = new ArrayList<>();
        pessoaTableModel = new PessoaTableModel(pessoas);
        tbPessoas.setModel(pessoaTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JTabbedPane();
        painelPesquisa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edNomeParam = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPessoas = new javax.swing.JTable();
        painelCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Nome:");

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        tbPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPessoasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPessoas);

        javax.swing.GroupLayout painelPesquisaLayout = new javax.swing.GroupLayout(painelPesquisa);
        painelPesquisa.setLayout(painelPesquisaLayout);
        painelPesquisaLayout.setHorizontalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNomeParam, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar)
                .addContainerGap(108, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        painelPesquisaLayout.setVerticalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edNomeParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
        );

        painelPrincipal.addTab("Pesquisa", painelPesquisa);

        jLabel1.setText("Id:");

        edId.setEnabled(false);

        jLabel2.setText("Nome:");

        edNome.setEnabled(false);

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btGravar.setText("Gravar");
        btGravar.setEnabled(false);
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.setEnabled(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir))
                    .addComponent(edId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btGravar)
                    .addComponent(btCancelar)
                    .addComponent(btExcluir))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        painelPrincipal.addTab("Cadastro", painelCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        pessoa = new Pessoa();
        limparEdits();
        edNome.grabFocus();

        edNome.setEnabled(true);
        btNovo.setEnabled(false);
        btGravar.setEnabled(true);
        btCancelar.setEnabled(true);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        editParaPessoa();
        try {
            if(pessoa.getId() == null || pessoa.getId() == 0) {
                Integer id = pessoaDAO.create(pessoa);
                pessoa.setId(id);
                edId.setText(id.toString());

            } else {
                pessoaDAO.update(pessoa);
            }

            btNovo.setEnabled(true);
            btExcluir.setEnabled(true);
            btCancelar.setEnabled(true);

            JOptionPane.showMessageDialog(this, "Gravado com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao gravar pessoa", "Erro", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_btGravarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        try {
            pessoas = pessoaDAO.findByNome(edNomeParam.getText());
            pessoaTableModel.setPessoas(pessoas);
            pessoaTableModel.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tbPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPessoasMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2) {
            pessoa = pessoas.get(tbPessoas.getSelectedRow());
            pessoaParaEdit();
            painelPrincipal.setSelectedIndex(1);
            edNome.setEnabled(true);
            btNovo.setEnabled(false);
            btGravar.setEnabled(true);
            btCancelar.setEnabled(true);
            btExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_tbPessoasMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma exclusão", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resultado == 0) {
            try {
                pessoaDAO.delete(pessoa);
                limparEdits();
                btExcluir.setEnabled(false);
                btCancelar.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(PessoaForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao excluir", "Erro", JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        pessoa = null;
        limparEdits();
        btNovo.setEnabled(true);
        btGravar.setEnabled(false);
        btCancelar.setEnabled(false);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void editParaPessoa() {
        if(edId.getText() != null && !edId.getText().isEmpty()) {
            pessoa.setId(Integer.parseInt(edId.getText()));
        }

        pessoa.setNome(edNome.getText());
    }

    private void pessoaParaEdit() {
        edId.setText(pessoa.getId().toString());
        edNome.setText(pessoa.getNome());
    }

    private void limparEdits() {
        edId.setText("");
        edNome.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PessoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JTextField edId;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNomeParam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel painelPesquisa;
    private javax.swing.JTabbedPane painelPrincipal;
    private javax.swing.JTable tbPessoas;
    // End of variables declaration//GEN-END:variables
    private Pessoa pessoa;
    private PessoaDAO pessoaDAO;
    private List<Pessoa> pessoas;
    private PessoaTableModel pessoaTableModel;
}

