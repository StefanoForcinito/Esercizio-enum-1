public class Triangolo extends Forma {

    private int base;

    private int altezza;

    public Triangolo(String nome, String descrizione,int base,int altezza) {
        super(nome, descrizione);
        setFormaEnum(TipoFormaEnum.TRIANGOLO);
        this.base = base;
        this.altezza = altezza;

    }

    @Override
    public void calcolaArea() {
        System.out.println("Area del " +this.getFormaEnum().getNome()+" è: ");
        System.out.println("base * altezza /2");

    }

}