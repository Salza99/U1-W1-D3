package Entity.Ecommerce;

import java.util.Arrays;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] listaArticoli = new Articolo[0];
    private double costoTotale;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }
    public Carrello() {}

    @Override
    public String toString() {
        return "Carrello{" +
                "listaArticoli=" + Arrays.toString(listaArticoli) +
                '}';
    }

    public Articolo[] getListaArticoli() {
        return listaArticoli;
    }

    public void setListaArticoli( Articolo[] a) {
        this.listaArticoli = a;
    }

    public Double getCostoTotale() {
        return costoTotale;
    }

    public void setCostoTotale(Double n1) {
        this.costoTotale += n1;

    }
    public void setCostoTotale(String a) {
        this.costoTotale = 0;
    }
}
