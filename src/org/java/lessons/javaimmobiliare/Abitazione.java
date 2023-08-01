package org.java.lessons.javaimmobiliare;

public class Abitazione extends Immobili{
    //ATTRIBUTI
    private int numBagni;
    private int numVani;

    //COSTRUTTORI

    public Abitazione(String codice, String indirizzo, String cap, String citta, int areaInMq, int interessati, int numBagni, int numVani) {
        super(codice, indirizzo, cap, citta, areaInMq, interessati);
        this.numBagni = numBagni;
        this.numVani = numVani;
    }

    //SETTER e GETTER
        //Getter per gli attributi
        public int getNumBagni() {
            return numBagni;
        }

        public int getNumVani() {
            return numVani;
        }

    //METODI
        //Metodo toString
        @Override
        public String toString() {
            return super.toString() + ", Abitazione{" +
                    "numBagni=" + numBagni +
                    ", numVani=" + numVani +
                    "} ";
        }
}
