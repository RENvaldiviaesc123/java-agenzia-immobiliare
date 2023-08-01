package org.java.lessons.javaimmobiliare;

public class Immobili {
    //ATTRIBUTI
    private String codice;
    private String indirizzo;
    private String cap;
    private String citta;
    private int areaInMq;
    private int interessati;

    //COSTRUTTORI

    public Immobili(String codice, String indirizzo, String cap, String citta, int areaInMq, int interessati) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.citta = citta;
        this.areaInMq = areaInMq;
        this.interessati = interessati;
    }


    //SETTER e GETTER

    //METODI
        //Metodo per aggiungere gli interessati all'acquisto dell'immobile

        //Metodo to string

    @Override
    public String toString() {
        return "Immobili{" +
                "codice='" + codice + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap='" + cap + '\'' +
                ", citta='" + citta + '\'' +
                ", areaInMq=" + areaInMq +
                ", interessati=" + interessati +
                '}';
    }
}
