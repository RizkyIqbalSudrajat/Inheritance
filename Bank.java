
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class Bank {
    public static void main(String[] args){
        Scanner nm = new Scanner(System.in);
        AkunPengguna p = new AkunPengguna();
        System.out.println("Identitas pengguna : ");
        
        System.out.print("Masukkan nama pengguna : ");
        String Nama = nm.nextLine();
        System.out.println("Nama pengguna : "+ Nama);
        
        p.nama = "Rizky Iqbal Sudrajat";
        p.jk = "Laki";
        p.sandiPengguna = 8890564;
        
        p.indentitasPengguna();
        p.status();
        System.out.println("Riwayat saldo yang sudah ditarik : "+p.Ceksaldo(250000));
        System.out.println("Jumlah saldo : "+ p.Ceksaldo(50000000));
        p.Ceksaldo(1500000);
        
        
}
    
  String  akun = "Kevin";
  public void indentitasPengguna(){
      //tampil pengguna
  }
  public void status(){
      //status pengguna
  }
}
          
  

  