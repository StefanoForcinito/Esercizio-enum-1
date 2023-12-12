public class Rettangolo extends Forma {


    private int base;

    private int altezza;


    public Rettangolo(String nome, String descrizione,int base, int altezza) {
        super(nome, descrizione);
        setFormaEnum(TipoFormaEnum.RETTANGOLO);
        this.base = base;
        this.altezza = altezza;



    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("Area del " +this.getFormaEnum().getNome()+" è: ");
        System.out.println("base * altezza");

    }
}
