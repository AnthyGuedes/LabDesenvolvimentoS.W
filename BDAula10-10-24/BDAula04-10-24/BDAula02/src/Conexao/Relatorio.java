/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Conexao;

import Beans.Pessoa;
import Beans.PessoaDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author laboratorio
 */
public class Relatorio extends javax.swing.JFrame {
    
    
    public void preencheTabela() {
    String sexo = "";
    PessoaDAO pDAO = new PessoaDAO();
    if (rdoMasculino.isSelected())
        sexo = "M";
    else if (rdoFeminino.isSelected())
        sexo = "F";
    else
        sexo = "";

    List<Pessoa> listaPessoas = pDAO.getPessoasNome(txtNome.getText(), sexo);
    DefaultTableModel tabelaPessoas = (DefaultTableModel) tblPessoa.getModel();

    tabelaPessoas.setNumRows(0);

    for (Pessoa p : listaPessoas) {
        Object[] obj = new Object[]{
            p.getId(),
            p.getNome(),
            p.getSexo(),
            p.getIdioma()
        };
        tabelaPessoas.addRow(obj);
    }
}
    
    
    
    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();
        preencheTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpSexo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoa = new javax.swing.JTable();
        lblRelatorio = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        rdoMasculino = new javax.swing.JRadioButton();
        rdoFeminino = new javax.swing.JRadioButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sexo", "Idioma"
            }
        ));
        jScrollPane1.setViewportView(tblPessoa);

        lblRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRelatorio.setText("Relatório das Pessoas");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNomeCaretUpdate(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnGrpSexo.add(rdoMasculino);
        rdoMasculino.setText("Masculino");
        rdoMasculino.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdoMasculinoStateChanged(evt);
            }
        });
        rdoMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMasculinoActionPerformed(evt);
            }
        });

        btnGrpSexo.add(rdoFeminino);
        rdoFeminino.setText("Feminino");
        rdoFeminino.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdoFemininoStateChanged(evt);
            }
        });
        rdoFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFemininoActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRelatorio)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoMasculino)
                    .addComponent(rdoFeminino))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRelatorio)
                    .addComponent(rdoMasculino)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
        preencheTabela();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNomeCaretUpdate
        // TODO add your handling code here:
        preencheTabela();
    }//GEN-LAST:event_txtNomeCaretUpdate

    private void rdoMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMasculinoActionPerformed
        // TODO add your handling code here:
        preencheTabela();
    }//GEN-LAST:event_rdoMasculinoActionPerformed

    private void rdoFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFemininoActionPerformed
        // TODO add your handling code here:
        preencheTabela();
    }//GEN-LAST:event_rdoFemininoActionPerformed

    private void rdoMasculinoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdoMasculinoStateChanged
        // TODO add your handling code here:
        preencheTabela();
    }//GEN-LAST:event_rdoMasculinoStateChanged

    private void rdoFemininoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdoFemininoStateChanged
        // TODO add your handling code here:
        preencheTabela();
    }//GEN-LAST:event_rdoFemininoStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        btnGrpSexo.clearSelection();
        preencheTabela();
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpSexo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRelatorio;
    private javax.swing.JRadioButton rdoFeminino;
    private javax.swing.JRadioButton rdoMasculino;
    private javax.swing.JTable tblPessoa;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
