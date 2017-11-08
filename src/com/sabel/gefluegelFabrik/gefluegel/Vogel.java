package com.sabel.gefluegelFabrik.gefluegel;

import com.sabel.Gefluegel;

public class Vogel implements Gefluegel {

    //Paketsicher: Nur Klassen, die im selben Paket liegen dürfen darauf zugreifen
    Vogel() {
        super();
    }

    @Override
    public void fliegen() {
        System.out.println("Piep piep");
    }
}
