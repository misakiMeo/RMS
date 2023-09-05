/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssql;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jandr
 */
public class DBConnect {
    private  Statement stmt = null;
    private Connection connection;
    
    public void connectToDB() throws ClassNotFoundException, SQLException{
        System.out.println("DB connecting..............");
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost:1433;user=sa;password=p1q23jf;" + "databaseName=res;";
        connection = DriverManager.getConnection(connectionUrl);
        System.out.println("Connected database successfully.........");
        java.sql.Statement stmt = connection.createStatement();
    }
    
    public void disconnectFromDB(){

    try{
       // if (rs != null){rs.close();}
        if (stmt != null){stmt.close();}
        if (connection != null){connection.close();}
    }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Unable to close connection");
        }
    }
    
    public boolean ToDB(String query)
     {
        try
        {
            System.out.println("query = "+query);
            java.sql.Statement stmt = connection.createStatement();
            //System.out.println("54");
            stmt.executeUpdate(query);
            return true;
        }
        catch (SQLException ex)
        {
            //JOptionPane.showMessageDialog(null, "Unable to Insert Data");
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
     }
    
    public ResultSet queryToDB(String query)
    {
        try
        {
            System.out.println(query);
            java.sql.Statement stmt=connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
//            rs.next();
//            Reader reader = rs.getCharacterStream(1);
//            return reader;
            
        }
        catch (SQLException ex)
        {
            //System.out.println("Query: ");
            JOptionPane.showMessageDialog(null, "Query Unsucessfull!"+query);
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    }
}
