package tugas;

public class galonIsiUlang extends waterConatiner{
    private String TipeGalon, jenisAir,caraOutput;
    private boolean bisaDiisiUlang;

    public void setTipeGalon(String newValue) {
        TipeGalon = newValue;
    }
    public void setJenisAir(String newValue) {
        jenisAir = newValue;
    }
    public void setCaraOutput(String newValue) {
        caraOutput = newValue;
    }
    public void setBisaDiisiUlang(String newValue) {
        if (newValue == "Y") {
            bisaDiisiUlang = true;
        } else {
            bisaDiisiUlang = false;
        }
    }
    
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Galon: " + TipeGalon);
        System.out.println("Jenis Air: " + jenisAir);
        System.out.println("Cara Output: " + caraOutput);
        System.out.println("Bisa Diisi Ulang: " + bisaDiisiUlang);
        System.out.println("================================");
    }

    
}
