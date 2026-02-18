public class MahasiswaMain08 {
    public static void main(String[] args) {
        Mahasiswa08 mhs1 = new Mahasiswa08();
        mhs1.nama = "Farel Maulana Firdaus";
        mhs1.nim = "254107060069";
        mhs1.kelas = "SIB-1A";
        mhs1.ipk = 3.79;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB-1B");
        mhs1.updateIpk(4.00); //Aaminn
        mhs1.tampilkanInformasi();

        // Membuat objek yang kedua menggunakan konstruktor parameter
        Mahasiswa08 mhs2 = new Mahasiswa08("Kirigaya Kazuto", "254107060078", 3.50, "SIB-1A");
        mhs2.updateIpk(4.00);
        mhs2.tampilkanInformasi();
    }
}
