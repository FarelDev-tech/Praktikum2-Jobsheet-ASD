public class MataKuliahMain08 {
    public static void main(String[] args) {
        MataKuliah08 mk1 = new MataKuliah08();
        mk1.kodeMK = "ASD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;
        mk1.tampilInformasi();

        // Mengubah SKS
        mk1.ubahSKS(2);
        // Menambahkan jam
        mk1.tambahJam(2);
        // Mengurangi jam
        mk1.kurangiJam(7);
        // Menampilkan informasi setelah perubahan
        System.out.println("Informasi lengkap setelah perubahan:");
        mk1.tampilInformasi();

        // Membuat objek kedua menggunakan konstruktor parameter
        System.out.println("Membuat objek kedua dengan konstruktor parameter:");
        MataKuliah08 mk2 = new MataKuliah08("OOP", "Object Oriented Programming", 3, 4);
        mk2.tambahJam(4);
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
    }
}
