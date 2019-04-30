/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhycong
 */
public class Matakuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private int SKS;
    private String jadwal;
    private String ruang;

    public Matakuliah() {
    }

    public Matakuliah(String kodeMatkul, String namaMatkul, int SKS, String jadwal, String ruang) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.SKS = SKS;
        this.jadwal = jadwal;
        this.ruang = ruang;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getRuang() {
        return ruang;
    }

    public void setRuang(String ruang) {
        this.ruang = ruang;
    }
    
    
    
    
    
}
