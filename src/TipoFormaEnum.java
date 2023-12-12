public enum TipoFormaEnum {



    TRIANGOLO("triangolo"),

    RETTANGOLO("rettangolo");

    private String nome;

    TipoFormaEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
