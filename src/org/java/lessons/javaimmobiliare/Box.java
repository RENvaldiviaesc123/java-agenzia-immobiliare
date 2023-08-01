package org.java.lessons.javaimmobiliare;

public class Box extends Immobili{
    //ATTRIBUTI
    private int postiAuto;

    //COSTRUTTORI

    public Box(String codice, String indirizzo, String cap, String citta, int areaInMq, int interessati, int postiAuto) {
        super(codice, indirizzo, cap, citta, areaInMq, interessati);
        this.postiAuto = postiAuto;
    }


    //SETTER e GETTER

    //METODI
        //Metodo toString
        @Override
        public String toString() {
            return super.toString() + ", Box{" +
                    "postiAuto=" + postiAuto +
                    "} " ;
        }
}
