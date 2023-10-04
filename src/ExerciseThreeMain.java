import Entity.Ecommerce.Articolo;
import Entity.Ecommerce.Carrello;
import Entity.Ecommerce.Cliente;
import netscape.javascript.JSObject;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExerciseThreeMain {
    public static void main(String[] args) {

        //creo gli articoli del mio negozio
        Articolo tShirt = new Articolo("color: black, size: 'M', 100% cotton", 9.99);
        Articolo hat = new Articolo("color: white, 100% cotton", 19.99);
        Articolo shoes = new Articolo("color: brown, elegant", 39.99);
        Articolo sweatshirt = new Articolo("color: white, size: 'M', 100% cotton", 14.99);
        Articolo trousers = new Articolo("color: darkBlue, size: '44', 100% cotton", 24.99);

        // creo un evento Data da inserire nel costruttore del cliente
        Date dataPrimaIscrizione = new Date(120, 4, 12);
        Date dataSecondaIscrizione = new Date(120, 6, 21);

        //creo i clienti del mio negozio
        Cliente a = new Cliente("Mario Rossi", "Mariorossi99@gmail.com", dataPrimaIscrizione);
        Cliente b = new Cliente("Luigi Verdi", "Luigiverdi@gmail.com", dataSecondaIscrizione);





        //creo un applicativo in console
        runApplication(a, b, tShirt, hat, shoes, sweatshirt, trousers );




    }
    public static void runApplication (Cliente a, Cliente b, Articolo tShirt, Articolo hat, Articolo shoes, Articolo sweatshirt, Articolo trousers) {
        //controllo per chiusura applicazione
        Scanner input = new Scanner(System.in);
        while (true) {


            System.out.println("esci(0) acquista (1)");
            String respExitOrBuy = input.nextLine();
            if (respExitOrBuy.equals("1")){
            System.out.println("seleziona un utente (a, b)");
            String resp = input.nextLine();
            Cliente selezionato = resp.equals("a") ? a : b;
            Carrello carrelloAssociato;
            if (selezionato.getCarrelloAssociato() == null) {

                 carrelloAssociato = new Carrello(selezionato);
                 selezionato.setCarrelloAssociato(carrelloAssociato);
            }else {
                 carrelloAssociato = selezionato.getCarrelloAssociato();
            }

            while (true){

            System.out.println("Benvenuto " + selezionato.getAnagraphic());
            System.out.println("selezioni un articolo da mettere nel carrello (tShirt, hat, shoes, sweatshirt, trousers");
            String articleSelected = input.nextLine();
            Articolo[] store = new Articolo[]{};
            switch (articleSelected) {

                case "tShirt":
                    store = new Articolo[carrelloAssociato.getListaArticoli().length + 1];
                    for (int i = 0; i < store.length; i++) {
                        if (i == store.length - 1) {
                        store[i] = tShirt;
                    } else {
                            store[i] = carrelloAssociato.getListaArticoli()[i];
                        }
                    }
                    carrelloAssociato.setListaArticoli(store);
                    System.out.println("articoli in possesso: " + carrelloAssociato);
                    System.out.println("numero articoli in carrello: " + carrelloAssociato.getListaArticoli().length);
                    carrelloAssociato.setCostoTotale(tShirt.getPrezzo());
                    break;
                    case "hat":
                        store = new Articolo[carrelloAssociato.getListaArticoli().length + 1];
                    for (int i = 0; i < store.length; i++) {
                        if (i == store.length - 1) {
                        store[i] = hat;
                    } else {
                            store[i] = carrelloAssociato.getListaArticoli()[i];
                        }
                    }
                    carrelloAssociato.setListaArticoli(store);
                    System.out.println("articoli in possesso: " + carrelloAssociato);
                    System.out.println("numero articoli in carrello: " + carrelloAssociato.getListaArticoli().length);
                        carrelloAssociato.setCostoTotale(hat.getPrezzo());
                    break;
                    case "shoes":
                    store = new Articolo[carrelloAssociato.getListaArticoli().length + 1];
                    for (int i = 0; i < store.length; i++) {
                        if (i == store.length - 1) {
                        store[i] = shoes;
                    } else {
                            store[i] = carrelloAssociato.getListaArticoli()[i];
                        }
                    }
                    carrelloAssociato.setListaArticoli(store);
                    System.out.println("articoli in possesso: " + carrelloAssociato);
                    System.out.println("numero articoli in carrello: " + carrelloAssociato.getListaArticoli().length);
                        carrelloAssociato.setCostoTotale(shoes.getPrezzo());
                    break;
                    case "sweatshirt":
                        store = new Articolo[carrelloAssociato.getListaArticoli().length + 1];
                    for (int i = 0; i < store.length; i++) {
                        if (i == store.length - 1) {
                        store[i] = sweatshirt;
                    } else {
                            store[i] = carrelloAssociato.getListaArticoli()[i];
                        }
                    }
                    carrelloAssociato.setListaArticoli(store);
                    System.out.println("articoli in possesso: " + carrelloAssociato);
                    System.out.println("numero articoli in carrello: " + carrelloAssociato.getListaArticoli().length);
                        carrelloAssociato.setCostoTotale(sweatshirt.getPrezzo());
                    break;
                    case "trousers":
                        store = new Articolo[carrelloAssociato.getListaArticoli().length + 1];
                    for (int i = 0; i < store.length; i++) {
                        if (i == store.length - 1) {
                        store[i] = trousers;
                    } else {
                            store[i] = carrelloAssociato.getListaArticoli()[i];
                        }
                    }
                    carrelloAssociato.setListaArticoli(store);
                    System.out.println("articoli in possesso: " + carrelloAssociato);
                    System.out.println("numero articoli in carrello: " + carrelloAssociato.getListaArticoli().length);
                        carrelloAssociato.setCostoTotale(trousers.getPrezzo());
                    break;

                default:
                    System.out.println("Articolo non valido.");
                    break;

            }
            System.out.println("Si desiderano fare altri acquisti? (s, n)");
            String respSecond = input.nextLine();
            if (respSecond.equals("n")) {
                System.out.println("totale carrello: " + carrelloAssociato.getCostoTotale().floatValue() + " €");
                System.out.println("Salda carrello (1) abortire programma(2)");
                String respAbort = input.nextLine();
                if (respAbort.equals("1")) {
                    carrelloAssociato.setCostoTotale("ciao");
                }else {
                    break;
                }




            }}}
            else {input.close();
                break;}
        }
    }

}
