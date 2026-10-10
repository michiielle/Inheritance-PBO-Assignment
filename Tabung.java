public class Tabung extends Lingkaran {
    private double tinggiTabung;

    public Tabung(double tinggiTabung, double r, String warna) {
        super(r, warna);
        this.tinggiTabung = tinggiTabung;
    }

    public double getTinggiTabung() {
        return tinggiTabung;
    }

    public void setTinggiTabung(double tinggiTabung) {
        this.tinggiTabung = tinggiTabung;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggiTabung;
    }

    @Override
    public void cetakAtribut() {
        System.out.println("Silinder " + warnaDasar + ", volume = " + hitungVolume());
    }
}