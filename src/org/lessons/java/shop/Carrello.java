package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] carrello = new String[0];
        boolean done = false;

        System.out
                .println(
                        "Se vuoi inserire un nuovo elemento premi 0 altrimenti se vuoi chiudere il carrello premi 4");

        while (!done) {

            int scelta = in.nextInt();

            if (scelta == 0) {

                System.out.println("Inserire il nome, la marca il prezzo e l'iva del prodotto che vuoi inserire");
                String objName = in.next();
                String objMarca = in.next();
                double objPrice = in.nextDouble();
                int objIva = in.nextInt();

                System.out.println("Se stai inserendo un televisore premi 1");
                System.out.println("Se stai inserendo delle cuffie premi 2");
                System.out.println("Se stai inserendo uno smartphone premi 3");

                int scelta1 = in.nextInt();

                if (scelta1 == 1) {
                    System.out.println("Inserisci la dimensione e se la tv è smart o no");
                    int dim = in.nextInt();
                    boolean isSmart = in.nextBoolean();
                    Televisore tv = new Televisore(objName, objMarca, objPrice, objIva, dim, isSmart);
                    String[] newCarrello = new String[carrello.length + 1];
                    for (int i = 0; i < carrello.length; i++) {
                        newCarrello[i] = carrello[i];
                    }
                    newCarrello[newCarrello.length - 1] = tv.toString();
                    carrello = newCarrello;
                } else if (scelta1 == 2) {
                    System.out.println("Inserisci il colore e se le cuffie sono cablate oppure wirless");
                    String color = in.next();
                    boolean isWirless = in.nextBoolean();
                    Cuffie cuffie = new Cuffie(objName, objMarca, objPrice, objIva, color, isWirless);
                    String[] newCarrello = new String[carrello.length + 1];
                    for (int i = 0; i < carrello.length; i++) {
                        newCarrello[i] = carrello[i];
                    }
                    newCarrello[newCarrello.length - 1] = cuffie.toString();
                    carrello = newCarrello;
                } else if (scelta1 == 3) {
                    System.out.println("Inserisci il codice imei e la quantità di memoria del cellulare");
                    long imei = in.nextLong();
                    int mem = in.nextInt();
                    Smartphone cell = new Smartphone(objName, objMarca, objPrice, objIva, imei, mem);
                    String[] newCarrello = new String[carrello.length + 1];
                    for (int i = 0; i < carrello.length; i++) {
                        newCarrello[i] = carrello[i];
                    }
                    newCarrello[newCarrello.length - 1] = cell.toString();
                    carrello = newCarrello;
                }

                System.out
                        .println(
                                "Se vuoi inserire un altro elemento premi 0 altrimenti se vuoi chiudere il carrello premi 4");

            } else if (scelta == 4) {
                done = true;
            }

        }

        System.out.println("Il carrello completo è: ");
        for (int i = 0; i < carrello.length; i++) {
            System.out.println(carrello[i]);
        }

        in.close();

    }
}
