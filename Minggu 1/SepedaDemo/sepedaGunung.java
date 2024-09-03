package SepedaDemo ;

public class sepedaGunung extends sepedaDemo{
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }
    
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
        System.out.println("================================");
    }
    
}
