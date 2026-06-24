package tugas;

// Nama : Muhammad Rifqi Hidayat
// NPM  : 2410010611

public class MainTugas {

    public static void main(String[] args) {

        String[] kategori = {
            "Makanan",
            "Minuman",
            "Elektronik"
        };

        System.out.println("=== KATEGORI ===");

        for (String k : kategori) {
            System.out.println(k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(
                new Barang("Beras", 15000, 10));

        gudang.tambahBarang(
                new Barang("Gula", 18000, 8));

        gudang.tambahBarang(
                new Barang("Minyak", 20000, 5));

        gudang.tambahBarang(
                new Barang("Teh", 12000, 15));

        gudang.tambahBarang(
                new Barang("Kopi", 25000, 7));

        System.out.println("=== DATA AWAL ===");
        gudang.tampilkanSemua();

        gudang.simpanKeBerkas();

        System.out.println("\n=== DATA DARI FILE ===");

        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        gudangBaru.tampilkanSemua();

        System.out.println(
                "\nTotal Nilai Persediaan = Rp "
                + gudangBaru.totalNilai());
    }
}