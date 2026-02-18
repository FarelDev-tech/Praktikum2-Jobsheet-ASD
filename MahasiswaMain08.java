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
    }
}
