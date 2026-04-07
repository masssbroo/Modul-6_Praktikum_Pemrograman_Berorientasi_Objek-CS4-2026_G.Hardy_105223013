package game;

public class HeroStrength extends Hero {
    public String tipe = "Strength";

    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("Tipe         : " + this.tipe);
    }

    @Override
    public void terimaSerangan(double damage) {
        double damageMasuk = damage / 2;
        this.health -= damageMasuk;
        System.out.println(this.nama + " menggunakan pertahanan spesial!");
        System.out.println(this.nama + " hanya menerima serangan sebesar " + damageMasuk + " damage!");
    }
}