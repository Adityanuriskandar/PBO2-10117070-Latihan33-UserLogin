/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar
 * Kelas : PBO2/IF 2
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program User Login
 */
public class PBO210117070Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        User lgn = new User();
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username\t: ");
        String usr = scn.next();
        System.out.print("Masukkan Password\t: ");
        String psw = scn.next();
        System.out.println();

        lgn.pengecekanLogin(usr, psw);
    }

}
