public class Palm extends Växter implements IRäknaUtVätska {

    private boolean harKokosnötter; //Inkapsling
    final private double mängdVätskaPerDag = 0.5;
    final BevattningsVätskor vätskaPalm = BevattningsVätskor.KRANVATTEN;


    public Palm(String namn, double höjd, boolean harKokosnötter) {
        super(namn, höjd);
        this.harKokosnötter = harKokosnötter;
    }

    public double getMängdVätskaPerDag() {
        return mängdVätskaPerDag;
    }

    public boolean isHarKokosnötter() {
        return harKokosnötter;
    }

    public BevattningsVätskor getVätskaPalm() {
        return vätskaPalm;
    }

    @Override //Interface
    public double räknaUtMängdVätska() {
        return mängdVätskaPerDag * getHöjd();
    }

    @Override //Polymorfism
    public String skrivUtTillString() {
        return "Palmen " + getNamn() + " behöver " + räknaUtMängdVätska()
                + " liter " + vätskaPalm.toString().toLowerCase() + " per dag.";
    }
}
