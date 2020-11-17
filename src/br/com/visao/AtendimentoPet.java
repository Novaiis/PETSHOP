/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao;

/**
 *
 * @author Lucas
 */
import br.com.controle.Servico;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AtendimentoPet extends javax.swing.JFrame {

    Servico s = new Servico();

    public AtendimentoPet() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabServico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLtotal = new javax.swing.JLabel();
        jBcadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLalto = new javax.swing.JLabel();
        jCservicos = new javax.swing.JComboBox<>();
        jTnome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabServico.setBackground(new java.awt.Color(204, 153, 0));
        jTabServico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTabServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do pet", "Serviço e preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabServico);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome do Pet:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Escolha o serviço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Total recebido:");

        jLtotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLtotal.setForeground(new java.awt.Color(204, 0, 0));
        jLtotal.setText("0.00");

        jBcadastrar.setBackground(new java.awt.Color(204, 153, 0));
        jBcadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBcadastrar.setText("Cadastrar Pet");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Serviço mais caro:");

        jLalto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLalto.setForeground(new java.awt.Color(204, 0, 0));
        jLalto.setText("0.00");

        jCservicos.setBackground(new java.awt.Color(102, 255, 255));
        jCservicos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCservicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Serviços", "Banho\t R$50,00", "Tosa\t R$50,00", "Banho e tosa R$90,00" }));

        jTnome.setColumns(16);
        jTnome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTnomeKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("PET'S & CIA");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("R$");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBcadastrar)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLalto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLtotal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCservicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCservicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBcadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLalto)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtotal)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        try {
            if (jTnome.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Dite o nome do pet!");
                jTnome.requestFocus();
            } else if (jCservicos.getSelectedItem().equals("Serviços")) {

                JOptionPane.showMessageDialog(null, "Escolha um serviço válido!");
                jCservicos.requestFocus();
                
            } else if (jCservicos.getSelectedItem().equals("Banho	 R$50,00")) {

                s.setNome(jTnome.getText());
                s.setSeletor((String) jCservicos.getSelectedItem());
                DefaultTableModel dados = (DefaultTableModel) jTabServico.getModel();
                dados.addRow(new Object[]{s.getNome(), s.getSeletor()});
                jTnome.setText(null);
                jCservicos.setSelectedItem("Serviços");
                jTnome.requestFocus();
                
                s.setValorServico(50);
                s.setQuantidade(50);

            } else if (jCservicos.getSelectedItem().equals("Tosa	 R$50,00")) {

                s.setNome(jTnome.getText());
                s.setSeletor((String) jCservicos.getSelectedItem());
                DefaultTableModel dados = (DefaultTableModel) jTabServico.getModel();
                dados.addRow(new Object[]{s.getNome(), s.getSeletor()});
                jTnome.setText(null);
                jCservicos.setSelectedItem("Serviços");
                jTnome.requestFocus();

                s.setValorServico(50);
                s.setQuantidade(50);
            } else if (jCservicos.getSelectedItem().equals("Banho e tosa R$90,00")) {

                s.setNome(jTnome.getText());
                s.setSeletor((String) jCservicos.getSelectedItem());
                DefaultTableModel dados = (DefaultTableModel) jTabServico.getModel();
                dados.addRow(new Object[]{s.getNome(), s.getSeletor()});
                jTnome.setText(null);
                jCservicos.setSelectedItem("Serviços");
                jTnome.requestFocus();
                
                s.setValorServico(90);
                s.setQuantidade(90);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "apenas letras!");
        }

        jLtotal.setText("" + s.getQuantidade());
        jLalto.setText("" + s.getValorServico());
    }//GEN-LAST:event_jBcadastrarActionPerformed

    private void jTnomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnomeKeyReleased
        jTnome.setText(jTnome.getText().replaceAll("[^a-z^A-Z]", ""));
    }//GEN-LAST:event_jTnomeKeyReleased

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
            java.util.logging.Logger.getLogger(AtendimentoPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtendimentoPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtendimentoPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtendimentoPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtendimentoPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JComboBox<String> jCservicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLalto;
    private javax.swing.JLabel jLtotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabServico;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
