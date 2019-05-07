/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Matakuliah;
import Model.JadwalPerwalian;
import Model.Mahasiswa;

/**
 *
 * @author HP
 */
public class Perwalian {
    private int perwalianID;
    private String date;
    private String status;
    private String kodeMatkul;
    private String NRP;
    private int jadwalPerwalianID;
    
    Matakuliah matkul=new Matakuliah();
    JadwalPerwalian jPerwalian=new JadwalPerwalian();
    Mahasiswa mhs=new Mahasiswa();

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public int getJadwalPerwalianID() {
        return jadwalPerwalianID;
    }

    public void setJadwalPerwalianID(int jadwalPerwalianID) {
        this.jadwalPerwalianID = jadwalPerwalianID;
    }

    
    
    public Perwalian(int perwalianID, String date, String status) {
        this.perwalianID = perwalianID;
        this.date = date;
        this.status = status;
    }

    public Perwalian() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Matakuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(Matakuliah matkul) {
        this.matkul = matkul;
    }

    public int getPerwalianID() {
        return perwalianID;
    }

    public void setPerwalianID(int perwalianID) {
        this.perwalianID = perwalianID;
    }

    public JadwalPerwalian getjPerwalian() {
        return jPerwalian;
    }

    public void setjPerwalian(JadwalPerwalian jPerwalian) {
        this.jPerwalian = jPerwalian;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }
    
    
    
    
}
