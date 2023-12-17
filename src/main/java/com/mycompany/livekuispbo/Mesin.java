/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livekuispbo;

/**
 *
 * @author Radit
 */
public class Mesin {
    private int kecepatan;
    private int kecepatanMax;
    private int kecepatanMin;
    private boolean mesinNyala;

    public Mesin() {
        this.kecepatanMax = 300;
        this.kecepatanMin = 0;
        this.mesinNyala = false;
    }

    public void setKecepatanMax(int kecepatanMax) {
        this.kecepatanMax = kecepatanMax;
    }

    public int getKecepatanMax() {
        return this.kecepatanMax;
    }
    
    public int getKecepatanMin() {
        return this.kecepatanMin;
    }

    public int getKecepatan() {
        return this.kecepatan;
    }

    public void tambahKecepatan(int kecepatan) {
        
        if (this.mesinNyala == false) {
            return;
        }
        
        int total = this.kecepatan + kecepatan;
        if (total > this.kecepatanMax) {
            return;
        }
        this.kecepatan = total;

        return;
    }

    public void kurangKecepatan(int kecepatan) {
        
         if (this.mesinNyala == false) {
            return;
        }
        
        int total = kecepatan - this.kecepatan;
        if (total < this.kecepatanMin) {
            return;
        }
        this.kecepatan = total;

        return;
    }

    public void setMaximum(int kecepatanMax) {
        this.kecepatanMax = kecepatanMax;
    }

    public void nyalakanMesin() {
        this.mesinNyala = true;
    }

    public void matikanMesin() {
        this.mesinNyala = false;
    }
}
