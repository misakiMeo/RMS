/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mssql;


import java.io.IOException;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jandr
 */
public class CommandOperation {
    private DBConnect dbc;
    private ResultSet rs,rs2,rs3; 
    
    public void Operation()
    {
        //dbc = new DBConnect();
        //rs = null;               
    }
    
    public String logIn(String uid, String pass) throws ClassNotFoundException, SQLException, IOException
    {
        String dbDeg = "";
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            
            rs = dbc.queryToDB("select * from LoginCredentials"
                               +" where uname = '"+uid+"'");
            
            
            if( !rs.next())
            {
                JOptionPane.showMessageDialog(null, "Username doesn't exist!");
                
            }
            
            
            else
            {
                
                do{
//              System.out.println(rs);
                Reader readerU = rs.getCharacterStream("uname");
                
                //Reader readerD = rs.getCharacterStream("userId");

                int intValueOfChar;
                String dbUid = "";
                    while ((intValueOfChar = readerU.read()) != -1) {
                        dbUid += (char) intValueOfChar;
                    }
                readerU.close();
                
                Reader readerP = rs.getCharacterStream("passwrd");
                String dbPass = "";
                    while ((intValueOfChar = readerP.read()) != -1) {
                        dbPass += (char) intValueOfChar;
                    }
                readerP.close();
               
                int dbeid = rs.getInt("employee_id");
                
                if( !pass.equals(dbPass) )
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Password!");
                    
                }
                
                if( uid.equals(dbUid) && pass.equals(dbPass) )
                {
                    //JOptionPane.showMessageDialog(null, "Login Suffessful!");
                    
                    rs3 = dbc.queryToDB("select designation from Employee"
                               +" where employee_id = '"+dbeid+"'");
                    
                    rs3.next();
                    Reader readerDeg = rs3.getCharacterStream("designation");
                        while ((intValueOfChar = readerDeg.read()) != -1) {
                            dbDeg += (char) intValueOfChar;
                        }
                    readerDeg.close();
                    
                }
                
                System.out.println("Welcome! We Found you:"+dbUid+"+++");
                } while(rs.next());
            
            }
            
            dbc.disconnectFromDB();  
            
        } catch (SQLException ex) {
        System.out.println(ex.getMessage());

        }finally {closeDB();}
        
        return dbDeg;
    }
    
    public void addEmployee(String addName, String addNid, String addDeg, String addMbl, String addSalary, String addPa ) throws ClassNotFoundException, SQLException, IOException
    {
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            
            //boolean isAdd = dbc.ToDB("insert into Employee (Name, NID, Designation, Shift, Mobile, PresentAddress, Salary, Vaccine_Status, EmergencyContact)"
            //                          +" values ('"+addName+"','"+addNid+"','"+addDeg+"','"+addShift+"','"+addMbl+"','"+addPa+"',"+addSalary+",'"+addVs+"','"+addEc+"')");
            
            boolean isAdd = dbc.ToDB("insert into Employee (name, nid, designation, mobile, address_, salary)"
                                      +" values ('"+addName+"','"+addNid+"','"+addDeg+"','"+addMbl+"','"+addPa+"',"+addSalary+")");
            
            if(isAdd)
            {
                JOptionPane.showMessageDialog(null, "Employee added successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to add employee");

            }
            
        }catch (SQLException ex) {
        System.out.println(ex.getMessage());

        }finally {closeDB();}
    }
    
    public void Reg(String eid, String nid, String uid, String pass) throws ClassNotFoundException, SQLException, IOException
    {
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            
            rs = dbc.queryToDB("select nid,designation from Employee"
                               +" where employee_id = '"+eid+"'");
            
            rs2 = dbc.queryToDB("select * from LoginCredentials"
                               +" where uname = '"+uid+"'");
            if( !rs.next())
            {
                JOptionPane.showMessageDialog(null, "Employee doesn't exist!");
            }
            
            
            else
            {
                
                do{
//              System.out.println(rs);
                Reader readerNID = rs.getCharacterStream("nid");
                
                //Reader readerD = rs.getCharacterStream("userId");

                int intValueOfChar;
                String dbnid = "";
                    while ((intValueOfChar = readerNID.read()) != -1) {
                        dbnid += (char) intValueOfChar;
                    }
                readerNID.close();
                
                Reader readerDEG = rs.getCharacterStream("designation");
                String dbDeg = "";
                    while ((intValueOfChar = readerDEG.read()) != -1) {
                        dbDeg += (char) intValueOfChar;
                    }
                readerDEG.close();
           
                
                if(!nid.equals(dbnid) )
                {
                    JOptionPane.showMessageDialog(null, "NID doesn't match");
                }
                
                else if(!dbDeg.equals("Owner") && !dbDeg.equals("Manager") && !dbDeg.equals("Senior Manager") && !dbDeg.equals("Receptionist") && !dbDeg.equals("Accountant") )
                {
                    JOptionPane.showMessageDialog(null, "Sorry! "+dbDeg+" isn't eligible for registration");
                    
                }
                
                else if(rs2.next())
                {
                    JOptionPane.showMessageDialog(null, "User ID already exist!");
                }
                
                else
                { 
                    boolean isReg = dbc.ToDB("insert into LoginCredentials "
                                               +"values("+eid+",'"+uid+"','"+pass+"')");
                    
                    if(isReg)
                    {
                        JOptionPane.showMessageDialog(null, "Registration successful");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Registration failed");
                    }
                }
                
                
                } while(rs.next());
            
            }
            
            dbc.disconnectFromDB();  
            
        } catch (SQLException ex) {
        System.out.println(ex.getMessage());

        }finally {closeDB();}
    }
    
    private void closeDB()
    {
       try{
           if (rs != null){rs.close();}
          // if (stmt != null){stmt.close();}
           //if (dbc != null){dbc.close();}
       }catch(Exception e){}
    }


}
