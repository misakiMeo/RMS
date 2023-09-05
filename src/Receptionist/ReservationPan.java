/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

import ChefAcc.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mssql.DBConnect;

/**
 *
 * @author Asus
 */
public class ReservationPan extends javax.swing.JPanel {

    /**
     * Creates new form OrderPan
     */
    DBConnect dbc;
    ResultSet rs;
    String uid;
    int currentEmp;
    public ReservationPan() {
        initComponents();
        showReserveTable();
        showMenuTable();
        cons();
    }
    public ReservationPan(int currentEmp) {
        this.currentEmp = currentEmp;
        initComponents();
        showReserveTable();
        showMenuTable();
        cons();
    }
    
    public void cons()
    {
        AddReservation ar = new AddReservation(currentEmp);
        UpdateReservation ur = new UpdateReservation();
        DeleteReservation dr = new DeleteReservation();
        fromPicker.setDate(Date.valueOf(LocalDate.now()));
        toPicker.setDate(Date.valueOf(LocalDate.now()));
        //SearchReservationPan sp = new SearchReservationPan();
        panelSlide1.setAnimate(100);
        panelSlide1.init(ar,ur,dr);
        
        addEventAdd(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Show register form
                panelSlide1.show(0);
                
            }
        });
        
        addEventUpdate(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Show register form
                panelSlide1.show(1);
                
            }
        });

        addEventDelete(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Show register form
                panelSlide1.show(2);
                
            }
        });
        
        

    }
    
    public void showReserveTable()
    {
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            DefaultTableModel model = (DefaultTableModel) ReservationTable.getModel();
            model.setRowCount(0);
            rs = dbc.queryToDB("select * from Reservation order by date_ DESC");
            
            while(rs.next())
            {
                String rid = String.valueOf(rs.getInt("reservation_id"));
                String cid = String.valueOf(rs.getInt("customer_id"));
                String revFrom = String.valueOf(rs.getDate("date_"));
                String time = rs.getString("time_");
                String noG = String.valueOf(rs.getInt("no_of_guest"));
                String tNo = rs.getString("table_no");
                String duration = rs.getString("duration");

                

                
                String TableData[] = {rid,cid,revFrom,time,duration,tNo,noG};
                DefaultTableModel Tmodel = (DefaultTableModel) ReservationTable.getModel();
                Tmodel.addRow(TableData);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    public void showFilteredReserveTable()
    {
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            DefaultTableModel model = (DefaultTableModel) ReservationTable.getModel();
            model.setRowCount(0);
            
            long millis = fromPicker.getDate().getTime();
            String revFrom = new java.sql.Date(millis).toString();
            long millis2 = toPicker.getDate().getTime();
            String revTo = new java.sql.Date(millis2).toString();
            
            rs = dbc.queryToDB("select * from Reservation where date_ between '"+revFrom+"' and '"+revTo+"'");
            
            while(rs.next())
            {
                String rid = String.valueOf(rs.getInt("reservation_id"));
                String cid = String.valueOf(rs.getInt("customer_id"));
                String revFromT = String.valueOf(rs.getDate("date_"));
                String time = rs.getString("time_");
                String noG = String.valueOf(rs.getInt("no_of_guest"));
                String tNo = rs.getString("table_no");
                String duration = rs.getString("duration");

                

                
                String TableData[] = {rid,cid,revFromT,time,duration,tNo,noG};
                DefaultTableModel Tmodel = (DefaultTableModel) ReservationTable.getModel();
                Tmodel.addRow(TableData);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    public void showMenuTable()
    {
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
            model.setRowCount(0);
            rs = dbc.queryToDB("select * from Menu order by category ");
            
            while(rs.next())
            {
                String cat = rs.getString("category");
                String itemName = rs.getString("item_name");
                String price = String.valueOf(rs.getFloat("price"));

                String TableData[] = {cat,itemName,price};
                DefaultTableModel Tmodel = (DefaultTableModel) MenuTable.getModel();
                Tmodel.addRow(TableData);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    public void addEventInvoice(ActionListener event) {
        nextBtn.addActionListener(event);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReservationTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        RefBtn = new javax.swing.JButton();
        addRev = new javax.swing.JButton();
        upRev = new javax.swing.JButton();
        delRev = new javax.swing.JButton();
        panelBorder2 = new swing.PanelBorder();
        panelSlide1 = new swing.PanelSlide();
        jLabel7 = new javax.swing.JLabel();
        fromPicker = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        toPicker = new com.toedter.calendar.JDateChooser();
        FilterBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 233, 192));
        setMaximumSize(new java.awt.Dimension(1570, 743));
        setMinimumSize(new java.awt.Dimension(1570, 743));
        setPreferredSize(new java.awt.Dimension(1570, 743));

        nextBtn.setBackground(new java.awt.Color(153, 255, 153));
        nextBtn.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        nextBtn.setText("NEXT");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        ReservationTable.setBackground(new java.awt.Color(204, 255, 255));
        ReservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation Id", "Customer ID", "Date", "Time", "Duration", "Table No", "Total Guest"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ReservationTable);
        if (ReservationTable.getColumnModel().getColumnCount() > 0) {
            ReservationTable.getColumnModel().getColumn(0).setResizable(false);
            ReservationTable.getColumnModel().getColumn(1).setResizable(false);
            ReservationTable.getColumnModel().getColumn(2).setResizable(false);
            ReservationTable.getColumnModel().getColumn(3).setResizable(false);
            ReservationTable.getColumnModel().getColumn(4).setResizable(false);
            ReservationTable.getColumnModel().getColumn(5).setResizable(false);
            ReservationTable.getColumnModel().getColumn(6).setResizable(false);
        }

        MenuTable.setBackground(new java.awt.Color(204, 255, 204));
        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Category", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(MenuTable);

        RefBtn.setBackground(new java.awt.Color(204, 255, 204));
        RefBtn.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        RefBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        RefBtn.setText("Refresh");
        RefBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefBtnActionPerformed(evt);
            }
        });

        addRev.setBackground(new java.awt.Color(102, 153, 255));
        addRev.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        addRev.setText("Add Reservation");
        addRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRevActionPerformed(evt);
            }
        });

        upRev.setBackground(new java.awt.Color(153, 255, 255));
        upRev.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        upRev.setText("Update Info");

        delRev.setBackground(new java.awt.Color(255, 102, 102));
        delRev.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        delRev.setText("Delete Info");

        panelBorder2.setMaximumSize(new java.awt.Dimension(1179, 226));
        panelBorder2.setMinimumSize(new java.awt.Dimension(1179, 226));

        panelSlide1.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout panelSlide1Layout = new javax.swing.GroupLayout(panelSlide1);
        panelSlide1.setLayout(panelSlide1Layout);
        panelSlide1Layout.setHorizontalGroup(
            panelSlide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        panelSlide1Layout.setVerticalGroup(
            panelSlide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        panelBorder2.add(panelSlide1);
        panelSlide1.setBounds(10, 0, 1160, 230);

        jLabel7.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel7.setText("From : ");

        jLabel8.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel8.setText("To : ");

        FilterBtn.setBackground(new java.awt.Color(153, 255, 153));
        FilterBtn.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        FilterBtn.setText("Filter");
        FilterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fromPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(toPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(FilterBtn)))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RefBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(nextBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addRev)
                            .addComponent(upRev)
                            .addComponent(delRev))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(addRev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upRev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delRev))
                    .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(RefBtn)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nextBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addComponent(fromPicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FilterBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addEventAdd(ActionListener event) {
        addRev.addActionListener(event);
    }
    
    public void addEventUpdate(ActionListener event) {
        upRev.addActionListener(event);
    }

    public void addEventDelete(ActionListener event) {
        delRev.addActionListener(event);
    }
    
    

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nextBtnActionPerformed

    private void RefBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefBtnActionPerformed
        // TODO add your handling code here:

        showReserveTable();
        showMenuTable();
    }//GEN-LAST:event_RefBtnActionPerformed

    private void addRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRevActionPerformed

    private void FilterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBtnActionPerformed
        // TODO add your handling code here:
        showFilteredReserveTable();
    }//GEN-LAST:event_FilterBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FilterBtn;
    private javax.swing.JTable MenuTable;
    private javax.swing.JButton RefBtn;
    private javax.swing.JTable ReservationTable;
    private javax.swing.JButton addRev;
    private javax.swing.JButton delRev;
    private com.toedter.calendar.JDateChooser fromPicker;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextBtn;
    private swing.PanelBorder panelBorder2;
    private swing.PanelSlide panelSlide1;
    private com.toedter.calendar.JDateChooser toPicker;
    private javax.swing.JButton upRev;
    // End of variables declaration//GEN-END:variables
}
