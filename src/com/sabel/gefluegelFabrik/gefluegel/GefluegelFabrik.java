package com.sabel.gefluegelFabrik.gefluegel;

import com.sabel.Gefluegel;

public class GefluegelFabrik {

    private static GefluegelFabrik instance = new GefluegelFabrik();

    private GefluegelFabrik() {
        super();
    }

    //Klassenmethode
    public static GefluegelFabrik createInstance() {
        return instance;
    }

    public Gefluegel erzeugeGefluegel(String gefluegel) {
        switch (gefluegel) {
            case "Ente":
                return new Ente();
            case "Vogel":
                return new Vogel();
            default:
                System.out.println("Gefluegel nicht vorhanden");
        }
        return null;
    }
}
