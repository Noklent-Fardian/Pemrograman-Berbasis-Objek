package Tugas;

public class Peminjaman {
    int id,hargaBayar,lamaSewa,hargaPerhari;
    String namaMember,namaGame;


    public int harusBayar(int lamaSewa, int hargaPerhari){
        hargaBayar = lamaSewa * hargaPerhari;
        return hargaBayar;
    }

    public void cetakStruk (){
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga Perhari : " + hargaPerhari);
        System.out.println("Lama Sewa : " + lamaSewa);
        System.out.println("Total Bayar : " + hargaBayar);
    }
}
