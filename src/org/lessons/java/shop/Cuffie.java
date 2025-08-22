package org.lessons.java.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean isWirless;

    public Cuffie(String nome, String marca, double prezzo, int iva, String colore, boolean isWirless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.isWirless = isWirless;
    }

    @Override
    public String toString() {
        return String.format(
                "Sono state inserite le cuffie %s, della marca %s, che hanno prezzo %f, con iva inclusa al %d per cento, di colore %s con possibilita di wirless = %b",
                nome, marca, prezzo, iva, colore, isWirless);
    }

}
