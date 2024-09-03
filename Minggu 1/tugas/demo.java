package tugas;

public class demo {
    public static void main(String[] args) {

        System.out.println("================ Controller ================");
        controllerPs controller = new controllerPs();
        controller.inputDevice("Mtech", "Hitam", 40000, 12, "Kabel");
        controller.setTipeController("Dualshock 4");
        controller.setWireless("N");
        controller.setBentukTiruan("PS2");
        controller.cetakStatus();
        
        keyboard keyboard = new keyboard();
        keyboard.inputDevice("DAXA", "Putih", 500000, 104, "USB");
        keyboard.setTipeSwitch("Mechanical");
        keyboard.setRGB("Y");
        keyboard.setWireless("Y");
        keyboard.cetakStatus();

        System.out.println("================ Water Container ================");
        botolku botol = new botolku();
        botol.waterConatiner("TKK", "Hitam", 120000,1.7);
        botol.setKondisiBarang("Baru");
        botol.setBisaDiminumLangsung("Y");
        botol.cetakStatus();
        
        galonIsiUlang galon = new galonIsiUlang();
        galon.waterConatiner("Aqua", "Bening", 6000, 19);
        galon.setTipeGalon("Galon Biasa");
        galon.setJenisAir("Air isi ulang");
        galon.setCaraOutput("Pompa");
        galon.setBisaDiisiUlang("Y");
        galon.cetakStatus();


    }
    
}
