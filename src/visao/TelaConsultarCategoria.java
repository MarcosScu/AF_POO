package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Categoria;
import modelo.dao.CategoriaDao;

public class TelaConsultarCategoria extends javax.swing.JInternalFrame {


    private static final long serialVersionUID = 1L;

    public TelaConsultarCategoria() {
        initComponents();
        listarCategoria();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbResultado = new javax.swing.JLabel();
        btBuscar = new javax.swing.JToggleButton();
        jtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCategoria = new javax.swing.JTable();
        lbLogo = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JToggleButton();
        lbBuscar = new javax.swing.JLabel();
        btVisualizar = new javax.swing.JToggleButton();
        btInserir = new javax.swing.JToggleButton();
        btAlterar = new javax.swing.JToggleButton();
        btExcluir = new javax.swing.JToggleButton();

        setBorder(null);
        setClosable(true);
        setTitle("KoT - Categorias");
        setToolTipText("");
        setFont(new java.awt.Font("Abel", 0, 12)); 
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria-20x20.png"))); 
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        lbResultado.setFont(new java.awt.Font("Abel", 0, 12)); 
        lbResultado.setForeground(new java.awt.Color(102, 102, 255));

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa-20x20.png"))); 
        btBuscar.setToolTipText("Buscar");
        btBuscar.setBorder(null);
        btBuscar.setContentAreaFilled(false);
        btBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jtBuscar.setColumns(5);
        jtBuscar.setFont(new java.awt.Font("Abel", 0, 14)); 
        jtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtBuscar.setBorder(null);

        tbCategoria.setFont(new java.awt.Font("Abel", 0, 14)); 
        tbCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço da Diária", "Descrição"
            }
        ) {
            
            private static final long serialVersionUID = 1L;
            boolean[] canEdit = new boolean[] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCategoria.setToolTipText("");
        tbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCategoria);

        lbLogo.setFont(new java.awt.Font("Abel", 0, 14)); 
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria-48x48.png"))); 
        lbLogo.setText("Categorias");
        lbLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLogo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar-20x20.png"))); 
        btAtualizar.setToolTipText("Atualizar lista");
        btAtualizar.setBorder(null);
        btAtualizar.setContentAreaFilled(false);
        btAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        lbBuscar.setFont(new java.awt.Font("Abel", 1, 14)); 
        lbBuscar.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAtualizar))
                            .addComponent(lbResultado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLogo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbBuscar))
                            .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResultado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btVisualizar.setFont(new java.awt.Font("Abel", 0, 14)); 
        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list-35x35.png"))); 
        btVisualizar.setText("Visualizar");
        btVisualizar.setBorder(null);
        btVisualizar.setBorderPainted(false);
        btVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVisualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVisualizar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        btInserir.setFont(new java.awt.Font("Abel", 0, 14)); 
        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plus-35-35.png"))); 
        btInserir.setText("Inserir");
        btInserir.setBorder(null);
        btInserir.setBorderPainted(false);
        btInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btInserir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Abel", 0, 14)); 
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil-35x35.png"))); 
        btAlterar.setText("Alterar");
        btAlterar.setBorder(null);
        btAlterar.setBorderPainted(false);
        btAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlterar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Abel", 0, 14)); 
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-35x35.png"))); 
        btExcluir.setText("Excluir");
        btExcluir.setBorder(null);
        btExcluir.setBorderPainted(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVisualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(88, Short.MAX_VALUE)
                        .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        setBounds(0, 0, 724, 470);
    }
    Categoria categoria = new Categoria();
    CategoriaDao categoriaDao = new CategoriaDao();
    
    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {
        int celula = tbCategoria.getSelectedRow();
     
        if(celula == -1){
            JOptionPane.showMessageDialog(null, "Selecione um registro !");
        }else{
            TelaVisualizarCategoria obj = new TelaVisualizarCategoria(null, true);
                   
            categoria.setCodigo((int) tbCategoria.getModel().getValueAt(celula, 0));
            categoria.setNome(tbCategoria.getModel().getValueAt(celula, 1).toString());
            categoria.setPrecoDiaria((Double) tbCategoria.getModel().getValueAt(celula, 2));
            categoria.setDescricao(tbCategoria.getModel().getValueAt(celula, 3).toString());
            
            obj.receberDados(categoria);
            obj.setVisible(true);

        }
    }

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCadastroCategoria obj = new TelaCadastroCategoria(null, true);
        obj.setVisible(true);
        listarCategoria();
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        deletar();
        
        listarCategoria();
    }

    private void formFocusGained(java.awt.event.FocusEvent evt) {
        listarCategoria();
    }

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        int celula = tbCategoria.getSelectedRow();
        
        if(celula == -1){
            JOptionPane.showMessageDialog(null, "Selecione um registro !");
        }else{
            TelaEditarCategoria obj = new TelaEditarCategoria(null, true);
                   
            categoria.setCodigo((int) tbCategoria.getModel().getValueAt(celula, 0));
            categoria.setNome(tbCategoria.getModel().getValueAt(celula, 1).toString());
            categoria.setPrecoDiaria((Double) tbCategoria.getModel().getValueAt(celula, 2));
            categoria.setDescricao(tbCategoria.getModel().getValueAt(celula, 3).toString());
            
            obj.receberDados(categoria);
            obj.setVisible(true);
            listarCategoria();
        }
    }

    private void tbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {
        int celula = tbCategoria.getSelectedRow();

        categoria.setCodigo((int) tbCategoria.getModel().getValueAt(celula, 0));
        categoria.setNome(tbCategoria.getModel().getValueAt(celula, 1).toString());
        categoria.setPrecoDiaria(Double.parseDouble(tbCategoria.getModel().getValueAt(celula, 2).toString()));
        categoria.setDescricao(tbCategoria.getModel().getValueAt(celula, 3).toString());
    }

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        jtBuscar.setText("");
        jtBuscar.requestFocus();
        lbResultado.setText("");
        listarCategoria();
    }

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        buscarCategoria();
        jtBuscar.requestFocus();
    }

    private javax.swing.JToggleButton btAlterar;
    private javax.swing.JToggleButton btAtualizar;
    private javax.swing.JToggleButton btBuscar;
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.JToggleButton btInserir;
    private javax.swing.JToggleButton btVisualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JTable tbCategoria;
    public void listarCategoria(){
        try {
         
            List<Categoria> lista = new CategoriaDao().listar();        
            DefaultTableModel tabela = (DefaultTableModel) tbCategoria.getModel();
            
            tbCategoria.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbCategoria.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbCategoria.getColumnModel().getColumn(2).setPreferredWidth(5);
            tbCategoria.getColumnModel().getColumn(3).setPreferredWidth(5);
            tabela.setNumRows(0);
            
            for(Categoria categoria: lista){
                tabela.addRow(new Object[]{categoria.getCodigo(),categoria.getNome(), categoria.getPrecoDiaria(), categoria.getDescricao()});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar."+ex.getMessage());
        }
    }

    public void buscarCategoria(){
        try {
            String busca = jtBuscar.getText();
            List<Categoria> lista = new CategoriaDao().buscar(busca);
            if(lista.isEmpty()){
                JOptionPane.showMessageDialog(null, "Não há resultados para : "+ busca);
            }else{
                DefaultTableModel tabela = (DefaultTableModel) tbCategoria.getModel();
                lbResultado.setText(lista.size() + " resultado(s) encontrado(s).");

                tabela.setNumRows(0);

                for(Categoria categoria: lista){
                    tabela.addRow(new Object[]{categoria.getCodigo(), categoria.getNome(), categoria.getPrecoDiaria(), categoria.getDescricao()});
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar busca."+ex.getMessage());
        }
    }
    
    private void deletar(){
        int celula = tbCategoria.getSelectedRow();
        int codigo = (int) tbCategoria.getModel().getValueAt(celula, 0);
        try {
            
            int opcaoExc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja EXCLUIR a categoria: "+categoria.getNome(), "Exclusão" ,JOptionPane.YES_NO_OPTION);
            
            if(opcaoExc == JOptionPane.YES_OPTION){
                categoriaDao.deletar(codigo);
                JOptionPane.showMessageDialog(this, "Deletado com sucesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao deletar "+ex.getMessage());
        }
    }
}
