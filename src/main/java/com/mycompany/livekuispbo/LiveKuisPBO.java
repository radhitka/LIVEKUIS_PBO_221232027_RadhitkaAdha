/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livekuispbo;

/**
 *
 * @author Radit
 */
public class LiveKuisPBO {

    public static void main(String[] args) {
        Mobil honda = new Mobil("honda");
        honda.nyalakanMesin();
        honda.tambahKecepatan(10);
        honda.kurangKecepatan(5);
        honda.info();

        Mobil suzuki = new Mobil("suzuki");
        suzuki.nyalakanMesin();
        suzuki.setKecepatanMax(150);
        suzuki.tambahKecepatan(15);
        suzuki.kurangKecepatan(10);
        suzuki.info();

        Mobil nisan = new Mobil("nisan");
        nisan.nyalakanMesin();
        nisan.tambahKecepatan(20);
        nisan.kurangKecepatan(15);
        nisan.info();
    }
}
