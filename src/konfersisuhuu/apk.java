/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package konfersisuhuu;

/**
 *
 * @author HP
 */
public class apk extends javax.swing.JFrame {

    /**
     * Creates new form apk
     */
    public apk() {
        initComponents();
        reset();
    }
    void reset(){
    tsuhuasal.setText("");
    vhasil.setText("");
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tsuhuasal = new javax.swing.JTextField();
        tskalaasal = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        tskalatujuan = new javax.swing.JComboBox<>();
        tkonversi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        vhasil = new javax.swing.JLabel();
        breseat = new javax.swing.JButton();
        bclose = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(91, 50, 144, 25);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("suhu asal"));

        tsuhuasal.setBackground(new java.awt.Color(153, 204, 255));
        tsuhuasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsuhuasalActionPerformed(evt);
            }
        });

        tskalaasal.setBackground(new java.awt.Color(102, 153, 255));
        tskalaasal.setForeground(new java.awt.Color(51, 51, 51));
        tskalaasal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "celcius", "kelvin", "farenhard" }));
        tskalaasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tskalaasalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tskalaasal, 0, 192, Short.MAX_VALUE)
                    .addComponent(tsuhuasal))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tsuhuasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tskalaasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(56, 93, 214, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("konversi ke"));

        tskalatujuan.setBackground(new java.awt.Color(102, 153, 255));
        tskalatujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "celcius", "kelvin", "farenhard" }));
        tskalatujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tskalatujuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tskalatujuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tskalatujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(56, 184, 214, 60);

        tkonversi.setBackground(new java.awt.Color(0, 102, 102));
        tkonversi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tkonversi.setText("KONVERSI");
        tkonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkonversiActionPerformed(evt);
            }
        });
        getContentPane().add(tkonversi);
        tkonversi.setBounds(56, 257, 214, 23);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("hasil"));

        vhasil.setBackground(new java.awt.Color(102, 153, 255));
        vhasil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vhasil.setText("j");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vhasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vhasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(56, 286, 214, 132);

        breseat.setBackground(new java.awt.Color(255, 51, 51));
        breseat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        breseat.setText("RESET");
        breseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breseatActionPerformed(evt);
            }
        });
        getContentPane().add(breseat);
        breseat.setBounds(56, 424, 94, 23);

        bclose.setBackground(new java.awt.Color(255, 153, 51));
        bclose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bclose.setText("CLOSE");
        bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcloseActionPerformed(evt);
            }
        });
        getContentPane().add(bclose);
        bclose.setBounds(178, 424, 92, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tsuhuasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsuhuasalActionPerformed
    }//GEN-LAST:event_tsuhuasalActionPerformed

    private void tskalaasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tskalaasalActionPerformed
    }//GEN-LAST:event_tskalaasalActionPerformed

    private void tskalatujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tskalatujuanActionPerformed

    }//GEN-LAST:event_tskalatujuanActionPerformed

    private void breseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breseatActionPerformed

        reset();
    }//GEN-LAST:event_breseatActionPerformed

    private void bcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bcloseActionPerformed

    private void tkonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkonversiActionPerformed
        // TODO add your handling code here:
        double suhuasal= Double.parseDouble(tsuhuasal.getText());
        String skalaasal= tskalaasal.getSelectedItem().toString();
        String skalatujuan = tskalatujuan.getSelectedItem().toString();
        double Hasil = 0.0;
        if (skalaasal.equals("celcius")&& skalatujuan.equals("celcius")) {
            Hasil = suhuasal; 
            
        } else if (skalaasal.equals("celcius")&& skalatujuan.equals("kelvin")){
            Hasil = suhuasal + 273.15;
            
        }else if (skalaasal.equals("celcius")&& skalatujuan.equals("farenhard")){
            Hasil = suhuasal * 9/5 +32;
            
        }else if (skalaasal.equals("kelvin")&& skalatujuan.equals("kelvin")){
            Hasil = suhuasal;
            
        }else if (skalaasal.equals("kelvin")&& skalatujuan.equals("celcius")){
            Hasil = suhuasal + 273.15;
        
        }else if (skalaasal.equals("kelvin")&& skalatujuan.equals("farenhard")){
            Hasil = (suhuasal - 273.15) * 9/5 + 32;
        
        }else if (skalaasal.equals("farenhard")&& skalatujuan.equals("farenhard")){
            Hasil = suhuasal;
            
        }else if (skalaasal.equals("farenhard")&& skalatujuan.equals("celcius")){
            Hasil = (suhuasal - 32) * 5/9;
            
        }else if (skalaasal.equals("farenhard")&& skalatujuan.equals("kelvin")){
            Hasil = (suhuasal - 32) * 5/9 + 273.15;
        
        }
        String skala = skalatujuan.substring(0,1);
        vhasil.setText(String.format("%.2f", Hasil) + "\u00B0" +skala);
        
  
    }//GEN-LAST:event_tkonversiActionPerformed

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
            java.util.logging.Logger.getLogger(apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bclose;
    private javax.swing.JButton breseat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton tkonversi;
    private javax.swing.JComboBox<String> tskalaasal;
    private javax.swing.JComboBox<String> tskalatujuan;
    private javax.swing.JTextField tsuhuasal;
    private javax.swing.JLabel vhasil;
    // End of variables declaration//GEN-END:variables

   
}
