/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursoemvideo.calc;

import java.text.DecimalFormat;

/**
 *
 * @author uisla
 */
public class SuperCalc extends javax.swing.JFrame {

    /**
     * Creates new form SuperCalc
     */
    public SuperCalc() { //Construtor
        initComponents();
        panCalc.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNum = new javax.swing.JSpinner();
        bntCalc = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        panCalc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblResto = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblRaizQ = new javax.swing.JLabel();
        lblRaizC = new javax.swing.JLabel();
        lblAbs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Super Calculadora");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Informe um valor:");

        bntCalc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bntCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cursoemvideo/calc/Imagens/Calc2.jpg"))); // NOI18N
        bntCalc.setText("Calcular");
        bntCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCalcActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cursoemvideo/calc/Imagens/CalcCorreta.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Resto da divisão");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Elevado ao Cubo");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Raiz Quadrada");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Raiz Cubica");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Valor Absoluto");

        lblResto.setBackground(new java.awt.Color(0, 51, 255));
        lblResto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblResto.setText("0");

        lblCubo.setBackground(new java.awt.Color(0, 51, 255));
        lblCubo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCubo.setText("0");

        lblRaizQ.setBackground(new java.awt.Color(0, 51, 255));
        lblRaizQ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRaizQ.setText("0");

        lblRaizC.setBackground(new java.awt.Color(0, 51, 255));
        lblRaizC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRaizC.setText("0");

        lblAbs.setBackground(new java.awt.Color(0, 51, 255));
        lblAbs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAbs.setText("0");

        javax.swing.GroupLayout panCalcLayout = new javax.swing.GroupLayout(panCalc);
        panCalc.setLayout(panCalcLayout);
        panCalcLayout.setHorizontalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResto))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAbs))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCubo))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRaizQ))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRaizC)))
                .addContainerGap())
        );
        panCalcLayout.setVerticalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblResto))
                .addGap(35, 35, 35)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCubo))
                .addGap(35, 35, 35)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblRaizQ))
                .addGap(35, 35, 35)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblRaizC))
                .addGap(35, 35, 35)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblAbs))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(bntCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCalc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCalcActionPerformed
        // TODO add your handling code here:
        //Feitos do professor

        /*DecimalFormat deci = new DecimalFormat("0.00");
        int idvalor = Integer.parseInt(txtValor.getValue().toString());
        int div = idvalor % 2;
        double exp = Math.pow(idvalor,3);
        double raizq = Math.sqrt(idvalor);
        double raizc = Math.cbrt(idvalor);
        int valorab = Math.abs(idvalor);

        lblResDiv.setText(Integer.toString(div));
        lblCubo.setText(Double.toString(exp));
        lblRaizQ.setText(Double.toString(raizq));
        lblRaizC.setText(Double.toString(raizc));
        lblValorAb.setText(Integer.toString(valorab));*/

    }//GEN-LAST:event_bntCalcActionPerformed

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
            java.util.logging.Logger.getLogger(SuperCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAbs;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblRaizC;
    private javax.swing.JLabel lblRaizQ;
    private javax.swing.JLabel lblResto;
    private javax.swing.JPanel panCalc;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
