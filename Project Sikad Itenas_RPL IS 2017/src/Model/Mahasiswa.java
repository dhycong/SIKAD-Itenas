/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class Mahasiswa extends Akun {
    private String NRP;
    private String Prodi;

    public Mahasiswa() {
    }

    public Mahasiswa(String NRP, String Prodi) {
        this.NRP = NRP;
        this.Prodi = Prodi;
    }

    public Mahasiswa(String name, String email, String password) {
        super(name, email, password);
    }

    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }
}
