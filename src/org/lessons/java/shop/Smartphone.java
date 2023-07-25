package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    //CAMPI
    private int codiceimei;

    private int memoria;

    //COSTRUTTORI

    public Smartphone (String nome, String descrizione, double prezzo, double iva, int codiceimei, int memoria){

    super(nome,descrizione,prezzo,iva);

        this.codiceimei = codiceimei;
        this.memoria = memoria;
    }
}


//METODI

