/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Matakuliah;

/**
 *
 * @author HP
 */
public class Perwalian {
    private String date;
    private String status;
    
    Matakuliah matkul=new Matakuliah();

    public Perwalian(String date, String status) {
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
    
    
    
    
}
