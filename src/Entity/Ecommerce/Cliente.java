package Entity.Ecommerce;

import java.util.Date;

public class Cliente {
    private int codiceCliente;
    private String anagraphic;
    private String email;
    private Date dataIscrizione;
    private Carrello carrelloAssociato;

    public Cliente(String anagraphic, String email, Date dataIscrizione) {
        this.codiceCliente = (int) (0 + Math.floor(Math.random() * 100));
        this.anagraphic = anagraphic;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }
    public Cliente () {}

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public String getAnagraphic() {
        return anagraphic;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }

    public Carrello getCarrelloAssociato() {
        return carrelloAssociato;
    }

    public void setCarrelloAssociato(Carrello carrelloAssociato) {
        this.carrelloAssociato = carrelloAssociato;
    }
}
