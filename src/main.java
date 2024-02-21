import java.util.Scanner;

import Kelas.*;

public class main {
    public static void main(String[] args) throws Exception {
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
        System.out.println("================================================");
        // membuat object product-
        
    }
}
