package bagian3.kontak;

public class MainKontak {

    public static void main(String[] args) {

        BukuKontak buku = new BukuKontak("kontak.txt");

        buku.tambahKontak(
                new Kontak(
                        "Andi",
                        "0811111",
                        "andi@gmail.com"
                )
        );

        buku.tambahKontak(
                new Kontak(
                        "Budi",
                        "0822222",
                        "budi@gmail.com"
                )
        );

        buku.tambahKontak(
                new Kontak(
                        "Citra",
                        "0833333",
                        "citra@gmail.com"
                )
        );

        System.out.println("DATA AWAL");
        buku.tampilkanSemua();

        buku.simpanKeBerkas();

        System.out.println("\nMENCARI KONTAK");
        buku.cariKontak("Budi");

        System.out.println("\nMENGHAPUS KONTAK");
        buku.hapusKontak("Budi");

        System.out.println("\nSETELAH DIHAPUS");
        buku.tampilkanSemua();

        System.out.println("\nMEMUAT DARI FILE");

        BukuKontak bukuBaru = new BukuKontak("kontak.txt");

        bukuBaru.muatDariBerkas();

        bukuBaru.tampilkanSemua();

        System.out.println(
                "\nJumlah Kontak : "
                + bukuBaru.jumlahKontak()
        );
    }
}