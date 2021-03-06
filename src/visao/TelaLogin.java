package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.bean.Funcionario;
import modelo.dao.FuncionarioDao;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTlogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTsenha = new javax.swing.JPasswordField();
        jTentrar = new javax.swing.JToggleButton();
        jTfechar = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 94, 120));
        setLocation(new java.awt.Point(400, 80));
        setName("telaLogin"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(420, 480));
        setSize(new java.awt.Dimension(420, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/locacao_carros.png"))); // NOI18N
        jLabel1.setOpaque(true);

        jTlogin.setForeground(new java.awt.Color(102, 102, 102));
        jTlogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTlogin.setToolTipText("Login");
        jTlogin.setBorder(null);
        jTlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTlogin.setMinimumSize(new java.awt.Dimension(40, 20));
        jTlogin.setName("Login"); // NOI18N
        jTlogin.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTlogin.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTlogin.setVerifyInputWhenFocusTarget(false);
        jTlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTloginActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(187, 117, 55));
        jLabel2.setText("Login");

        jLabel3.setForeground(new java.awt.Color(187, 117, 55));
        jLabel3.setText("Senha");

        jTsenha.setForeground(new java.awt.Color(102, 102, 102));
        jTsenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTsenha.setToolTipText("Senha");
        jTsenha.setBorder(null);
        jTsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTsenhaActionPerformed(evt);
            }
        });

        jTentrar.setForeground(new java.awt.Color(102, 102, 102));
        jTentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/entrar.png"))); // NOI18N
        jTentrar.setBorder(null);
        jTentrar.setBorderPainted(false);
        jTentrar.setContentAreaFilled(false);
        jTentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTentrarActionPerformed(evt);
            }
        });

        jTfechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar-2.png"))); // NOI18N
        jTfechar.setBorder(null);
        jTfechar.setBorderPainted(false);
        jTfechar.setContentAreaFilled(false);
        jTfechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTfechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfecharActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Abel", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(187, 117, 55));
        jLabel4.setText("Locação de Carros - KoT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTentrar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTfechar))
                                .addComponent(jTsenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jTlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jTsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfechar, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(680, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTloginActionPerformed
        realizarLogin();
    }//GEN-LAST:event_jTloginActionPerformed

    private void jTfecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jTfecharActionPerformed

    private void jTentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTentrarActionPerformed
        realizarLogin();
    }//GEN-LAST:event_jTentrarActionPerformed

    private void jTsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTsenhaActionPerformed
        realizarLogin();
    }//GEN-LAST:event_jTsenhaActionPerformed

    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jTentrar;
    private javax.swing.JToggleButton jTfechar;
    private javax.swing.JTextField jTlogin;
    private javax.swing.JPasswordField jTsenha;
    // End of variables declaration//GEN-END:variables

    private void realizarLogin(){
        String login = jTlogin.getText();
        String senha = String.valueOf(jTsenha.getPassword());        
        Funcionario funcionario = new Funcionario();
        FuncionarioDao funDao = new FuncionarioDao();
        
        try {
            funcionario = funDao.validarLogin(login, senha);
            if(funcionario == null){
                JOptionPane.showMessageDialog(null, "Login ou senha inválidos.");
                jTlogin.requestFocus();
            }else{
                TelaPrincipal obj = new TelaPrincipal();
                dispose();
                obj.setVisible(true);
                JOptionPane.showMessageDialog(null, "Bem vindo ao KoT " + funcionario.getNome() );
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao validar login: "+ ex);
        }
        
    }
}
