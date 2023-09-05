/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

import Owner.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import mssql.DBConnect;

/**
 *
 * @author Asus
 */
public class DeleteCustomer extends javax.swing.JPanel {

    /**
     * Creates new form DeleteCustomer
     */
    
    DBConnect dbc;
    ResultSet rs, rs2;
    String cid, mob;
    boolean isDeleteable = false;
    public DeleteCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchEID = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deleteCID = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        points = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        mbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deleteMobile = new javax.swing.JTextField();

        setBackground(new java.awt.Color(252, 233, 192));

        searchEID.setBackground(new java.awt.Color(204, 255, 255));
        searchEID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        searchEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel1.setText("Name :");

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel2.setText("Customer ID: ");

        deleteCID.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        deleteBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel3.setText("Mobile : ");

        jLabel10.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel10.setText("Email : ");

        jLabel8.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel8.setText("Points : ");

        vs.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        points.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        name.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        mbl.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel4.setText("Mobile:");

        deleteMobile.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mbl, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vs, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(points, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(275, 275, 275))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteCID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(searchEID)
                .addGap(266, 266, 266))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(1156, Short.MAX_VALUE)
                    .addComponent(deleteBtn)
                    .addGap(27, 27, 27)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteCID))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteMobile)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchEID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mbl)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(points))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(224, Short.MAX_VALUE)
                    .addComponent(deleteBtn)
                    .addGap(39, 39, 39)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEIDActionPerformed
        // TODO add your handling code here:
        cid = deleteCID.getText();
        mob = deleteMobile.getText();
        
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            
            if( !cid.isEmpty())
            {
                deleteMobile.setText("");
                rs = dbc.queryToDB("select top 1 * from Customer where customer_id = "+cid);
                rs2 = dbc.queryToDB("select top 1 * from CustomerPoints where customer_id = "+cid);
                                
                
                if(!rs.next())
                {
                    isDeleteable = false;
                    name.setText("");
                    mbl.setText("");
                    vs.setText("");
                    points.setText("");
                    JOptionPane.showMessageDialog(null, "No customer found with Customer ID : "+cid);
                }
                else
                {
                    if(!rs2.next())
                    {
                        boolean q = dbc.ToDB("insert into CustomerPoints values ("+cid+", 0, '2000-01-01')");
                        rs2 = dbc.queryToDB("select top 1 * from CustomerPoints where customer_id = "+cid);
                        rs2.next();
                    }
                    
                    isDeleteable = true;
                    cid = String.valueOf(rs.getInt("customer_id"));
                    String Delname = rs.getString("name");
                    String DelmblNo = rs.getString("mobile");
                    String Delvs = rs.getString("email");
                    String Delpoints = String.valueOf(rs2.getInt("points"));


                    name.setText(Delname);
                    mbl.setText(DelmblNo);
                    vs.setText(Delvs);
                    points.setText(Delpoints);
                    
                }

            }
            else if( !mob.isEmpty())
            {
                rs = dbc.queryToDB("select * from Customer where mobile = '"+mob+"'");    
                rs2 = dbc.queryToDB("select * from CustomerPoints where customer_id=(select top 1 customer_id from Customer where mobile='"+mob+"')");
                if(!rs.next())
                {
                    isDeleteable = false;
                    name.setText("");
                    mbl.setText("");
                    vs.setText("");
                    points.setText("");
                    JOptionPane.showMessageDialog(null, "No customer found with mobile no. : "+mob);
                }
                else
                {
                    if(!rs2.next())
                    {
                        boolean q = dbc.ToDB("insert into CustomerPoints values ((select top 1 customer_id from Customer where mobile='"+mob+"'), 0, '2000-01-01')");
                        rs2 = dbc.queryToDB("select * from CustomerPoints where customer_id=(select top 1 customer_id from Customer where mobile='"+mob+"')");
                        rs2.next();
                    }
                    
                    isDeleteable = true;
                    cid = String.valueOf(rs.getInt("customer_id"));
                    String Delname = rs.getString("name");
                    String DelmblNo = rs.getString("mobile");
                    String Delvs = rs.getString("email");
                    String Delpoints = String.valueOf(rs2.getInt("points"));


                    name.setText(Delname);
                    mbl.setText(DelmblNo);
                    vs.setText(Delvs);
                    points.setText(Delpoints);
                    
                }
            }
            
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter Customer ID or Mobile");
            }

            

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_searchEIDActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        if(isDeleteable)
        {
            try{
                dbc = new DBConnect();
                dbc.connectToDB();
                boolean qr0 = dbc.ToDB("delete from CustomerPoints where customer_id = "+cid);
                boolean qr = dbc.ToDB("delete from Customer"
                    +" where customer_id="+cid);

                if(qr)
                {

                    name.setText("");
                    mbl.setText("");
                    vs.setText("");
                    points.setText("");

                    JOptionPane.showMessageDialog(null, "Delete information succesfull!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error in deleting information!");

                }
            }catch(Exception e){

            }
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField deleteCID;
    private javax.swing.JTextField deleteMobile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel mbl;
    private javax.swing.JLabel name;
    private javax.swing.JLabel points;
    private javax.swing.JButton searchEID;
    private javax.swing.JLabel vs;
    // End of variables declaration//GEN-END:variables
}