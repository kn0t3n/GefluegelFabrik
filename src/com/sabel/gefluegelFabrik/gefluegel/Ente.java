package com.sabel.gefluegelFabrik.gefluegel;

import com.sabel.Gefluegel;

public class Ente implements Gefluegel {

    //Paketsicher: Nur Klassen, die im selben Paket liegen dürfen darauf zugreifen
    Ente(){
        super();
    }

    @Override
    public void fliegen() {
        System.out.println("Gack gack");
    }
}
