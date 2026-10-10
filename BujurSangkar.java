public class BujurSangkar extends BentukGeometri {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi, String warna) {
        super(warna);
        this.panjangSisi = panjangSisi;
    }

    public double getPanjangSisi() {
        return panjangSisi;
    }

    public void setPanjangSisi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    @Override
    public void cetakAtribut() {
        System.out.println("Bujursangkar berwarna " + warnaDasar + ", luas = " + hitungLuas());
    }
}