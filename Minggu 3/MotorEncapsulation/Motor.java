package MotorEncapsulation;

/**
 * Motor
 */
public class Motor {

    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if (kontakOn == true){
            if (kecepatan+30 <100){
                kecepatan += 30;

            } else {
                System.out.println("Kecepatan maksimal 100! \n");
                kecepatan = 100;
            }
        } 
        else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }
    
    public void kurangiKecepatan(){
        if (kontakOn == true){ 
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan minimal 0! \n");
        }
    }

    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
            
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}