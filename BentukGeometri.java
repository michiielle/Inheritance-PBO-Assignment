public class BentukGeometri {
    protected String warnaDasar;

    public BentukGeometri(String warnaDasar) {
        this.warnaDasar = warnaDasar;
    }

    public String getWarnaDasar() {
        return warnaDasar;
    }

    public void setWarnaDasar(String warnaDasar) {
        this.warnaDasar = warnaDasar;
    }

    public void cetakAtribut() {
        System.out.println("Bentuk berwarna " + warnaDasar);
    }
}