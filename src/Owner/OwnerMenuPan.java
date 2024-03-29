/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Owner;

import UserInterface.Main;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import mssql.DBConnect;

/**
 *
 * @author Asus
 */
public class OwnerMenuPan extends javax.swing.JPanel {

    /**
     * Creates new form OwnerMenuPan
     */
    DBConnect dbc;
    ResultSet rs;
    String iid;
    
    public OwnerMenuPan() {
        initComponents();
        showMenuTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        AddName2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddPrice2 = new javax.swing.JTextField();
        AddMenuBtn2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();
        searchItem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        UpName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        UpPrice = new javax.swing.JTextField();
        UpBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        deletename = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        deletePrice = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        ownLogOut = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 233, 192));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Back.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel5.setText("Item Name : ");

        AddName2.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel6.setText("Price : ");

        AddPrice2.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        AddMenuBtn2.setBackground(new java.awt.Color(102, 153, 255));
        AddMenuBtn2.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        AddMenuBtn2.setText("ADD");
        AddMenuBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMenuBtn2ActionPerformed(evt);
            }
        });

        MenuTable.setBackground(new java.awt.Color(204, 255, 204));
        MenuTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(MenuTable);

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel4.setText("Item Id : ");

        searchBox.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        searchItem.setBackground(new java.awt.Color(204, 255, 255));
        searchItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        searchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel7.setText("Item Name : ");

        UpName.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel8.setText("Price : ");

        UpPrice.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N

        UpBtn.setBackground(new java.awt.Color(102, 255, 255));
        UpBtn.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        UpBtn.setText("UPDATE");
        UpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel9.setText("Item Name : ");

        deletename.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel10.setText("Price : ");

        deletePrice.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N

        deleteBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        ownLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/log_out_642.png"))); // NOI18N
        ownLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ownLogOut)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddMenuBtn2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AddName2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(searchItem)
                        .addGap(317, 317, 317))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UpBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(deleteBtn)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deletePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deletename, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(75, 75, 75))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchItem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddName2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddPrice2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddMenuBtn2)
                            .addComponent(UpBtn)
                            .addComponent(deleteBtn))
                        .addGap(132, 132, 132))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpName)
                            .addComponent(deletename, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpPrice)
                            .addComponent(deletePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(201, 201, 201)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ownLogOut)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void AddMenuBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMenuBtn2ActionPerformed
        // TODO add your handling code here:
        String add_name = AddName2.getText();
        String add_price = AddPrice2.getText();
        
        
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            boolean qr = dbc.ToDB("insert into Menu (item_name, price)"
                                   +" values ('"+add_name+"',"+add_price+")");
            
            if(qr)
            {
                JOptionPane.showMessageDialog(null, "Item Added Successfully");
                showMenuTable();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error adding Item");
            }
        }catch(Exception e){
            
        }

        
    }//GEN-LAST:event_AddMenuBtn2ActionPerformed

    private void searchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemActionPerformed
        // TODO add your handling code here:

        iid = searchBox.getText();
        try{
            dbc = new DBConnect();
            dbc.connectToDB();

            if( !iid.isEmpty())
            {
                rs = dbc.queryToDB("select * from Menu where item_id = "+iid);
            }
           
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter Item ID");
            }

            while(rs.next())
            {
                String item_name = rs.getString("item_name");
                String price = rs.getString("price");
                
                UpName.setText(item_name);
                UpPrice.setText(price);
                deletename.setText(item_name);
                deletePrice.setText(price);

            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_searchItemActionPerformed

    private void UpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpBtnActionPerformed
        // TODO add your handling code here:
        String upname = UpName.getText();
        String upprice = UpPrice.getText();
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            
        
            boolean qr = dbc.ToDB("update Menu"
                +" set item_name='"+upname+"',price="+upprice+" where item_id="+iid);
                

            if(qr)
            {
               
                UpName.setText("");
                UpPrice.setText("");
                deletename.setText("");
                deletePrice.setText("");
                
                JOptionPane.showMessageDialog(null, "Menu Upadated Successfully");
                showMenuTable();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error updating Menu");
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_UpBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            
        
            boolean qr = dbc.ToDB("delete from Menu where item_id="+iid);
               
                

            if(qr)
            {
               
                UpName.setText("");
                UpPrice.setText("");
                deletename.setText("");
                deletePrice.setText("");
                
                JOptionPane.showMessageDialog(null, "Item Deleted Successfully");
                showMenuTable();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error deleting item");
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void ownLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownLogOutActionPerformed
        // TODO add your handling code here:
        //dispose();
        //Main mn = new Main();
        //mn.setVisible(true);
        Window wn = SwingUtilities.getWindowAncestor(this);
        wn.dispose();
        Main mn = new Main();
        mn.setVisible(true);
    }//GEN-LAST:event_ownLogOutActionPerformed
    
    public void showMenuTable()
    {
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
            model.setRowCount(0);
            rs = dbc.queryToDB("select * from Menu");
            
            while(rs.next())
            {
                String itemId = String.valueOf(rs.getInt("item_id"));
                String itemName = rs.getString("item_name");
                String price = String.valueOf(rs.getInt("price"));

                String TableData[] = {itemId,itemName,price};
                DefaultTableModel Tmodel = (DefaultTableModel) MenuTable.getModel();
                Tmodel.addRow(TableData);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    public void addEventBack(ActionListener event){
        backBtn.addActionListener(event);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMenuBtn2;
    private javax.swing.JTextField AddName2;
    private javax.swing.JTextField AddPrice2;
    private javax.swing.JTable MenuTable;
    private javax.swing.JButton UpBtn;
    private javax.swing.JTextField UpName;
    private javax.swing.JTextField UpPrice;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel deletePrice;
    private javax.swing.JLabel deletename;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton ownLogOut;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchItem;
    // End of variables declaration//GEN-END:variables
}
