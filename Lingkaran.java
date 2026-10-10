public class Lingkaran extends BentukGeometri {
    protected double r;
    public static final double PHI = 3.141592653589793;

    public Lingkaran(double r, String warna) {
        super(warna);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return PHI * r * r;
    }

    @Override
    public void cetakAtribut() {
        System.out.println("Lingkaran " + warnaDasar + ", luas = " + hitungLuas());
    }
}