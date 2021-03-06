package visao;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btLocacao = new javax.swing.JToggleButton();
        btCliente = new javax.swing.JToggleButton();
        btCarro = new javax.swing.JToggleButton();
        btConserto = new javax.swing.JToggleButton();
        btRelatorio = new javax.swing.JToggleButton();
        btSair = new javax.swing.JToggleButton();
        jDprincipal = new javax.swing.JDesktopPane();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMarquivo = new javax.swing.JMenu();
        itperfil = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itSair = new javax.swing.JMenuItem();
        jMconserto = new javax.swing.JMenu();
        itCarro = new javax.swing.JMenuItem();
        itCategoria = new javax.swing.JMenuItem();
        itCliente = new javax.swing.JMenuItem();
        itConserto = new javax.swing.JMenuItem();
        itLocacao = new javax.swing.JMenuItem();
        itMarca = new javax.swing.JMenuItem();
        itModelo = new javax.swing.JMenuItem();
        itOficina = new javax.swing.JMenuItem();
        itServico = new javax.swing.JMenuItem();
        jMrelatorios = new javax.swing.JMenu();
        itRelatorioLocacao = new javax.swing.JMenuItem();
        jMsobre = new javax.swing.JMenu();
        itTutorial = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KoT - Locação de Carros  - v1.0");
        setFont(new java.awt.Font("Abel", 0, 12)); // NOI18N
        setResizable(false);

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);

        btLocacao.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btLocacao.setForeground(new java.awt.Color(102, 102, 102));
        btLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/locacao-48x48.png"))); // NOI18N
        btLocacao.setMnemonic('c');
        btLocacao.setText("Locações");
        btLocacao.setToolTipText("");
        btLocacao.setFocusable(false);
        btLocacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLocacao.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btLocacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btLocacao);

        btCliente.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btCliente.setForeground(new java.awt.Color(102, 102, 102));
        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente-48x48.png"))); // NOI18N
        btCliente.setText("Clientes");
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btCliente);

        btCarro.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btCarro.setForeground(new java.awt.Color(102, 102, 102));
        btCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carro-48x48.png"))); // NOI18N
        btCarro.setText("Carros");
        btCarro.setFocusable(false);
        btCarro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCarro.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btCarro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarroActionPerformed(evt);
            }
        });
        jToolBar1.add(btCarro);

        btConserto.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btConserto.setForeground(new java.awt.Color(102, 102, 102));
        btConserto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conserto-48x48.png"))); // NOI18N
        btConserto.setText("Consertos");
        btConserto.setFocusable(false);
        btConserto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConserto.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btConserto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btConserto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsertoActionPerformed(evt);
            }
        });
        jToolBar1.add(btConserto);

        btRelatorio.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btRelatorio.setForeground(new java.awt.Color(102, 102, 102));
        btRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio-48x48.png"))); // NOI18N
        btRelatorio.setText("Relatórios");
        btRelatorio.setFocusable(false);
        btRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRelatorio.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });
        jToolBar1.add(btRelatorio);

        btSair.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btSair.setForeground(new java.awt.Color(102, 102, 102));
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair-48x48.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btSair);

        javax.swing.GroupLayout jDprincipalLayout = new javax.swing.GroupLayout(jDprincipal);
        jDprincipal.setLayout(jDprincipalLayout);
        jDprincipalLayout.setHorizontalGroup(
            jDprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDprincipalLayout.setVerticalGroup(
            jDprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        jToolBar2.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Abel", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuário: ");
        jToolBar2.add(jLabel1);

        jLnome.setFont(new java.awt.Font("Abel", 0, 12)); // NOI18N
        jLnome.setForeground(new java.awt.Color(0, 0, 204));
        jLnome.setText("nomeaqui");
        jToolBar2.add(jLnome);

        jToolBar3.setRollover(true);

        jLabel3.setFont(new java.awt.Font("Abel", 0, 12)); // NOI18N
        jLabel3.setText("KoT");
        jToolBar3.add(jLabel3);

        jMenuBar1.setFont(new java.awt.Font("Abel", 0, 12)); // NOI18N

        jMarquivo.setMnemonic('s');
        jMarquivo.setText("Sistema");
        jMarquivo.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N

        itperfil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itperfil.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario-20x20.png"))); // NOI18N
        itperfil.setText("Meus dados");
        jMarquivo.add(itperfil);
        jMarquivo.add(jSeparator1);

        itSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itSair.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair-20x20.png"))); // NOI18N
        itSair.setText("Sair");
        jMarquivo.add(itSair);

        jMenuBar1.add(jMarquivo);

        jMconserto.setMnemonic('c');
        jMconserto.setText("Consultas");
        jMconserto.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jMconserto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMconsertoActionPerformed(evt);
            }
        });

        itCarro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itCarro.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carro-20x20.png"))); // NOI18N
        itCarro.setText("Carro");
        itCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itCarroActionPerformed(evt);
            }
        });
        jMconserto.add(itCarro);

        itCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itCategoria.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria-20x20.png"))); // NOI18N
        itCategoria.setText("Categoria");
        itCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itCategoriaActionPerformed(evt);
            }
        });
        jMconserto.add(itCategoria);

        itCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itCliente.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente-20x20.png"))); // NOI18N
        itCliente.setText("Cliente");
        itCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itClienteActionPerformed(evt);
            }
        });
        jMconserto.add(itCliente);

        itConserto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itConserto.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itConserto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conserto-20x20.png"))); // NOI18N
        itConserto.setText("Conserto");
        jMconserto.add(itConserto);

        itLocacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itLocacao.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/locacao-20x20.png"))); // NOI18N
        itLocacao.setText("Locação");
        jMconserto.add(itLocacao);

        itMarca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itMarca.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/marca-20x20.png"))); // NOI18N
        itMarca.setText("Marca");
        itMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itMarcaActionPerformed(evt);
            }
        });
        jMconserto.add(itMarca);

        itModelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itModelo.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/modelo-20x20.png"))); // NOI18N
        itModelo.setText("Modelo");
        itModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itModeloActionPerformed(evt);
            }
        });
        jMconserto.add(itModelo);

        itOficina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itOficina.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itOficina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/oficina-20x20.png"))); // NOI18N
        itOficina.setText("Oficina");
        itOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itOficinaActionPerformed(evt);
            }
        });
        jMconserto.add(itOficina);

        itServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itServico.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/servico-20x20.png"))); // NOI18N
        itServico.setText("Serviço");
        itServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itServicoActionPerformed(evt);
            }
        });
        jMconserto.add(itServico);

        jMenuBar1.add(jMconserto);

        jMrelatorios.setMnemonic('r');
        jMrelatorios.setText("Relatórios");
        jMrelatorios.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N

        itRelatorioLocacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itRelatorioLocacao.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itRelatorioLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/locacao-20x20.png"))); // NOI18N
        itRelatorioLocacao.setText("Locações");
        jMrelatorios.add(itRelatorioLocacao);

        jMenuBar1.add(jMrelatorios);

        jMsobre.setMnemonic('a');
        jMsobre.setText("Ajuda");
        jMsobre.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N

        itTutorial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itTutorial.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itTutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tutorial-20x20.png"))); // NOI18N
        itTutorial.setText("Tutorial");
        jMsobre.add(itTutorial);
        jMsobre.add(jSeparator2);

        itSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itSobre.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        itSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobre-20x20.png"))); // NOI18N
        itSobre.setText("Sobre");
        jMsobre.add(itSobre);

        jMenuBar1.add(jMsobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1368, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDprincipal)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itCategoriaActionPerformed
        TelaConsultarCategoria cat = new TelaConsultarCategoria();
        jDprincipal.add(cat);
        cat.setVisible(true);
    }//GEN-LAST:event_itCategoriaActionPerformed

    private void itMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMarcaActionPerformed
        // TODO add your handling code here:
        TelaConsultarMarca obj = new TelaConsultarMarca();
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_itMarcaActionPerformed

    private void itModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itModeloActionPerformed
        TelaConsultarModelo obj = new TelaConsultarModelo();
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_itModeloActionPerformed

    private void itClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itClienteActionPerformed
        TelaConsultarCliente obj = new TelaConsultarCliente();
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_itClienteActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        TelaConsultarCliente obj = new TelaConsultarCliente();
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_btClienteActionPerformed

    private void itOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itOficinaActionPerformed
        TelaConsultarOficina obj = new TelaConsultarOficina();
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_itOficinaActionPerformed

    private void itServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itServicoActionPerformed
        TelaConsultarServico obj = new TelaConsultarServico();
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_itServicoActionPerformed

    private void btCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarroActionPerformed
        TelaConsultarCarro obj = new TelaConsultarCarro();
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_btCarroActionPerformed

    private void itCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itCarroActionPerformed
        TelaConsultarCarro obj = new TelaConsultarCarro();
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_itCarroActionPerformed

    private void jMconsertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMconsertoActionPerformed
        TelaCadastroConserto obj = new TelaCadastroConserto(null, true);
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMconsertoActionPerformed

    private void btConsertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsertoActionPerformed
        TelaCadastroConserto obj = new TelaCadastroConserto(null, true);
        jDprincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_btConsertoActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        // TODO add your handling code here:
        TelaBuscarModelo buscarModelo = new TelaBuscarModelo();
        jDprincipal.add(buscarModelo);
        buscarModelo.setVisible(true);
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int opcaoExc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do KoT ? ", "Logoff" ,JOptionPane.YES_NO_OPTION);
        if(opcaoExc == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btCarro;
    private javax.swing.JToggleButton btCliente;
    private javax.swing.JToggleButton btConserto;
    private javax.swing.JToggleButton btLocacao;
    private javax.swing.JToggleButton btRelatorio;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JMenuItem itCarro;
    private javax.swing.JMenuItem itCategoria;
    private javax.swing.JMenuItem itCliente;
    private javax.swing.JMenuItem itConserto;
    private javax.swing.JMenuItem itLocacao;
    private javax.swing.JMenuItem itMarca;
    private javax.swing.JMenuItem itModelo;
    private javax.swing.JMenuItem itOficina;
    private javax.swing.JMenuItem itRelatorioLocacao;
    private javax.swing.JMenuItem itSair;
    private javax.swing.JMenuItem itServico;
    private javax.swing.JMenuItem itSobre;
    private javax.swing.JMenuItem itTutorial;
    private javax.swing.JMenuItem itperfil;
    public static javax.swing.JDesktopPane jDprincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLnome;
    private javax.swing.JMenu jMarquivo;
    private javax.swing.JMenu jMconserto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMrelatorios;
    private javax.swing.JMenu jMsobre;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables
}
