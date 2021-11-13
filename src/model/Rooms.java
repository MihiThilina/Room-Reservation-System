package model;

public class Rooms {
    private String roomno;
    private String roomtype;
    private String cost;
    private String meal;
    private String checkdate;
    private String checkout;
    private String availiability;

    public Rooms() {
    }

    public Rooms(String roomno, String roomtype, String cost, String meal, String checkdate, String checkout, String availiability) {
        this.setRoomno(roomno);
        this.setRoomtype(roomtype);
        this.setCost(cost);
        this.setMeal(meal);
        this.setCheckdate(checkdate);
        this.setCheckout(checkout);
        this.setAvailiability(availiability);
    }

    public String getRoomno() {
        return roomno;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public String getCost() {
        return cost;
    }

    public String getMeal() {
        return meal;
    }

    public String getCheckdate() {
        return checkdate;
    }

    public String getCheckout() {
        return checkout;
    }

    public String getAvailiability() {
        return availiability;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public void setAvailiability(String availiability) {
        this.availiability = availiability;
    }
}
