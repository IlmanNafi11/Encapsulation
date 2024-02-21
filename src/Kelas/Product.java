package Kelas;

public class Product {
    //atribute
    private String nama_Product;
    private String id_produk;
    private String kategori;
    private int harga;
    private int jumlah;
    private String nama_suplier;
    private String id_suplier;
    // constructor
    public Product(String nama_Product, String id_produk, String kategori, int harga, int jumlah, String nama_suplier,
            String id_suplier) {
        this.nama_Product = nama_Product;
        this.id_produk = id_produk;
        this.kategori = kategori;
        this.harga = harga;
        this.jumlah = jumlah;
        this.nama_suplier = nama_suplier;
        this.id_suplier = id_suplier;
    }
    // getter
    public String getNama_Product() {
        return nama_Product;
    }
    //setter
    public void setNama_Product(String nama_Product) {
        this.nama_Product = nama_Product;
    }
    // getter
    public String getId_produk() {
        return id_produk;
    }
    //setter
    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }
    // getter
    public String getKategori() {
        return kategori;
    }
    //setter
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    // getter
    public int getHarga() {
        return harga;
    }
    //setter
    public void setHarga(int harga) {
        this.harga = harga;
    }
    // getter
    public int getJumlah() {
        return jumlah;
    }
    //setter
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    // getter
    public String getNama_suplier() {
        return nama_suplier;
    }
    //setter
    public void setNama_suplier(String nama_suplier) {
        this.nama_suplier = nama_suplier;
    }
    // getter
    public String getId_suplier() {
        return id_suplier;
    }
    //setter
    public void setId_suplier(String id_suplier) {
        this.id_suplier = id_suplier;
    } 
}
