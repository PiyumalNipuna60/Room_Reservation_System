package model;

public class Guest {
    private String Name;
    private String NIC;
    private String TNumber;
    private String Email;
    private String Address;

    public Guest() {
    }

    public Guest(String name, String NIC, String TNumber, String email, String address) {
        Name = name;
        this.NIC = NIC;
        this.TNumber = TNumber;
        Email = email;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getTNumber() {
        return TNumber;
    }

    public void setTNumber(String TNumber) {
        this.TNumber = TNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "Name='" + Name + '\'' +
                ", NIC='" + NIC + '\'' +
                ", TNumber='" + TNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
