package Kelas;

public class DataPengguna {
    // Atribute
    private String name;
    private String nik;
    private String telephone;
    private String address;
    private String posisi;
    // Kontructor
    public DataPengguna(String name, String nik, String telephone, String address, String posisi) {
        this.name = name;
        this.nik = nik;
        this.telephone = telephone;
        this.address = address;
        this.posisi = posisi;
    }
    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
    // getter
    public String getNik() {
        return nik;
    }
    // setter
    public void setNik(String nik) {
        this.nik = nik;
    }
    // getter
    public String getTelephone() {
        return telephone;
    }
    // setter
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    // getter
    public String getAddress() {
        return address;
    }
    //setter
    public void setAddress(String address) {
        this.address = address;
    }
    // getter
    public String getPosisi() {
        return posisi;
    }
    //setter
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    } 
}
