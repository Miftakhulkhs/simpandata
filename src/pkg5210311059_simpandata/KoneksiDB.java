/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5210311059_simpandata;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class KoneksiDB {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if(koneksi == null){
            try {
                 String url ="jdbc:mysql://localhost:3306/datakaryawan";
                String username ="root";
                String password ="";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi = (Connection) DriverManager.getConnection(url,username,password);
            } catch (Exception e) {
                System.out.println("Gagal Memuat Koneksi");
            }
        }
        return koneksi;
    }
}