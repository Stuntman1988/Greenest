public abstract class Växter {

    private String namn; //Inkapsling
    private double höjd; //Inkapsling


    public Växter(String namn, double höjd) {
        this.namn = namn;
        this.höjd = höjd;
    }

    public void setHöjd(double höjd) {
        this.höjd = höjd;
    }

    public String getNamn() {
        return namn;
    }

    public double getHöjd() {
        return höjd;
    }

    public abstract String skrivUtTillString();

}

