package org.lessons.java.shop;

public class Cuffia extends Prodotto {

    //CAMPI

    private String colore;

    private boolean cablate;

    private boolean wireless;

    //COSTRUTTORI



    public Cuffia(String nome, String descrizione, double prezzo, double iva, String colore, boolean cablate, boolean wireless){

            super(nome, descrizione, prezzo, iva);
            this.colore = colore;
            this.cablate = cablate;
            this.wireless = wireless;
        }
    }


    //METODI




