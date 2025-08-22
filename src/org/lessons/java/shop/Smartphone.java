package org.lessons.java.shop;

public class Smartphone extends Prodotto {
    private long imeiCode;
    private int memoria;

    public Smartphone(String nome, String marca, double prezzo, int iva, long imeiCode, int memoria) {
        super(nome, marca, prezzo, iva);
        this.imeiCode = imeiCode;
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return String.format(
                "E' stato inserito uno smartphone %s, della marca %s, che ha prezzo %f, con iva inclusa al %d per cento, con codice imei %d e con quantità di memoria pari a %d",
                nome, marca, prezzo, iva, imeiCode, memoria);
    }

}
