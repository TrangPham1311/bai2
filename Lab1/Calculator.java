/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import javax.swing.JButton;

/**
 *
 * @author KyThuat88
 */
public class Calculator extends javax.swing.JFrame {
    /**
     * 
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }

    Float para1 = null;
    Float para2 = null;
    String pt = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_number = new javax.swing.JTextField();
        btn_mot = new javax.swing.JButton();
        btn_bang = new javax.swing.JButton();
        btn_tam = new javax.swing.JButton();
        btn_khong = new javax.swing.JButton();
        btn_hai = new javax.swing.JButton();
        btn_nhan = new javax.swing.JButton();
        btn_bon = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_cham = new javax.swing.JButton();
        btn_ba = new javax.swing.JButton();
        btn_nam = new javax.swing.JButton();
        btn_chin = new javax.swing.JButton();
        btn_tru = new javax.swing.JButton();
        btn_sau = new javax.swing.JButton();
        btn_bay = new javax.swing.JButton();
        btn_cong = new javax.swing.JButton();
        btn_chia = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_number.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_number.setName("txt_number"); // NOI18N

        btn_mot.setText("1");
        btn_mot.setName("txt_mot"); // NOI18N
        btn_mot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_bang.setText("=");
        btn_bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bangMouseClicked(evt);
            }
        });

        btn_tam.setText("8");
        btn_tam.setName("txt_mot"); // NOI18N
        btn_tam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_khong.setText("0");
        btn_khong.setName("txt_mot"); // NOI18N
        btn_khong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_hai.setText("2");
        btn_hai.setName("txt_mot"); // NOI18N
        btn_hai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_nhan.setText("*");
        btn_nhan.setName("txt_mot"); // NOI18N
        btn_nhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nhanMouseClicked(evt);
            }
        });

        btn_bon.setText("4");
        btn_bon.setName("txt_mot"); // NOI18N
        btn_bon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_c.setText("C");
        btn_c.setName("txt_mot"); // NOI18N
        btn_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cMouseClicked(evt);
            }
        });

        btn_cham.setText(".");
        btn_cham.setName("txt_mot"); // NOI18N
        btn_cham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_ba.setText("3");
        btn_ba.setName("txt_mot"); // NOI18N
        btn_ba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_nam.setText("5");
        btn_nam.setName("txt_mot"); // NOI18N
        btn_nam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_chin.setText("9");
        btn_chin.setName("txt_mot"); // NOI18N
        btn_chin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_tru.setText("-");
        btn_tru.setName("txt_mot"); // NOI18N
        btn_tru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_truMouseClicked(evt);
            }
        });

        btn_sau.setText("6");
        btn_sau.setName("txt_mot"); // NOI18N
        btn_sau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_bay.setText("7");
        btn_bay.setName("txt_mot"); // NOI18N
        btn_bay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Click(evt);
            }
        });

        btn_cong.setText("+");
        btn_cong.setName("txt_mot"); // NOI18N
        btn_cong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_congMouseClicked(evt);
            }
        });

        btn_chia.setText("/");
        btn_chia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_chiaMouseClicked(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.setUI(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_number, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_mot, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_hai, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btn_bon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_bay, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_tam, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_sau, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_chin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ba, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_chia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_tru, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cham, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cong, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_bang, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_number, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ba, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_mot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tru, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_bon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_bay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_chin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_chia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_khong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cham, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_bang, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        txt_number.getAccessibleContext().setAccessibleName("txt_number");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cMouseClicked
        // TODO add your handling code here:
        txt_number.setText("");
        this.pt = null;
        this.para1 = null;
        this.para2 = null;
        jTextField1.setText("");
//        jTextField2.setText("");
    }//GEN-LAST:event_btn_cMouseClicked

    private void btn_Click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Click
        // TODO add your handling code here:
        JButton bt = (JButton) evt.getComponent();
        String value = this.txt_number.getText()+bt.getText();
        if(value.equals("0.")){
            value = "";
        }
        if(value.contains(".")){
            this.txt_number.setText("");
            value = bt.getText();
        }
        this.txt_number.setText(value);
        this.para1 = Float.parseFloat(value);
    }//GEN-LAST:event_btn_Click

    private void btn_congMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_congMouseClicked
        // TODO add your handling code here:
        this.txt_number.setText("");
        jTextField1.setText(""+this.para1);
        pt = "+";
    }//GEN-LAST:event_btn_congMouseClicked

    private void btn_bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bangMouseClicked
        Float value = Float.parseFloat(this.txt_number.getText().toString());
        para2 = value;
//        jTextField2.setText(""+para2);
        if(pt.equals("+")){
            this.Cong(Float.parseFloat(jTextField1.getText()), this.para2);  
        }else if(pt.equals("-")){
            this.Hieu(Float.parseFloat(jTextField1.getText()), this.para2);
        }else if(pt.equals("*")){
            this.Tich(Float.parseFloat(jTextField1.getText()), this.para2);
        }else if(pt.equals("/")){
            this.Thuong(Float.parseFloat(jTextField1.getText()), this.para2);
        }
    }//GEN-LAST:event_btn_bangMouseClicked

    private void btn_truMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_truMouseClicked
        // TODO add your handling code here:
         this.txt_number.setText("");
        jTextField1.setText(""+this.para1);
        pt = "-";
    }//GEN-LAST:event_btn_truMouseClicked

    private void btn_nhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nhanMouseClicked
        // TODO add your handling code here:
        this.txt_number.setText("");
        jTextField1.setText(""+this.para1);
        pt = "*";
    }//GEN-LAST:event_btn_nhanMouseClicked

    private void btn_chiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_chiaMouseClicked
        // TODO add your handling code here:
        this.txt_number.setText("");
        jTextField1.setText(""+this.para1);
        pt = "/";
    }//GEN-LAST:event_btn_chiaMouseClicked
    
    public void Cong(Float a,Float b){
//        this.setNull();
        Float tong = a+b;
        this.txt_number.setText(""+tong);
         para1 = tong;
    }
    
    public void Thuong(Float a,Float b){
//        this.setNull();
        Float thuong = a/b;
        this.txt_number.setText(""+thuong);
         para1 = thuong;
    }
    
    public void Tich(Float a,Float b){
//        this.setNull();
        Float tich = a*b;
        this.txt_number.setText(""+tich);
         para1 = tich;
    }
    
    public void Hieu(Float a,Float b){
//        this.setNull();
        Float hieu = a-b;
        this.txt_number.setText(""+hieu);
         para1 = hieu;
    }
    
    public void setNull(){
        this.txt_number.setText("");
    }
    


    
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ba;
    private javax.swing.JButton btn_bang;
    private javax.swing.JButton btn_bay;
    private javax.swing.JButton btn_bon;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_cham;
    private javax.swing.JButton btn_chia;
    private javax.swing.JButton btn_chin;
    private javax.swing.JButton btn_cong;
    private javax.swing.JButton btn_hai;
    private javax.swing.JButton btn_khong;
    private javax.swing.JButton btn_mot;
    private javax.swing.JButton btn_nam;
    private javax.swing.JButton btn_nhan;
    private javax.swing.JButton btn_sau;
    private javax.swing.JButton btn_tam;
    private javax.swing.JButton btn_tru;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_number;
    // End of variables declaration//GEN-END:variables
}
