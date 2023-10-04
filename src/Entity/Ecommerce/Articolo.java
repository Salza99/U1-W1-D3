package Entity.Ecommerce;

public class Articolo {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private Double prezzo;
    private int storeItems;

    public Articolo( String descrizioneArticolo, double prezzo) {
        this.codiceArticolo =(int) (0 + Math.floor(Math.random() * 100));
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.storeItems = 5;
    }
    public Articolo() {}

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", storeItems=" + storeItems +
                '}';
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getStoreItems() {
        return storeItems;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public void setStoreItems(int storeItems) {
        this.storeItems = storeItems;
    }
}
