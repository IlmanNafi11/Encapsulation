package Kelas;

import java.util.Date;

public class Laporan {
    // variable tanggal dgn tipe data date untuk menyimpan tanggal terkini
    private Date tanggal;
    private int jumlahPemasukan;
    private int jumlahPengeluaran;
    public Laporan(Date tanggal, int jumlahPemasukan, int jumlahPengeluaran) {
        this.tanggal = tanggal;
        this.jumlahPemasukan = jumlahPemasukan;
        this.jumlahPengeluaran = jumlahPengeluaran;
    }
    public int getJumlahPemasukan() {
        return jumlahPemasukan;
    }
    public void setJumlahPemasukan(int jumlahPemasukan) {
        this.jumlahPemasukan = jumlahPemasukan;
    }
    public int getJumlahPengeluaran() {
        return jumlahPengeluaran;
    }
    public void setJumlahPengeluaran(int jumlahPengeluaran) {
        this.jumlahPengeluaran = jumlahPengeluaran;
    }
    public Date getTanggal() {
        return tanggal;
    }
    
}
