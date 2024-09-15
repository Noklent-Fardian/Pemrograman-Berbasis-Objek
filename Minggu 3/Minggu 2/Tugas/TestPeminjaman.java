package Tugas;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pjm1 = new Peminjaman();
        pjm1.id = 1;
        pjm1.namaMember = "Rizky";
        pjm1.namaGame = "GTA V";
        pjm1.hargaPerhari = 5000;
        pjm1.lamaSewa = 3;
        pjm1.harusBayar(pjm1.lamaSewa, pjm1.hargaPerhari);
        pjm1.cetakStruk();
    }
    
}
