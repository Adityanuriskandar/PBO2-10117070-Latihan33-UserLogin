/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan33.userlogin;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar
 * Kelas : PBO2/IF 2
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program User Login
 */
public class User {

    String username = "Aditya";
    String password = "Four1";
    boolean status;

    public boolean cekAkun(String userName, String passWord) {

        if (userName.equals(username)) {
            status = true;
            
        } else if (passWord.equals(password)) {
            status = false;

        } else {
            status = false;
        }
        return status;

    }

    public void hasilLogin(boolean status, String userName) {
        if (status) {
            System.out.println("****** HALLO " + userName.toUpperCase()
                    + " ******");
            System.out.println("Selamat Datang di Aplikasi ini.");
        } else {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }

    public void pengecekanLogin(String userName, String passWord) {
        System.out.println(cekAkun(userName, passWord));
        hasilLogin(status, userName);
    }
}
