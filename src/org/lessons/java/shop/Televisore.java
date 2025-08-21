package org.lessons.java.shop;

public class Televisore extends Prodotto {
    private int dimensione;
    private boolean isSmart;

    public Televisore(String nome, String marca, double prezzo, int iva, int dimensione, boolean isSmart) {
        super(nome, marca, prezzo, iva);
        this.dimensione = dimensione;
        this.isSmart = isSmart;
    }

    public int getDimensione() {
        return this.dimensione;
    }

    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }

    public boolean getSmart() {
        return this.isSmart;
    }

    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

}
