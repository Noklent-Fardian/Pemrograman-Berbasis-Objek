package Tugas2;

import java.util.Scanner;

import KoperasiGetterSetter.Anggota;

public class TestKoperasi {
    public static void main(String[] args) {
        Koperasi donny = new Koperasi(111333444, "Donny", 5000000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        while (true) {
            System.out.println("\n1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
            if (pilihan == 1) {
                System.out.print("Masukkan jumlah pinjaman: ");
                int jumlahPinjaman = sc.nextInt();
                donny.pinjam(jumlahPinjaman);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah angsuran: ");
                int jumlahAngsuran = sc.nextInt();
                donny.angsur(jumlahAngsuran);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
            } else if (pilihan == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
            
        }

    }
    
}

// System.out.println("\nMeminjam uang 10.000.000...");
// donny.pinjam(10000000);
// System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

// System.out.println("\nMeminjam uang 4.000.000...");
// donny.pinjam(4000000);
// System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

// System.out.println("\nMembayar angsuran 1.000.000");
// donny.angsur(1000000);
// System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

// System.out.println("\nMembayar angsuran 200.000");
// donny.angsur(200000);
// System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());