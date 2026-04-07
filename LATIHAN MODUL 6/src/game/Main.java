package game;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Bowo", 1000.0, 100.0); // Perwakilan Hero standar
        HeroStrength hero2 = new HeroStrength("Gatotkaca", 1500.0, 120.0); // Perwakilan HeroStrength

        System.out.println("=== DISPLAY AWAL ===");
        hero1.display();
        System.out.println("--------------------");
        hero2.display();
        System.out.println();

        System.out.println("=== KEDUA KARAKTER BERLATIH ===");
        hero1.berlatih();
        hero2.berlatih();
        System.out.println();

        System.out.println("=== TERKENA SERANGAN TIBA-TIBA (50 Damage) ===");
        hero1.terimaSerangan(50.0); 
        hero2.terimaSerangan(50.0); 
        System.out.println();

        System.out.println("=== DISPLAY AKHIR ===");
        hero1.display();
        System.out.println("--------------------");
        hero2.display();
    }
}