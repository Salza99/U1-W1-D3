package Entity.Ecommerce;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] listaArticoli;
    private double costoTotale;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public Articolo[] getListaArticoli() {
        return listaArticoli;
    }

    public void setListaArticoli(int n1, Articolo listaArticoli) {
        this.listaArticoli[n1] = listaArticoli;
    }

    public double getCostoTotale() {
        return costoTotale;
    }

    public void setCostoTotale(double costoTotale) {
        this.costoTotale = costoTotale;
    }
}
