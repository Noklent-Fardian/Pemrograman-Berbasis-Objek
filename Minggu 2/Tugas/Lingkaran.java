package Tugas;

public class Lingkaran {
    double phi = 3.14;
    double r;

    public double hitungLuas() {
        double luas = phi * r * r;
        return luas;
    }
    public double hitungKeliling() {
        double keliling = 2 * phi * r;
        return keliling;
    }

    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.r = 7;
        System.out.println("Luas Lingkaran : " + l1.hitungLuas());
        System.out.println("Keliling Lingkaran : " + l1.hitungKeliling());
    }
    
}
