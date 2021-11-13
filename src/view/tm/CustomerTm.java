package view.tm;

public class CustomerTm {
        private String nic;
        private String name;
        private String contact;
        private String email;
        private String address;
        private String roomnumber;
        private String checkdate;
        private String checkout;

    public CustomerTm() {
    }

    public CustomerTm(String nic, String name, String contact, String email, String address, String roomnumber, String checkdate, String checkout) {
        this.setNic(nic);
        this.setName(name);
        this.setContact(contact);
        this.setEmail(email);
        this.setAddress(address);
        this.setRoomnumber(roomnumber);
        this.setCheckdate(checkdate);
        this.setCheckout(checkout);
    }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getRoomnumber() {
        return roomnumber;
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

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
}
