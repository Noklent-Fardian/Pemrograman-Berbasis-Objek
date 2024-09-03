package tugas;

public class inputDevice {
    private String merek,warna,caraKoneksi;
    private int harga,jmlhTombol;

    public void inputDevice(String merek, String warna, int harga, int jmlhTombol, String caraKoneksi) {
        this.merek = merek;
        this.warna = warna;
        this.harga = harga;
        this.jmlhTombol = jmlhTombol;
        this.caraKoneksi = caraKoneksi;
    }
    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Tombol: " + jmlhTombol);
        System.out.println("Cara Koneksi: " + caraKoneksi);
    }


    
}
