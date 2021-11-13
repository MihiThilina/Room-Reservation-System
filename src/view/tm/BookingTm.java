package view.tm;

public class BookingTm {
     private String roomnumber;
     private String name;
     private String phonenumber;
     private String data;
     private String mealsplan;
     private String checkindate;
     private String checkinout;
     private String availability;

    public BookingTm() {
    }

    public BookingTm(String roomnumber, String name, String phonenumber, String data, String mealsplan, String checkindate, String checkinout, String availability) {
        this.setRoomnumber(roomnumber);
        this.setName(name);
        this.setPhonenumber(phonenumber);
        this.setData(data);
        this.setMealsplan(mealsplan);
        this.setCheckindate(checkindate);
        this.setCheckinout(checkinout);
        this.setAvailability(availability);
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public String getName() {
        return name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getData() {
        return data;
    }

    public String getMealsplan() {
        return mealsplan;
    }

    public String getCheckindate() {
        return checkindate;
    }

    public String getCheckinout() {
        return checkinout;
    }

    public String getAvailability() {
        return availability;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setMealsplan(String mealsplan) {
        this.mealsplan = mealsplan;
    }

    public void setCheckindate(String checkindate) {
        this.checkindate = checkindate;
    }

    public void setCheckinout(String checkinout) {
        this.checkinout = checkinout;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
