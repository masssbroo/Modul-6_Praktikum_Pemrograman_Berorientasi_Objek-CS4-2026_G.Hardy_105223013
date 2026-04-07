import rental.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kendaraan> daftarRental = new ArrayList<>();

        // 1. Mobil lama (< 2015), kapasitas > 5
        daftarRental.add(new Mobil("B 1234 ABC", "Toyota Avanza", 2014, 300000, 7));
        
        // 2. Mobil baru (>= 2015), kapasitas <= 5
        daftarRental.add(new Mobil("B 5678 DEF", "Honda Civic", 2022, 600000, 5));
        
        // 3. Motor CC >= 250
        daftarRental.add(new Motor("B 9012 GHI", "Kawasaki Ninja", 2020, 250000, 250));
        
        // 4. Motor standar CC < 250
        daftarRental.add(new Motor("B 3456 JKL", "Yamaha Vixion", 2018, 100000, 150));

        System.out.println("======= SISTEM PENYEWAAN KENDARAAN =======");
        for (Kendaraan k : daftarRental) {
            k.displayInfo();
            double totalSewa = k.hitungHargaSewa(5);
            System.out.println("Total Biaya Sewa selama 5 Hari: Rp" + totalSewa);
            System.out.println("-------------------------------------------");
        }
    }
}