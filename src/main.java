import java.util.Date;
import Kelas.*;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println();
        // Membuat object login
        Login lg = new Login("ilmannafi", "ilman1234 ");
        // get username dan password
        System.out.println("Data akun: ");
        System.out.println("Username: "+ lg.getUsername() +
        "\nPassword: "+ lg.getPassword());
        System.out.println("==================");
        System.out.println("Password Baru");
        // set/ubah akun
        lg.setPassword("afi1234");
        System.out.println("Username: "+ lg.getUsername() +
        "\nPassword: "+ lg.getPassword());

        System.out.println();
        System.out.println("================================================================");
        // Membuat object DataPengguna
        DataPengguna dtPengguna = new DataPengguna("Ilman","331403558","081292332","Sragen","Owner");
        // get data pengguna
        System.out.println("Data Pengguna:");
        System.out.println("Nama: " + dtPengguna.getName() +
        "\nNik: " + dtPengguna.getNik() +
        "\nNo Hp: " + dtPengguna.getTelephone() +
        "\nAlamat: " + dtPengguna.getAddress()+
        "\nPosisi : " + dtPengguna.getPosisi());
        System.out.println("====================");
        System.out.println("No Hp baru: ");
        // set/ubah noTlp
        dtPengguna.setTelephone("0852924534");
        System.out.println("No Hp: " + dtPengguna.getTelephone());

        System.out.println();
        System.out.println("================================================");
        // membuat object product
        Product produk = new Product("Softcase", "ACS-123", "Aksesoris", 35000, 10, "Tri handoko", "SP-1321");
        //get data product
        System.out.println("Data Product: ");
        System.out.println("Id Produk: " + produk.getId_produk() +
        "\nKategori: " + produk.getKategori()+
        "\nNama Product: "+ produk.getNama_Product()+
        "\nStok: " + produk.getJumlah()+
        "\nHarga: Rp. "+ produk.getHarga()+
        "\nID-Supplier: "+ produk.getId_suplier()+
        "\nNama Supplier: "+ produk.getNama_suplier());    
        // set/ubah data produk
        produk.setHarga(50000);
        System.out.println("==================");
        System.out.println("Harga terbaru: Rp. " + produk.getHarga());

        System.out.println();
        System.out.println("=====================================");
        // Membuat objek Transaksi Penjualan
        TransaksiPenjualan transPenjualan = new TransaksiPenjualan("TR12987", produk.getNama_Product(), 0, 4, produk.getId_produk());
        // menghitung total bayar
        int total = transPenjualan.getJumlah() * produk.getHarga();
        // set biaya
        transPenjualan.setBiaya(total);
        // get data transaksi penjualan
        System.out.println("Transaksi Penjualan");
        System.out.println("ID-Transaksi: " + transPenjualan.getIdTransaksi()+
        "\nNama Product: " + transPenjualan.getNama_Produk()+
        "\nJumlah: " + transPenjualan.getJumlah()+
        "\nTotal Bayar: Rp. "+transPenjualan.getBiaya());
        
        System.out.println();
        System.out.println("==================================");
        System.out.println("Transaksi Service");
        // membuat objek Transaksi Service
        TransaksiServis tranServis = new TransaksiServis(produk.getId_produk(), produk.getNama_Product(), produk.getKategori(), 2, 0, "Azka", "Nganjuk", "0822442332", produk);
        // get data transaksi service
        System.out.println("ID-Produk: " + tranServis.getId_Produk()+
        "\nKategori: " + tranServis.getKategori()+
        "\nNama Product: "+ tranServis.getName_Produk()+
        "\nJumlah: " +tranServis.getJumlah()+
        "\nTotal Bayar: Rp. " +tranServis.biayaPenanganan()+
        "\nNama Customer: "+ tranServis.getNama_Customer()+
        "\nHp Customer: " + tranServis.getPhone_Customer()+
        "\nAlamat Customer : " + tranServis.getAddress_Customer());
        // set/ubah biaya penanganan
        tranServis.setPenanganan(25000);
        // Tampilkan/get Data Transaksi Terbaru
        System.out.println("=============================");
        System.out.println("UPDATE BIAYA PENANGANAN");
        System.out.println("ID-Produk: " + tranServis.getId_Produk()+
        "\nKategori: " + tranServis.getKategori()+
        "\nNama Product: "+ tranServis.getName_Produk()+
        "\nJumlah: " +tranServis.getJumlah()+
        "\nTotal Bayar: Rp. " +tranServis.biayaPenanganan()+
        "\nNama Customer: "+ tranServis.getNama_Customer()+
        "\nHp Customer: " + tranServis.getPhone_Customer()+
        "\nAlamat Customer : " + tranServis.getAddress_Customer());

        System.out.println();
        System.out.println("======================================");
        System.out.println("Akun");
        // Membuat objek Register
        Register reg = new Register("AzkaImanika", "Azka123");
        //get data akun
        System.out.println("Username: " + reg.getName()+
        "\nPassword: "+ reg.getPassword());
        // set password
        reg.setPassword("imanika321");
        System.out.println("====================");
        System.out.println("Password Baru: " + reg.getPassword());

        System.out.println();
        System.out.println("===============================");
        System.out.println("Member");
        // membuat objek Member
        Member mem = new Member("Ilman", "087321456", "Sragen");
        // get data member 
        System.out.println("Nama Member: " + mem.getName()+
        "\nNo Hp: "+ mem.getTelephone()+
        "\nAlamat: "+ mem.getAddress());
        System.out.println("====================");
        // set nama member
        mem.setName("Fadira");
        System.out.println("Nama Member: " + mem.getName()+
        "\nNo Hp: "+ mem.getTelephone()+
        "\nAlamat: "+ mem.getAddress());

        System.out.println();
        System.out.println("=============================");
        // membuat objek Laporan
        Laporan lap = new Laporan(new Date(), 1000000, 5000000);
        // get data laporan
        System.out.println("Laporan");
        System.out.println("Tanggal : " + lap.getTanggal()+
        "\nJumlah Pemasukan: Rp. "+ lap.getJumlahPemasukan()+
        "\nJumlah Pengeluaran: Rp. " + lap.getJumlahPengeluaran());
        System.out.println("=====================");
        System.out.println("Laporan Terbaru");
        // set jumlah pemasukan
        lap.setJumlahPemasukan(1500000);
        System.out.println("Tanggal : " + lap.getTanggal()+
        "\nJumlah Pemasukan: Rp. "+ lap.getJumlahPemasukan()+
        "\nJumlah Pengeluaran: Rp. " + lap.getJumlahPengeluaran());
    }
}
