package Entity.Ecommerce;

import java.util.Date;

public class Cliente {
    private int codiceCliente;
    private String anagraphic;
    private String email;
    private Date dataIscrizione;

    public Cliente(String anagraphic, String email, Date dataIscrizione) {
        this.codiceCliente = (int) (0 + Math.floor(Math.random() * 100));
        this.anagraphic = anagraphic;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

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
}
