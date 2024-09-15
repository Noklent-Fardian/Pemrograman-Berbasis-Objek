package KoperasiGetterSetter;

public class KoperaDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwant", "Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
        anggota1.setNama("Iwan");
        anggota1.setAlamat("Jalan Mawar");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }

}
