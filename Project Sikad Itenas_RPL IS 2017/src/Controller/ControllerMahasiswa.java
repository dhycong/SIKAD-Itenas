/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.
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
public class ControllerMahasiswa {
    Scanner sc = new Scanner(System.in);
    
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public void insertMahasiswa(int NRP, String Prodi){
        String query = "INSERT INTO mahasiswa (NRP, Prodi) values"
                + "('"+NRP+"','"+Prodi+"')";
        try {
            Statement stm = con.createStatement();
            int result = stm.executeUpdate(query);
        } catch (SQLException ex){
            //Logger.getLogger(MainMahasiswa.class.getName().Log(Level.SEVERE, null
            System.out.println("Input Gagal");
        }
    }
    /*public List<Mahasiswa> tampil(){
        
        List<Mahasiswa> listMhs = new ArrayList();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM mahasiswa");
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNRP(rs.getInt("nrp"));
                mhs.setNama(rs.getString("nama"));
                mhs.setKelas(rs.getString("kelas"));
                mhs.setNilai(rs.getDouble("nilai"));
                listMhs.add(mhs);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return listMhs;
    }*/
    public void deleteMahasiswa(int NRP){
        int result = 0;
        
        String query = "DELETE FROM mahasiswa WHERE nrp ='" + NRP + "'";
        
        try {
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
            System.out.println("Banyaknya data mahasiswa yang terhapus : " + result);
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public void updateMahasiswa(int NRP, String Prodi) {
        int result = 0;
        
        String query ="UPDATE FROM mahasiswa set prodi = '" + Prodi + " WHERE nrp = '" + NRP + "'";
        
        try{
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
