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
        //Getter per gli attributi

        public String getCodice() {
            return codice;
        }

        public String getIndirizzo() {
            return indirizzo;
        }

        public String getCap() {
            return cap;
        }

        public String getCitta() {
            return citta;
        }

        public int getAreaInMq() {
            return areaInMq;
        }

        public int getInteressati() {
            return interessati;
        }
        //Setter
        public void setAreaInMq(int areaInMq) {
            this.areaInMq = areaInMq;
        }


    //METODI
        //Metodo per aggiungere gli interessati all'acquisto dell'immobile

        //Metodo toString
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

        //Metodo reimposta superfici che prende in input una nuova superficie
        public int reimpostaSuperici () {
            public void reimpostaSuperfici(int areaInMq) {
                this.areaInMq = reimpostaSuperfici;
            }
            return reimpostaSuperici();
        }
}
