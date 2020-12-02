package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.bean.Categoria;
import modelo.dao.CategoriaDao;

public class TelaEditarCategoria extends javax.swing.JDialog {

    public TelaEditarCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTprecoDiaria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTdescricao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jBsalvar = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KoT - Locação de Carros  - v1.0");

        jLabel1.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jLabel1.setText("Alterar Categoria");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria-20x20.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel8.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel8.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel9.setText("Preço (R$)");

        jLabel10.setFont(new java.awt.Font("Droid Serif", 0, 9)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Ex.: 100.50");

        jLabel11.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel11.setText("Descrição");

        jTdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdescricaoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel12.setText("Código");

        jTcodigo.setEnabled(false);

        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-30x30.png"))); // NOI18N
        jBsalvar.setBorder(null);
        jBsalvar.setBorderPainted(false);
        jBsalvar.setContentAreaFilled(false);
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });
        jBsalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBsalvarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBsalvar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTnome, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                        .addComponent(jTdescricao)
                        .addComponent(jLabel11)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTprecoDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel10))
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12)
                        .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTprecoDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBsalvar)
                .addGap(21, 21, 21))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil-20x20.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(523, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        if(alterar()){
            dispose();
        }
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jBsalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBsalvarKeyPressed

    }//GEN-LAST:event_jBsalvarKeyPressed

    private void jTdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdescricaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEditarCategoria dialog = new TelaEditarCategoria(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTdescricao;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTprecoDiaria;
    // End of variables declaration//GEN-END:variables

    private boolean alterar(){
        Categoria categoria = new Categoria();
        CategoriaDao categoriaDao = new CategoriaDao();
        Boolean result = null;
        
        int codigo = Integer.parseInt(jTcodigo.getText());
        String nome = jTnome.getText();
        String preco = jTprecoDiaria.getText();
        String descricao = jTdescricao.getText();
        
        if(nome.equals("")){ 
            JOptionPane.showMessageDialog(null, "Nome da categoria é obrigatório.");
            jTnome.requestFocus();
            result = false;
        }else if(preco.equals("")){
            JOptionPane.showMessageDialog(null, "Preço da categoria inválido.");    
            jTprecoDiaria.requestFocus();
            result = false;
        }else{
            
            categoria.setCodigo(codigo);
            categoria.setNome(nome);
            categoria.setPrecoDiaria(Double.parseDouble(preco));
            categoria.setDescricao(descricao);
            
            /** debug **/
            //JOptionPane.showMessageDialog(null, categoria.getCodigo()+" - "+categoria.getNome()+" - "+categoria.getPrecoDiaria()+" - "+categoria.getDescricao());
            //result = false;
            
            try {
                categoriaDao.alterar(categoria);
                JOptionPane.showMessageDialog(this, "Categoria atualizada com sucesso!");
                //limparCampos();
                result = true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar: "+ex.getMessage());
            }
        }    
        return result;
    }// fim do método inserir

    public void receberDados(Categoria categoria){
        
        jTcodigo.setText(Integer.toString(categoria.getCodigo()));
        jTnome.setText(categoria.getNome());
        jTprecoDiaria.setText(Double.toString(categoria.getPrecoDiaria()));
        jTdescricao.setText(categoria.getDescricao());
        
    }
        
    public void limparCampos(){
        jTnome.setText("");
        jTprecoDiaria.setText("");
        jTdescricao.setText("");
    }
}
