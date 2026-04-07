package minimarket;

public class Main {
    public static void main(String[] args) {
        MakananRingan chitato = new MakananRingan("Chitato", 11500.0, "Sapi Panggang");
        
        System.out.println("=== Detail Inventaris Minimarket ===");
        chitato.tampilkanDetail();
    }
}