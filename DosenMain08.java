public class DosenMain08 {
    public static void main(String[] args) {
        Dosen08 dosen1 = new Dosen08();

        dosen1.idDosen = "DS1";
        dosen1.nama = "Farel Maulana Firdaus";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 2025;
        dosen1.bidangKeahlian = "Data Science";
        dosen1.tampilInformasi();

        // Mengubah status aktif
        dosen1.setStatusAktif(true);
        // Menghitung masa kerja
        dosen1.hitungMasaKerja(2030);
        // Mengubah bidang keahlian
        dosen1.ubahKeahlian("Artificial Intelligence");
        // Menampilkan informasi setelah perubahan
        System.out.println("Informasi lengkap setelah perubahan:");
        dosen1.tampilInformasi();

        // Membuat objek kedua menggunakan konstruktor parameter
        System.out.println("Membuat objek kedua dengan konstruktor parameter:");
        Dosen08 dosen2 = new Dosen08("DS2", "Kirigaya Kazuto", false, 2020, "Cybersecurity");
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2030);
        dosen2.tampilInformasi();
    }
}
