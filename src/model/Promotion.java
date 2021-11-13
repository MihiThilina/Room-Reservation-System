package model;

public class Promotion {
    private String mealplan;
    private String type;
    private String addNew;
    private String price;
    private String date;

    public Promotion() {
    }

    public Promotion(String mealplan, String type, String addNew, String price, String date) {
        this.setMealplan(mealplan);
        this.setType(type);
        this.setAddNew(addNew);
        this.setPrice(price);
        this.setDate(date);
    }

    public String getMealplan() {
        return mealplan;
    }

    public String getType() {
        return type;
    }

    public String getAddNew() {
        return addNew;
    }

    public String getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public void setMealplan(String mealplan) {
        this.mealplan = mealplan;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddNew(String addNew) {
        this.addNew = addNew;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
