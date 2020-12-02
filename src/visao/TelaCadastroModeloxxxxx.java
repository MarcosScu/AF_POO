package visao;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.bean.Marca;
import modelo.bean.Modelo;
import modelo.dao.MarcaDao;
import modelo.dao.ModeloDao;

public class TelaCadastroModeloxxxxx extends javax.swing.JInternalFrame {
  
    public TelaCadastroModeloxxxxx() {
        initComponents();
        listarMarca(cbMarca);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        cbMarca = new javax.swing.JComboBox<>();
        jBsalvar = new javax.swing.JToggleButton();
        btCadastrarMarca = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastro de Modelo");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setFont(new java.awt.Font("Abel", 0, 14)); 
        jLabel1.setText("Nome *");

        jLabel2.setFont(new java.awt.Font("Abel", 0, 14)); 
        jLabel2.setText("Marca *");

        txNome.setFont(new java.awt.Font("Abel", 0, 14)); 

        cbMarca.setFont(new java.awt.Font("Abel", 0, 14)); 
        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Marca" }));

        jBsalvar.setFont(new java.awt.Font("Abel", 0, 14)); 
        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-30x30.png"))); 
        jBsalvar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jBsalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBsalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });

        btCadastrarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plus-20-20.png"))); 
        btCadastrarMarca.setBorder(null);
        btCadastrarMarca.setContentAreaFilled(false);
        btCadastrarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBsalvar)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCadastrarMarca))
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCadastrarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jBsalvar)
                .addGap(14, 14, 14))
        );

        jLabel3.setFont(new java.awt.Font("Abel", 0, 10)); 
        jLabel3.setText("(*) Campos obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {

        if(txNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Favor, preencher campo 'Descrição'.");
            txNome.requestFocus();
        }else if(cbMarca.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Favor selecionar 'Marca'.");
            cbMarca.requestFocus();
        }else{
            inserir();
        }
            
    }

    private void btCadastrarMarcaActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCadastroMarca obj = new TelaCadastroMarca(null, true);
        TelaPrincipal.jDprincipal.add(obj);
        obj.setVisible(true);
    }

    private javax.swing.JToggleButton btCadastrarMarca;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JToggleButton jBsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txNome;

    Modelo modelo = new Modelo();
    ModeloDao modeloDao = new ModeloDao();
    
    private void inserir(){
        Marca marca = (Marca) cbMarca.getSelectedItem();
        modelo.setDescricao(txNome.getText());
        modelo.setMarca(marca);
        try {
            modeloDao.inserir(modelo);
            txNome.setText("");
            cbMarca.setSelectedIndex(0);
            txNome.requestFocus();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
               
    }
    
    private void listarMarca(JComboBox combo){
        try {
            List<Marca> lista = new MarcaDao().listar();
            for (Marca marca : lista){
                combo.addItem(marca);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar: " + ex.getMessage());
        }       
    }
}