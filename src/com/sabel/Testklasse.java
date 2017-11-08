package com.sabel;

import com.sabel.gefluegelFabrik.gefluegel.GefluegelFabrik;

public class Testklasse {

    public static void main(String[] args) {

        GefluegelFabrik gf = GefluegelFabrik.createInstance();
        GefluegelFabrik gf2 = GefluegelFabrik.createInstance();

        if (gf == gf2){
            System.out.println("Referenz gleich");
        }else{
            System.out.println("Referenz ungleich");
        }

        gf2.erzeugeGefluegel("Ente").fliegen();
        Gefluegel ente = gf.erzeugeGefluegel("Ente");
        if(ente != null){
            ente.fliegen();
        }
        Gefluegel vogel = gf.erzeugeGefluegel("Vogel");
        if (vogel != null){
            vogel.fliegen();
        }
        Gefluegel vogel2 = gf.erzeugeGefluegel("Vogedl");
        if (vogel2 != null){
            vogel2.fliegen();
        }

//        Gefluegel blubb = new Ente();  // Da Testklasse nicht im gleichen Paket wie die Ente, keine Objekterzeugung möglich
    }


}
