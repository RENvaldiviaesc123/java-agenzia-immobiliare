package org.java.lessons.javaimmobiliare;

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {
    //ATTRIBUTI
    private List<Immobili> listaImmobili;

    //COSTRUTTORI
    public AgenziaImmobiliare (){
        listaImmobili = new ArrayList<>();
    }

    //SETTER e GETTER

    //METODI
        //Metodo per aggiungere un immobile

        //Metodo per la ricerca di un immobile a partire dal codice alfanumerico
        public Immobili trovaImmobilePerCodice (String codice) {
            boolean trovato = false;
            int contatore = 0;
            Immobili immobileCercato = null;
            while (!trovato && contatore < listaImmobili.size()) {
                if (codice.equals(listaImmobili.get(contatore).getCodice())) {
                    immobileCercato = listaImmobili.get(contatore);
                    trovato = true;
                }
                contatore++;
            }
            return immobileCercato;
        }

        //Metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
}
