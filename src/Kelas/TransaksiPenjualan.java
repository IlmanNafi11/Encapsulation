package Kelas;

public class TransaksiPenjualan {
    // atribute
    private String idTransaksi;
    private String id_Produk;
    private String nama_Produk;
    private int jumlah;
    private int biaya;

    //kontructor
    public TransaksiPenjualan(String idTransaksi,String nama_Produk, int biaya, int jumlah, String id_Produk) {
        this.idTransaksi = idTransaksi;
        this.nama_Produk = nama_Produk;
        this.biaya = biaya;
        this.jumlah = jumlah;
        this.id_Produk = id_Produk;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getId_Produk() {
        return id_Produk;
    }

    public void setId_Produk(String id_Produk) {
        this.id_Produk = id_Produk;
    }

    public String getNama_Produk() {
        return nama_Produk;
    }

    public void setNama_Produk(String nama_Produk) {
        this.nama_Produk = nama_Produk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
}
