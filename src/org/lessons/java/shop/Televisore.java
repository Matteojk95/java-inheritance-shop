package org.lessons.java.shop;

public class Televisore extends Prodotto{
    //CAMPI

    private int height;

    private int lenght;

    private boolean smart;

    //COSTRUTTORI

    public Televisore(String nome, String descrizione, double prezzo, double iva, int height, int lenght, boolean smart){


        super(nome, descrizione, prezzo, iva);
        this.height = height;
        this.lenght = lenght;
        this.smart = smart;
    }



}

//METODI

