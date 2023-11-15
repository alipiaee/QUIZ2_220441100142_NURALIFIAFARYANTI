/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author SENJU
 */
public class koneksi {
    private static Connection mysqlkoneksi;
    public static Connection koneksiDB()throws SQLException{
        try{
        String db="jdbc:mysql://localhost:3306/login";
        String user ="root";
        String pw ="";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        mysqlkoneksi = (Connection) DriverManager.getConnection(db,user,pw);
//        JOptionPane.showMessageDialog(null,"Koneksi Berhasil");s
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Koneksi Gagal"+e.getMessage());
        
    }
        return mysqlkoneksi;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
