package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.bean.Modelo;
import modelo.dao.ModeloDao;
import util.Utilitarios;

public class TelaBuscarModelo extends javax.swing.JInternalFrame {

    public TelaBuscarModelo() {
        initComponents();
        Utilitarios.listarMarca(cbMarca);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jTmodelo = new javax.swing.JTextField();
        cbMarca = new javax.swing.JComboBox<>();
        bTbuscar = new javax.swing.JToggleButton();
        bTalterar = new javax.swing.JToggleButton();
        bTexcluir = new javax.swing.JToggleButton();
        bTnovabusca = new javax.swing.JToggleButton();

        jLabel1.setText("Código");

        jLabel2.setText("Modelo");

        jLabel3.setText("Marca");

        jTcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodigoActionPerformed(evt);
            }
        });

        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a marca desejada" }));

        bTbuscar.setText("Buscar");
        bTbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bTbuscar)
                                        .addGap(16, 16, 16))
                                    .addComponent(jLabel3))
                                .addComponent(jTmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTbuscar))
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bTalterar.setText("Alterar");
        bTalterar.setEnabled(false);
        bTalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTalterarActionPerformed(evt);
            }
        });

        bTexcluir.setText("Excluir");
        bTexcluir.setEnabled(false);
        bTexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTexcluirActionPerformed(evt);
            }
        });

        bTnovabusca.setText("Nova Busca");
        bTnovabusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTnovabuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bTnovabusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bTexcluir)
                .addGap(18, 18, 18)
                .addComponent(bTalterar)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTalterar)
                    .addComponent(bTexcluir)
                    .addComponent(bTnovabusca))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }

    private void bTbuscarActionPerformed(java.awt.event.ActionEvent evt) {
        buscar();
    }

    private void jTcodigoActionPerformed(java.awt.event.ActionEvent evt) {
        buscar();
    }

    private void bTnovabuscaActionPerformed(java.awt.event.ActionEvent evt) {
        jTcodigo.setEditable(true);
        jTcodigo.requestFocus();
        jTcodigo.setText("");
        jTmodelo.setText("");
        cbMarca.setSelectedIndex(0);
        bTalterar.setEnabled(false);
        bTexcluir.setEnabled(false);
    }

    private void bTexcluirActionPerformed(java.awt.event.ActionEvent evt) {
        excluir();
    }

    private void bTalterarActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JToggleButton bTalterar;
    private javax.swing.JToggleButton bTbuscar;
    private javax.swing.JToggleButton bTexcluir;
    private javax.swing.JToggleButton bTnovabusca;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTmodelo;

private void buscar(){
    int codigo = Integer.parseInt(jTcodigo.getText());
        try {
            Modelo modelo = new ModeloDao().buscarCodigo(codigo);
            if(modelo == null){
                JOptionPane.showMessageDialog(null, "Nao encontrado");
            }else{
                jTmodelo.setText(modelo.getDescricao());
                cbMarca.getModel().setSelectedItem(modelo.getMarca());
                jTcodigo.setEditable(false);
                jTmodelo.requestFocus();
                bTalterar.setEnabled(true);
                bTexcluir.setEnabled(true);
                bTnovabusca.setEnabled(true);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar "+ex.getMessage());
        }
        
}
private void excluir(){
    int codigo = Integer.parseInt(jTcodigo.getText());
    
}
    
}
