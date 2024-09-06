package Percobaan2;

public class testMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        // Objek 1
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Budi";
        mhs2.alamat = "Jl. Nusantara No 5";
        mhs2.kelas = "1B";
        mhs2.tampilBiodata();

        // Objek 2
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Ani";
        mhs3.alamat = "Jl. Melati No 2";
        mhs3.kelas = "1A";
        mhs3.tampilBiodata();
    }
}
