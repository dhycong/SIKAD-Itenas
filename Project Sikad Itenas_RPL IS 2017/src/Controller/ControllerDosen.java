/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Dosen;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adyth
 */
public class ControllerDosen {
    Scanner sc = new Scanner(System.in);
    
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public void insertDosen(int NIP){
        String query = "INSERT INTO dosen (NIP) values"
                + "('"+NIP+"')";
        try {
            Statement stm = con.createStatement();
            int result = stm.executeUpdate(query);
        } catch (SQLException ex){
            //Logger.getLogger(MainMahasiswa.class.getName().Log(Level.SEVERE, null
            System.out.println("Input Gagal");
        }
    }
    public List<Dosen> tampil(){
        
        List<Dosen> listDsn = new ArrayList();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM dosen");
            while(rs.next()){
                Dosen dsn = new Dosen();
                dsn.setNIP(rs.getInt("nip"));
                listDsn.add(dsn);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return listDsn;
    }
    public void deleteDosen(int NIP){
        int result = 0;
        
        String query = "DELETE FROM mahasiswa WHERE nip ='" + NIP + "'";
        
        try {
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
            System.out.println("Banyaknya data dosen yang terhapus : " + result);
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public void updateMahasiswa(int NIP) {
        int result = 0;
        
        String query ="UPDATE FROM dosen set nip = '" + NIP + "'," ;
        
        try{
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
