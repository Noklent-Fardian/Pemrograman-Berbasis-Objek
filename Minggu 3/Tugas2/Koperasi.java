package Tugas2;

public class Koperasi {
    private int ktp, limitPeminjaman, jumlahPinjaman;
    private String nama;

    public Koperasi(int ktp, String nama, int limitPeminjaman) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;

    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPeminjaman;
    }
    
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlahPinjaman) {
        if (jumlahPinjaman > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            this.jumlahPinjaman += jumlahPinjaman;
        }
    }
    
    public void angsur(int jumlahPinjaman) {
        if (this.jumlahPinjaman - jumlahPinjaman < 0) {
            System.out.println("Maaf, jumlah pinjaman yang dikembalikan melebihi jumlah yang diambil!");
        } else if(jumlahPinjaman < (this.jumlahPinjaman * 10 / 100)) {
            System.out.println("Maaf, minimal angsuran harus 10% dari jumlah pinjaman");
        }
        else {
            this.jumlahPinjaman -= jumlahPinjaman;
        }
    }

}
