package Kelas;

public class Register {
    // atribute
    String name;
    String password;
    // constructor
    public Register(String name, String password) {
        this.name = name;
        this.password = password;
    }
    // getter
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    // getter
    public String getPassword() {
        return password;
    }
    // setter
    public void setPassword(String password) {
        this.password = password;
    }
}
