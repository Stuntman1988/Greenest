public class Kaktus extends Växter {

    private String form; //Inkapsling
    final private double mängdVätskaPerDag = 0.2;
    BevattningsVätskor vätskaKaktus = BevattningsVätskor.MINERALVATTEN;

    public Kaktus(String namn, double höjd, String form) {
        super(namn, höjd);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public double getMängdVätskaPerDag() {
        return mängdVätskaPerDag;
    }

    public BevattningsVätskor getVätskaKaktus() {
        return vätskaKaktus;
    }

    @Override //Polymorfism
    public String skrivUtTillString() {
        return "Kaktusen " + getNamn() + " behöver " + mängdVätskaPerDag
                + " liter " + vätskaKaktus.toString().toLowerCase() + " per dag.";
    }
}
