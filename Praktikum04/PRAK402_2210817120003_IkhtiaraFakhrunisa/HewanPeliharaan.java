package Praktikum04.PRAK402_2210817120003_IkhtiaraFakhrunisa;
public abstract class HewanPeliharaan {
    private String nama;
    private String ras;
    public HewanPeliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }
    void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + this.nama);
        System.out.println("Dengan ras: " + this.ras);
    }
}