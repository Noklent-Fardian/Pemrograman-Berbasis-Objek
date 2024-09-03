package SepedaDemo;
/**
 * Main
 */

public class Main {


    public static void main(String[] args) {
        //Buat dua buah objek sepeda
        sepedaDemo spd1 = new sepedaDemo();
        sepedaDemo spd2 = new sepedaDemo();
        sepedaGunung spd3 = new sepedaGunung();

        //fungsi method di dalam objek sepeda
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        System.out.println("================================");

        spd2.setMerek("Wimcycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.tambahKecepatan(10);
        spd2.cetakStatus();
        System.out.println("================================");

        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
    }


}
