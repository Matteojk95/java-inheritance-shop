package org.lessons.java.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ;
        String sceltautente = scan.nextLine();
        ArrayList<Prodotto> carrello = new ArrayList<>();

        while (true) {
            System.out.println("stai inserendo uno Smartphone,un Televisore o una Cuffia?");
            String tipoProdotto = scan.nextLine();

            if (tipoProdotto.equalsIgnoreCase("esci")) {
                break;
            }
            System.out.println("inserisci il codice del prodotto");
            int codice = Integer.parseInt(scan.nextLine());
            System.out.println("inserisci il nome del prodotto");
            String nome = scan.nextLine();
            System.out.println("inserisci la descrizione del prodotto");
            String descrizione = scan.nextLine();
            System.out.println("inserisci il prezzo del prodotto");
            double prezzo = scan.nextInt();
            System.out.println("inserisci l'iva del prodotto");
            double iva = scan.nextInt();


            if (sceltautente.equals(new Smartphone)) {
                System.out.println("inserisci il codice imei");
                int codiceimei = scan.nextInt();
                System.out.println("inserisci la memoria");
                int memoria = scan.nextInt();

            } else if (sceltautente.equals (new Televisore)) {
                System.out.println("inserisci height");
                int height = scan.nextInt();
                System.out.println("inserisci lenght");
                int lenght = scan.nextInt();
                System.out.println("il televisore è smart? si/no");
                boolean issmart = scan.nextLine().equalsIgnoreCase("si");

            } else (sceltautente.equals(new Cuffia)) {
                System.out.println("inserisci il colore");
                String colore = scan.nextLine();
                System.out.println("sono cablate? si/no");
                boolean cablate = scan.nextLine().equalsIgnoreCase("si");

            }


            Prodotto prodotto = new Prodotto("iphone12", "belatelefono", 500, 4);

            System.out.println(prodotto.getCodice());
            System.out.println(prodotto.getprezzoconiva());
            System.out.println(prodotto.getCodiceNome());


        }
    }
}