package tugas;

public class botolku  extends waterConatiner{
    private String kondisiBarang;
    private boolean bisaDiminumLangsung;
    
    public void setKondisiBarang(String newValue) {
        kondisiBarang = newValue;
    }
    public void setBisaDiminumLangsung(String newValue) {
        if (newValue == "Y") {
            bisaDiminumLangsung = true;
        } else {
            bisaDiminumLangsung = false;
        }
    }
    
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Kondisi Barang: " + kondisiBarang);
        System.out.println("Bisa Diminum Langsung: " + bisaDiminumLangsung);
        System.out.println("================================");
    }
    
}
