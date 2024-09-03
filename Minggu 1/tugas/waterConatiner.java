package tugas;

public class waterConatiner {
    private String merek,warna;
    private int harga;
    private double kapasitas;

    public void waterConatiner(String merek, String warna, int harga, double kapasitas) {
        this.merek = merek;
        this.warna = warna;
        this.harga = harga;
        this.kapasitas = kapasitas;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Harga: " + harga);
        System.out.println("Kapasitas: " + kapasitas + " liter");
    }
    
}
