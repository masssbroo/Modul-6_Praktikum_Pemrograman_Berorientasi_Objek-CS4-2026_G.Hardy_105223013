package minimarket;

public class MakananRingan extends Produk {
    String rasa;

    public MakananRingan(String namaProduk, double harga, String rasa) {
        super(namaProduk, harga); 
        this.rasa = rasa;
    }

    // Override fungsi penampil
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail(); 
        System.out.println("Rasa        : " + rasa);
    }
}