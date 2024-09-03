package tugas;

public class controllerPs extends inputDevice{
    private String tipeController,bentukTiruan;
    public boolean wireless;


    public void setTipeController(String newValue) {
        tipeController = newValue;
    }
    public void setWireless(String newValue) {
        if (newValue == "Y") {
            wireless = true;
        } else {
            wireless = false;
        }
    }
    public void setBentukTiruan(String newValue) {
        bentukTiruan = newValue;
    }

    
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Controller: " + tipeController);
        System.out.println("Wireless: " + wireless);
        System.out.println("Bentuk Tiruan Dari: " + bentukTiruan);
        System.out.println("================================");
    }
    
}
