package Tugas;

public class Barang {
    String kode,namaBarang;
    int hargaDasar;
    float diskon;


    public int hitungHargaJual(int hargaDasar, float diskon){
        int hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang :" + namaBarang);
        System.out.println("Harga Dasar Rp.: " + hargaDasar);
        System.out.println("Diskon : " + diskon*100 + "%");
        System.out.println("Harga Jual : " + hitungHargaJual(hargaDasar, diskon));
    }
    
}
