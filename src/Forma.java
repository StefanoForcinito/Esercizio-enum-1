public class Forma {

    private String nome;

    private String descrizione;

    private TipoFormaEnum formaEnum;




    public Forma(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;

    }

    public String getNome() {
        return nome;
    }

    public TipoFormaEnum getFormaEnum() {
        return formaEnum;
    }

    public void setFormaEnum(TipoFormaEnum formaEnum) {
        this.formaEnum = formaEnum;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void calcolaArea() {
        System.out.println("calcola area");
    }
}







