package parkingmanagementsystem;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER LAPTOP
 */
public class Payment extends javax.swing.JFrame {
   
    public Payment() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        an = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bank = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cvv = new javax.swing.JPasswordField();
        paybutton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ifsc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        namelabel = new javax.swing.JLabel();
        costlabel = new javax.swing.JLabel();
        fee = new javax.swing.JLabel();
        pn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setText("Enter Your Account Number       :");

        jLabel2.setText("Select Your Bank                           :");

        bank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AxisBank", "CanaraBank","TMB Bank","StateBank", "IndianBank" }));
        bank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter CVV                                      :");

        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });

        paybutton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        paybutton.setText("Pay");
        paybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybuttonActionPerformed(evt);
            }
        });

        cancelbutton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cancelbutton.setText("Exit");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setText("NET BANKING FORM");

        jLabel7.setText("Enter IFSC Code                             :");

        jLabel8.setText("Enter Card Number                       :");

        namelabel.setText("PlateNumber                                    :");

        costlabel.setText("Fee                                                     :");

        fee.setText("0.0");

        pn.setText("jLabel4");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Genrate bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namelabel)
                                    .addComponent(costlabel))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel2))
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(paybutton)
                                        .addGap(41, 41, 41)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(66, 66, 66)
                                        .addComponent(cancelbutton))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ifsc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cvv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pn)
                                            .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bank, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelabel)
                    .addComponent(pn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costlabel)
                    .addComponent(fee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ifsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cancelbutton)
                        .addComponent(paybutton))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        // TODO add your handling code here:
     new MainPage().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void paybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybuttonActionPerformed
        String surl, suser, spass, query, tid;
        surl = "jdbc:mysql://localhost:3306/parkingsystem";
        suser = "root";
        spass = "";
        
        System.out.println("Success 0");
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
          //  System.out.println("Success 1");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
            Connection con = DriverManager.getConnection(surl, suser, spass);
            Statement st = con.createStatement();
            String ff= fee.getText();
            if(ff.contentEquals("0.0")){
            JOptionPane.showMessageDialog(null, "No Need to Pay");
                   return;
            }
            String query1;
            query1 = "INSERT INTO payment(PN, Fee, Bank, IFSCCode, AccountNumber, CardNumber, CVV) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement s = con.prepareStatement(query1);
            s.setString(1, pn.getText());
            s.setString(2, fee.getText());
            
            s.setString(3,bank.getSelectedItem().toString() );
            s.setString(4, ifsc.getText());
            s.setString(5, cn.getText());
            s.setString(6, cn.getText());
            s.setString(7, cvv.getText());
            s.execute();
            JOptionPane.showMessageDialog(null, "Payment Successful");
            String a=bank.getSelectedItem().toString();
        if(a.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Select Any Bank");   
        }
        else if(an.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Account Number");
        }
        else if(cn.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Card Number");
        }
        else if((an.getText().startsWith("1234")))
        {
            JOptionPane.showMessageDialog(null, "Enter Valid Account Number");
        }
        else if(ifsc.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter the IFSC Code:");
        }
        else if(cvv.getText().length() != 3)
        {
            JOptionPane.showMessageDialog(null, "Enter CVV :");
        }
        
       
        }
        catch (SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_paybuttonActionPerformed

    private void bankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                    
         String path="";
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();
        }
        Document doc=new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"info.pdf"));
            doc.open();
            PdfPTable tbl=new PdfPTable(2);
            tbl.addCell("Platenumber");
            tbl.addCell("Fee");
            
            String uname = pn.getText();
            String method = fee.getText();
            
            /*for(int i=0;i<jTable1.getRowCount();i++)
            {
                String n,a,m,add;
                n=jTable1.getValueAt(i, 0).toString();
                a=jTable1.getValueAt(i, 1).toString();
                m=jTable1.getValueAt(i, 2).toString();
                add=jTable1.getValueAt(i, 3).toString();
               
                tbl.addCell(n);
                tbl.addCell(a);
                tbl.addCell(m);
                tbl.addCell(add);
               
            }*/
            tbl.addCell(uname);
            tbl.addCell(method);
            doc.add(tbl);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.close();
            
     
    }//GEN-LAST:event_jButton1ActionPerformed

    
   
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
    public String transid()
    {
        Random random = new Random();
        int g= random.nextInt(99999999);
        return String.valueOf(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField an;
    private javax.swing.JComboBox<String> bank;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField cn;
    private javax.swing.JLabel costlabel;
    private javax.swing.JPasswordField cvv;
    public javax.swing.JLabel fee;
    private javax.swing.JTextField ifsc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JButton paybutton;
    public javax.swing.JLabel pn;
    // End of variables declaration//GEN-END:variables
}
