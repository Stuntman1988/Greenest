public class Köttätande extends Växter implements IRäknaUtVätska {

    private int antalTänder; //Inkapsling
    final private double mängdVätskaPerDagBas = 0.1;
    final private double mängdVätskaPerDag = 0.2;
    BevattningsVätskor vätskaKöttätande = BevattningsVätskor.PROTEINDRYCK;

    public Köttätande(String namn, double höjd, int antalTänder) {
        super(namn, höjd);
        this.antalTänder = antalTänder;
    }

    public int getAntalTänder() {
        return antalTänder;
    }

    public double getMängdVätskaPerDagBas() {
        return mängdVätskaPerDagBas;
    }

    public double getMängdVätskaPerDag() {
        return mängdVätskaPerDag;
    }

    public BevattningsVätskor getVätskaKöttätande() {
        return vätskaKöttätande;
    }

    @Override //Interface
    public double räknaUtMängdVätska() {
        return ((mängdVätskaPerDag * getHöjd()) + mängdVätskaPerDagBas);
    }

    @Override //Polymorfism
    public String skrivUtTillString() {
        return "Köttätande växten " + getNamn() + " behöver " + räknaUtMängdVätska()
                + " liter " + vätskaKöttätande.toString().toLowerCase() + " per dag.";
    }
}
