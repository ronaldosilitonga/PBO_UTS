/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posproject;

import static posproject.DBConnector.connection;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author NALDO
 */
public class Transaksi{
    
    public int id_transaksi;
    public float total_harga;
    public float total_dibayar;
    public float kembalian;
    
    public void simpanData(){
        try{
            
            String sql = "INSERT INTO TRANSAKSI (id_transaksi,total_harga,total_dibayar,kembalian) VALUES (?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, id_transaksi);
            statement.setFloat(2, total_harga);
            statement.setFloat(3,total_dibayar);
            statement.setFloat(4, kembalian);
            
            int rowInserted = statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            statement.close();
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

}


