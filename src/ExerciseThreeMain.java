import Entity.Ecommerce.Articolo;
import Entity.Ecommerce.Carrello;
import Entity.Ecommerce.Cliente;

import java.util.Date;

public class ExerciseThreeMain {
    public static void main(String[] args) {

        //creo gli articoli del mio negozio
        Articolo tShirt = new Articolo("color: black, size: 'M', 100% cotton", 9.99);
        Articolo hat = new Articolo("color: white, 100% cotton", 19.99);
        Articolo shoe = new Articolo("color: brown, elegant", 39.99);
        Articolo Sweatshirt = new Articolo("color: white, size: 'M', 100% cotton", 14.99);
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
    }
}
