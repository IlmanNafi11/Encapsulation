package Kelas;

public class TransaksiServis {
    // atributes
    private String id_Produk;
    private String name_Produk;
    private String kategori;
    private int jumlah;
    private int biaya;
    private String nama_Customer;
    private String address_Customer;
    private String phone_Customer;
    // set biaya penanganan
    private int penanganan = 50000;
    //menjadikan class product sebagai atribute untuk digunakan menghitung biaya
    private Product produk;
    
    // constructor
    public TransaksiServis(String id_Produk, String name_Produk, String kategori, int jumlah, int biaya,
            String nama_Customer, String address_Customer, String phone_Customer, Product product) {
        this.id_Produk = id_Produk;
        this.name_Produk = name_Produk;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.biaya = biaya;
        this.nama_Customer = nama_Customer;
        this.address_Customer = address_Customer;
        this.phone_Customer = phone_Customer;
        this.produk = product;
    }
    // getter
    public String getName_Produk() {
        return name_Produk;
    }
    // setter
    public void setName_Produk(String name_Produk) {
        this.name_Produk = name_Produk;
    }
    // getter
    public int getJumlah() {
        return jumlah;
    }
    // setter
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    // getter
    public int getBiaya() {
        return biaya;
    }
    // setter
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    // getter
    public String getNama_Customer() {
        return nama_Customer;
    }
    // setter
    public void setNama_Customer(String nama_Customer) {
        this.nama_Customer = nama_Customer;
    }
    // getter
    public String getAddress_Customer() {
        return address_Customer;
    }
    // setter
    public void setAddress_Customer(String address_Customer) {
        this.address_Customer = address_Customer;
    }
    // getter
    public String getPhone_Customer() {
        return phone_Customer;
    }
    // setter
    public void setPhone_Customer(String phone_Customer) {
        this.phone_Customer = phone_Customer;
    }
    // getter
    public String getId_Produk() {
        return id_Produk;
    }
    // setter
    public void setId_Produk(String id_Produk) {
        this.id_Produk = id_Produk;
    }
    // getter
    public String getKategori() {
        return kategori;
    }
    // setter
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public int getPenanganan() {
        return penanganan;
    }
    public void setPenanganan(int penanganan) {
        this.penanganan = penanganan;
    }
    // menghitung total biaya dan mengembalikan nilainya
    public int biayaPenanganan(){
        return jumlah*produk.getHarga()+penanganan;
    }
}
