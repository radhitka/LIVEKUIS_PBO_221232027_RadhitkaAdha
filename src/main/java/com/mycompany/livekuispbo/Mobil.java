/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livekuispbo;

/**
 *
 * @author Radit
 */
public class Mobil extends Mesin {
    private String nama;
    
    public Mobil(String nama){
        this.nama = nama;
    }
    
    public void info(){
        System.out.println("=======");
        System.out.println("Jenis mobil : " +this.nama);
        System.out.println("Kecepatan sekarang :" + super.getKecepatan());
        System.out.println("Kecepatan maximal :" + super.getKecepatanMax());
        System.out.println("Kecepatan minimun :" + super.getKecepatanMin());
    }
}
