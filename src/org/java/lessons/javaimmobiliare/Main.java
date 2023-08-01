package org.java.lessons.javaimmobiliare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //VILLE
            Villa v1 = new Villa("VILLA01", "Via dei mille", "20152",
                    "Milano", 250, 5, 2, 5, 30);
            Villa v2 = new Villa("VILLA02", "Via del Duomo", "20126", "Milano", 360, 50,
                    5, 6, 50);

        //ABITAZIONI
            Abitazione a1 = new Abitazione("ABITAZIONE01", "Viale Monza", "20128", "Milano", 150, 30,
                    3, 5);
            Abitazione a2 = new Abitazione("ABITAZIONE02", "Viale Certosa", "20188", "Milano", 300,
                    10, 6, 8);

         //BOX
            Box b1 = new Box("BOX01", "Via Trento", "20153", "Milano", 20,5,2);
            Box b2 = new Box("BOX02", "Via Oxilia", "20147", "Milano", 12, 1,1);
                //Creiamo la lista con gli immobili
                    AgenziaImmobiliare agenziaImmobiliare = new AgenziaImmobiliare();
                        //Aggiungiamo gli immobili
                        agenziaImmobiliare.aggiungiImmobile(v1);
                        agenziaImmobiliare.aggiungiImmobile(v2);
                        agenziaImmobiliare.aggiungiImmobile(a1);
                        agenziaImmobiliare.aggiungiImmobile(a2);
                        agenziaImmobiliare.aggiungiImmobile(b1);
                        agenziaImmobiliare.aggiungiImmobile(b2);
            //Testiamo trova immobile per codice della classe AgenziaImmobiliare
            System.out.println(agenziaImmobiliare.trovaImmobilePerCodice("asdawd")); //null
            System.out.println(agenziaImmobiliare.trovaImmobilePerCodice("VILLA01")); //v1

            //Restituiamo l'immobile con più persone interessate
            System.out.println(agenziaImmobiliare.aumentoInteresse());

            //Aggiungiamo un immobile
            agenziaImmobiliare.aggiungiImmobile(new Villa("VILLA03", "Via dei Pazzi", "20158", "Meraviglie",
                    356, 6, 3, 6, 60));
                //Stampiamo il nuovo immobile
                System.out.println(agenziaImmobiliare.trovaImmobilePerCodice("VILLA03"));



    }
}
