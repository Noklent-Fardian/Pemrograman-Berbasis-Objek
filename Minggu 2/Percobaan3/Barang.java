package Percobaan3;

/**
 * Barang
 */
public class Barang {

    String namaBrg,jenisBrg;
    int stok;



    public void tampilBarang(){
        System.out.println("Nama Barang : " + namaBrg);
        System.out.println("Jenis Barang : " + jenisBrg);
        System.out.println("Stok : " + stok);
    }

    //method dengan argumen dan nilai balik (return)

    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}