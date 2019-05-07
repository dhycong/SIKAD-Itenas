/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farhandims
 */
public class Dosen {
    private int NIP;
    private String NamaDosen;
    
public Dosen (int NIP, String NamaDosen){
    this.NIP = NIP;
    this.NamaDosen = NamaDosen;
}

    public Dosen(){
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getNamaDosen() {
        return NamaDosen;
    }

    
}
