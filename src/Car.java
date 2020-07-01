public class Car extends Vehicle{
    private String make;
    private String model;
    private int speed;

    public Car() {
        super();
    }
    public Car(String color, String make, String model) {
        super(color);
        this.make = make;
        this.model = model;
        this.speed = 0;
    }
    public Car(String color, String make, String model, int speed) {
        this(make, model, color);
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.printf("The Speed is %d mph", speed);
    }

    public void startCar() {
        System.out.printf("The %s %s is starting\n", this.make, this.model);
    }

    public void accelerate() {
        System.out.printf("The %s %s is accelerate\n", this.make, this.model);
    }

    public void stop() {
        System.out.printf("The %s %s is stopped\n", this.make, this.model);
    }

    public void emissionsChecked() {
        System.out.printf("The %s %s has stopped to have its emissions checked \n", this.make, this.model);
    }


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "Car model: " + this.model + ", make: " + this.make + ", "+ super.toString();
    }

}
