/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

/**
 *
 * @author jandr
 */
public class DBUser {
    
    private String userName;
    private String designation;
    

    public DBUser() {
    }

    public DBUser(String userName, String designation) {
        this.userName = userName;
        this.designation = designation;
        
    }

    public String getUserName() {
        return userName;
    }

    public String getDesignation() {
        return designation;
    }

   
    
}
