package Entity.Ecommerce;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] listaArticoli;
    private double costoTotale;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }
}
