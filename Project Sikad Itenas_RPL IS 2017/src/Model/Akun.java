package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhycong
 */
abstract class Akun {
    private String akunID;
    private String name;
    private String email;
    private String password;

    public Akun() {
    }

    public Akun(String name, String email, String password) {
        this.akunID = akunID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getAkunID() {
        return akunID;
    }

    public void setAkunID(String akunID) {
        this.akunID = akunID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void LogIn() {
        System.out.println("Menu Log In");
    }
}
