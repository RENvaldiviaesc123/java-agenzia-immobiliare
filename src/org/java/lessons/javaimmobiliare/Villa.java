package org.java.lessons.javaimmobiliare;

public class Villa extends Abitazione{
    //ATTRIBUTI
    private int mqGiardino;

    //COSTRUTTORI

    public Villa(String codice, String indirizzo, String cap, String citta, int areaInMq, int interessati,
                 int numBagni, int numVani, int mqGiardino) {
        super(codice, indirizzo, cap, citta, areaInMq, interessati, numBagni, numVani);
        this.mqGiardino = mqGiardino;
    }


    //SETTER e GETTER
        //Getter per gli attributi
        public int getMqGiardino() {
            return mqGiardino;
        }

    //METODI
        //Metodo toString
        @Override
        public String toString() {
            return super.toString() + ", Villa{" +
                    "mqGiardino=" + mqGiardino +
                    "} ";
        }
}
