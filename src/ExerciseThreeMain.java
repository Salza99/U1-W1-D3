import Entity.Ecommerce.Articolo;
import Entity.Ecommerce.Carrello;
import Entity.Ecommerce.Cliente;

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

        // associo i carrelli dei due clienti

        Carrello aC = new Carrello(a);
        Carrello bC = new Carrello(b);

        //creo un applicativo in console
        runApplication(a, b, tShirt, hat, shoes, sweatshirt, trousers );

        //controllo per chiusura applicazione
        String close = ":q";

    }
    public static void runApplication (Cliente a, Cliente b, Articolo tShirt, Articolo hat, Articolo shoes, Articolo sweatshirt, Articolo trousers) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("seleziona un utente (a, b)");
            String resp = input.nextLine();
            Cliente selezionato = resp.equals("a") ? a : b;
            Carrello carrelloAssociato = new Carrello(selezionato);
            System.out.println("Benvenuto " + selezionato.getAnagraphic());
            System.out.println("selezioni un articolo da mettere nel carrello (tShirt, hat, shoes, sweatshirt, trousers");
            String articleSelected = input.nextLine();
            switch (articleSelected) {
                case "tshirt":
                    carrelloAssociato.setListaArticoli(0, tShirt);
                    System.out.println(carrelloAssociato.getListaArticoli());
                    break;
                case "hat":
                    carrelloAssociato.setListaArticoli(1, hat);
                    System.out.println(carrelloAssociato.getListaArticoli());
                    break;
                case "shoes":
                    carrelloAssociato.setListaArticoli(2, shoes);
                    System.out.println(carrelloAssociato.getListaArticoli());
                    break;
                case "sweatshirt":
                    carrelloAssociato.setListaArticoli(3, sweatshirt);
                    System.out.println(carrelloAssociato.getListaArticoli());
                    break;
                case "trousers":
                    carrelloAssociato.setListaArticoli(4, trousers);
                    System.out.println(carrelloAssociato.getListaArticoli());
                    break;
                default:
                    System.out.println("Articolo non valido.");
                    break;
            }
            System.out.println("Si desiderano fare altri acquisti? (s, n)");
            String respSecond = input.nextLine();
            if (respSecond.equals("s")) {
                System.out.println("selezioni un articolo da mettere nel carrello (tShirt, hat, shoes, sweatshirt, trousers");

            }
        }
    }

}
