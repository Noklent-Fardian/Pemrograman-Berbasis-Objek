package tugas;

public class keyboard extends inputDevice{
    private String tipeSwitch;
    public boolean RGB, wireless;

    public void setTipeSwitch(String newValue) {
        tipeSwitch = newValue;
    }
    public void setRGB(String newValue) {
        if (newValue == "Y") {
            RGB = true;
        } else {
            RGB = false;
        }
    }
    public void setWireless(String newValue) {
        if (newValue == "Y") {
            wireless = true;
        } else {
            wireless = false;
        }
    }

    
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Switch: " + tipeSwitch);
        System.out.println("RGB: " + RGB);
        System.out.println("Wireless: " + wireless);
        System.out.println("================================");
    }
    
}
