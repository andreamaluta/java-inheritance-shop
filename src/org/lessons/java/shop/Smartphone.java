package org.lessons.java.shop;

public class Smartphone extends Prodotto {
    private long imeiCode;
    private int memoria;

    public Smartphone(String nome, String marca, double prezzo, int iva, long imeiCode, int memoria) {
        super(nome, marca, prezzo, iva);
        this.imeiCode = imeiCode;
        this.memoria = memoria;
    }

}
