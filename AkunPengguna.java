/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class AkunPengguna {
     public String nama,jk;
    public int sandiPengguna;
    public int totalSaldo, pendapatanMaksimal;
    
    //override
    public void indentitasPengguna(){
        System.out.println("Nama panjang : "+nama);
        System.out.println("Jenis kelamin : "+jk);
        System.out.println("Nomor Pegawai"+sandiPengguna);
        
        
        
    }
    //override
    public void status(){
        System.out.println("Status pengguna : "+super.toString());
        
    }
    //overloading
    public int Ceksaldo(int PendapatanGaji){
        this.totalSaldo = totalSaldo ;
        return totalSaldo;
        
        
    }
    public void Gaji(double pendaptanMaksimal){
        System.out.println("Gaji Maksimal"+pendapatanMaksimal);
        
    }
    
            
    
    
}

    

