package org.lessons.java.shop;

public class Prodotto {
    private int codice;
    protected String nome;
    protected String marca;
    protected double prezzo;
    protected int iva;

    public Prodotto(String nome, String marca, double prezzo, int iva) {
        this.codice = (int) (Math.random() * 1001);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getIva() {
        return this.iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

}
