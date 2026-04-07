package rental;

public class Kendaraan {
    protected String nomorPolisi;
    protected String merk;
    protected int tahunProduksi;
    protected double hargaSewaDasar;

    public Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void displayInfo() {
        System.out.println("No. Polisi    : " + nomorPolisi);
        System.out.println("Merk          : " + merk);
        System.out.println("Tahun         : " + tahunProduksi);
        System.out.println("Harga Dasar   : Rp" + hargaSewaDasar);
    }

    public double hitungHargaSewa(int hari) {
        double total = hargaSewaDasar * hari;
        if (tahunProduksi < 2015) {
            total -= (0.1 * total);
        }
        return total;
    }
}