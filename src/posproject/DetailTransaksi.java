/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posproject;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import static posproject.DBConnector.connection;

/**
 *
 * @author NALDO
 */
public class DetailTransaksi {
    
        
    public int id_transaksi;
    
    public ArrayList<Integer> detailIdBarang = new ArrayList();
    public ArrayList<Integer> detailQTYBarang = new ArrayList();
    public ArrayList<Float> detailHargaBarang = new ArrayList();
    
    public void simpanDetailTransaksi(){
        try{
            
            String sql = "INSERT INTO detail_transaksi (id_id_barang, id_id_transaksi, qty, harga) VALUES (?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            for( int i = 0; i<detailIdBarang.size(); i++){
                
                
                statement.setFloat(1, detailIdBarang.get(i));
                statement.setInt(2, id_transaksi);
                statement.setFloat(3,detailQTYBarang.get(i));
                statement.setFloat(4, detailHargaBarang.get(i));
            
                int rowInserted = statement.executeUpdate();
            }
            
            statement.close();
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
