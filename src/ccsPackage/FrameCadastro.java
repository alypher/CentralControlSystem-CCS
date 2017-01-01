/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccsPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alyph
 */
public class FrameCadastro extends javax.swing.JDialog {

    /**
     * Creates new form FrameRelatorio
     */
    public FrameCadastro() {
        initComponents();
        this.setModal(true);
        
        this.setIconImage(new ImageIcon("C:\\CentralControlSystem\\src\\ccsImagens\\Icons\\iconRelatorio.png").getImage());
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("teste?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        comprasQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Compras c");
        comprasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : comprasQuery.getResultList();
        cadastroQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cadastro c");
        cadastroList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastroQuery.getResultList();
        cadastroQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cadastro c");
        cadastroList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastroQuery1.getResultList();
        btnIncluirCadastro = new javax.swing.JButton();
        txtDescricaoCadastro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPaneCompras = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        labelCompra = new javax.swing.JLabel();
        btnFecharCadastro = new javax.swing.JButton();
        txtCodigoCadastro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Central Control System - Cadastro");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(575, 367));
        setMinimumSize(new java.awt.Dimension(575, 367));

        btnIncluirCadastro.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnIncluirCadastro.setText("Incluir");
        btnIncluirCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluirCadastroMouseClicked(evt);
            }
        });
        btnIncluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirCadastroActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        tblCompras.setDropMode(javax.swing.DropMode.INSERT);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cadastroList1, tblCompras);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tblCompras.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tblComprasVetoableChange(evt);
            }
        });
        jScrollPaneCompras.setViewportView(tblCompras);

        jLabel7.setText("Codigo");

        labelCompra.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        labelCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCompra.setText("Cadastro");

        btnFecharCadastro.setText("Fechar");
        btnFecharCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharCadastroMouseClicked(evt);
            }
        });
        btnFecharCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCadastroActionPerformed(evt);
            }
        });

        txtCodigoCadastro.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFecharCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(335, 335, 335)
                                .addComponent(btnIncluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPaneCompras, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(txtCodigoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDescricaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelCompra)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirCadastroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIncluirCadastroMouseClicked

    private void btnIncluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirCadastroActionPerformed

        String codigo = txtCodigoCadastro.getText();
        String descricao = txtDescricaoCadastro.getText();

        try {
            // cria uma variavel de conexão
            Connection con;

            // cria "pega" uma conexão com o banco
            con = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "admin");

            // cria a string para inserir no banco
            String query = "INSERT INTO cadastro (codigo, descricao) VALUES (?,?)";

            // cria o comando
            PreparedStatement stmt = con.prepareStatement(query);

            // set os valores na String de inserção
            stmt.setString(1, codigo);
            stmt.setString(2, descricao);

            // executa o comando no banco de dados
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");

            // fecha o comando e a conexão
            stmt.close();
            con.close();

        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possível gravar os dados.");
            System.out.println("Ocorreu um erro de SQL");
        }

        txtCodigoCadastro.setText("");
        txtDescricaoCadastro.setText("");

        updateTable();


    }//GEN-LAST:event_btnIncluirCadastroActionPerformed

    public void updateTable(){

        cadastroList =  cadastroQuery.getResultList();
        tblCompras = new javax.swing.JTable();
        tblCompras.setDropMode(javax.swing.DropMode.INSERT);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cadastroList, tblCompras);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tblCompras.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tblComprasVetoableChange(evt);
            }
        });

        jScrollPaneCompras.setViewportView(tblCompras);

    }
    
    private void tblComprasVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_tblComprasVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblComprasVetoableChange

    private void btnFecharCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharCadastroMouseClicked

        int opcao = JOptionPane.showConfirmDialog(null,"Realmente deseja sair?","Central Control System - Compra", JOptionPane.YES_NO_CANCEL_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();
        }
        else if (opcao == JOptionPane.NO_OPTION){
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }
    }//GEN-LAST:event_btnFecharCadastroMouseClicked

    private void btnFecharCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharCadastro;
    private javax.swing.JButton btnIncluirCadastro;
    private java.util.List<ccsPackage.Cadastro> cadastroList;
    private java.util.List<ccsPackage.Cadastro> cadastroList1;
    private javax.persistence.Query cadastroQuery;
    private javax.persistence.Query cadastroQuery1;
    private java.util.List<ccsPackage.Compras> comprasList;
    private javax.persistence.Query comprasQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPaneCompras;
    private javax.swing.JLabel labelCompra;
    private javax.swing.JTable tblCompras;
    private javax.swing.JTextField txtCodigoCadastro;
    private javax.swing.JTextField txtDescricaoCadastro;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
