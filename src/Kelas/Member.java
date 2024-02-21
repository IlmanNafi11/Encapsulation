package Kelas;

public class Member {
    // atribute
    private String name;
    private String telephone;
    private String address;
    // kontructor
    public Member(String name, String telephone, String address) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
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
    // setter
    public void setAddress(String address) {
        this.address = address;
    }
}
