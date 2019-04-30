package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
/**
 *
 * @author Adyth
 */
public class JadwalPerwalian {
    private String Semester;
    private String tahunAjaran;
    
  

    public JadwalPerwalian(String Semester, String tahunAjaran) {
        this.Semester = Semester;
        this.tahunAjaran = tahunAjaran;
    }

    public JadwalPerwalian() {
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }
            
             
}
    
    
