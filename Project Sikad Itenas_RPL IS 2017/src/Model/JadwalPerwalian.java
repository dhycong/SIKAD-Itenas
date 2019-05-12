package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Adyth
 */
public class JadwalPerwalian {
    private int jadwalPerwalianID;
    private String semester;
    private String tahunAjaran;
    private String startDate;
    private String endDate;

    public JadwalPerwalian(int jadwalPerwalianID, String semester, String tahunAjaran, String startDate, String endDate) {
        this.jadwalPerwalianID = jadwalPerwalianID;
        this.semester = semester;
        this.tahunAjaran = tahunAjaran;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public JadwalPerwalian() {
    }

    public int getJadwalPerwalianID() {
        return jadwalPerwalianID;
    }

    public void setJadwalPerwalianID(int jadwalPerwalianID) {
        this.jadwalPerwalianID = jadwalPerwalianID;
    }

  
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }            
}
    
    
