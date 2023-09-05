/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;


import Owner.OwnerMain;
import Receptionist.ReceptionistMain;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mssql.CommandOperation;
import UserInterface.Main;
import java.awt.Component;
import java.awt.Window;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import mssql.DBConnect;

/**
 *
 * @author Asus
 */
public class LogInPan extends javax.swing.JPanel {

    /**
     * Creates new form LogInPan
     */
    DBConnect dbc;
    ResultSet rs;
    public LogInPan() {
        initComponents();
    }
    public void login() {
        login_uid.grabFocus();
    }

    CommandOperation cOperation = new CommandOperation();
    String Deg = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_uid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        login_pass = new javax.swing.JPasswordField();
        login_submitBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        login_registerBtn = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setBackground(new java.awt.Color(252, 233, 192));

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        jLabel1.setText("Restora RMS");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 36)); // NOI18N
        jLabel2.setText("Log In");

        jLabel3.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        jLabel3.setText("Username : ");

        login_uid.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        login_uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_uidActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        jLabel4.setText("Password : ");

        login_pass.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        login_submitBtn.setBackground(new java.awt.Color(153, 255, 153));
        login_submitBtn.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        login_submitBtn.setText("Submit");
        login_submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_submitBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        login_registerBtn.setBackground(new java.awt.Color(153, 153, 255));
        login_registerBtn.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        login_registerBtn.setText("Register");
        login_registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(login_submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(login_uid)
                                    .addComponent(login_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(login_registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(login_uid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(login_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(login_submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(login_registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void login_uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_uidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_uidActionPerformed
        
    public void addEventRegister(ActionListener event) {
        login_registerBtn.addActionListener(event);
    }

    
    private void login_registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_registerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_registerBtnActionPerformed

    private void login_submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_submitBtnActionPerformed
        // TODO add your handling code here:
        String uid = login_uid.getText();
        String pass = login_pass.getText();
        
        //System.out.println("Password: "+pass);
        
        if( uid.isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "User ID cannot be empty!");
        }
        else if( pass.isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Password cannot be empty!");
        }
        else
        {
            try {
                //DBUser dbu = new DBUser(uid,"",pass);    
                Deg = cOperation.logIn(uid, pass);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LogInPan.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LogInPan.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LogInPan.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        Window wn = SwingUtilities.getWindowAncestor(this);
                
        switch(Deg)
        {
            case "Owner":
               wn.dispose();
               OwnerMain om = new OwnerMain(uid);
               om.setVisible(true);
               break;
            case "Senior Manager":
               wn.dispose();
               OwnerMain sm = new OwnerMain(uid);
               sm.setDeg("Sr. Manager");
               sm.setVisible(true);
               break;
            
            case "Recieptionist":
               wn.dispose();
               ReceptionistMain rm = new ReceptionistMain(uid);
               rm.setVisible(true);
               break;
            default:
                System.out.println("****************************Default Deg="+Deg+"*****************************************************");
                
               
        }
        
    }//GEN-LAST:event_login_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField login_pass;
    private javax.swing.JButton login_registerBtn;
    private javax.swing.JButton login_submitBtn;
    private javax.swing.JTextField login_uid;
    // End of variables declaration//GEN-END:variables
}
