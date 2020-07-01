public class Vehicle {
    private String color;
    private int year;

    public Vehicle(){

    }
    public Vehicle(String color){
        this.color = color;
        this.year = year;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Year: " + this.year + ", Color: " + this.color;
    }
}
