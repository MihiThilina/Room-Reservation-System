package model;

public class Customers {
    private String nic;
    private String name;
    private String cnumber;
    private String mail;
    private String address;
    private String roomno;
    private String checkdate;
    private String checkout;

    public Customers() {

    }

    public Customers(String nic, String name, String cnumber, String mail, String address, String roomno, String checkdate, String checkout) {
        this.setNic(nic);
        this.setName(name);
        this.setCnumber(cnumber);
        this.setMail(mail);
        this.setAddress(address);
        this.setRoomno(roomno);
        this.setCheckdate(checkdate);
        this.setCheckout(checkout);
    }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public String getCnumber() {
        return cnumber;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public String getRoomno() {
        return roomno;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
}
