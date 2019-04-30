/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
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
public class ControllerJadwal {
    Scanner sc = new Scanner(System.in);
    
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public void jadwalPerwalian(int jadwalPerwalianID, String startDate, String endDate, String tahunAjaran,int semester){
        String query = "INSERT INTO jadwalperwaian (jadwalPerwalianID, startDate, endDate, tahunAjaran, semester) values"
                + "('"+jadwalPerwalianID+"','"+startDate+"','"+endDate+"','"+tahunAjaran+"','"+semester+"')";
        try {
            Statement stm = con.createStatement();
            int result = stm.executeUpdate(query);
        } catch (SQLException ex){
            //Logger.getLogger(MainMahasiswa.class.getName().Log(Level.SEVERE, null
            System.out.println("Input Gagal");
        }
    }
    public List<JadwalPerwalian> tampil(){
        
        List<JadwalPerwalian> listjpn = new ArrayList();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM mahasiswa");
            while(rs.next()){
                JadwalPerwalian jpn = new JadwalPerwalian();
                jpn.setJadwalPerwalianID(rs.getInt("jadwalPerwalianID"));
                jpn.setEndDate(rs.getString("endDate"));
                jpn.setStartDate(rs.getString("startDate"));
                jpn.setSemester(rs.getString("semester"));
                jpn.setTahunAjaran(rs.getString("tahunAjaran"));
                listjpn.add(jpn);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return listjpn;
    }
}
