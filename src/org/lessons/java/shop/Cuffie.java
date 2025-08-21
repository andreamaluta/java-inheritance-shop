package org.lessons.java.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean isWirless;

    public Cuffie(String nome, String marca, double prezzo, int iva, String colore, boolean isWirless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.isWirless = isWirless;
    }

}
