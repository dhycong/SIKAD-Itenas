/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Perwalian;
import Model.Matakuliah;
import Model.Mahasiswa;
import Model.JadwalPerwalian;
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
public class ControllerPerwalian {
    Scanner sc = new Scanner(System.in);
    
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public void insertPerwalian(String kodeMatkul, String NRP, int jadwalPerwalianID, String date, String status){
        String query = "INSERT INTO perwalian (kodeMatkul, NRP, jadwalPerwalianID, createDate, status) values"
                + "('"+kodeMatkul+"','"+NRP+"',"+jadwalPerwalianID+",'"+date+"','"+status+"')";
        try {
            Statement stm = con.createStatement();
            int result = stm.executeUpdate(query);
        } catch (SQLException ex){
            //Logger.getLogger(MainMahasiswa.class.getName().Log(Level.SEVERE, null
            System.out.println("Input Gagal");
        }
    }
    public List<Perwalian> tampil(){
        
        List<Perwalian> listPwn = new ArrayList();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM perwalian");
            while(rs.next()){
                Perwalian pwn = new Perwalian();
                pwn.setPerwalianID(rs.getInt("perwalianID"));
                pwn.setKodeMatkul(rs.getString("kodeMatkul"));
                pwn.setNRP(rs.getString("NRP"));
                pwn.setJadwalPerwalianID(rs.getInt("jadwalPerwalianID"));
                pwn.setDate(rs.getString("createDate"));
                pwn.setStatus(rs.getString("status"));
                listPwn.add(pwn);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return listPwn;
    }
    /*public void deletePerwalian(int NRP){
        int result = 0;
        
        String query = "DELETE FROM perwalian WHERE  ='" + NRP + "'";
        
        try {
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
            System.out.println("Banyaknya data mahasiswa yang terhapus : " + result);
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public void updateMahasiswa(int NRP, String Nama, String Kelas, double Nilai) {
        int result = 0;
        
        String query ="UPDATE FROM mahasiswa set nama = '" + Nama + "'," + "kelas = '" + Kelas + ","
                +"nilai = '" + Nilai + " WHERE nrp = '" + NRP + "'";
        
        try{
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
*/}
