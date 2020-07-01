import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Car hondaCivic = new Car("red", "Honda", "Civic");
        Car toyotaCamry = new Car("White", "Toyota", "Camry");

        System.out.println(hondaCivic);
        System.out.println(toyotaCamry);
        System.out.println();

        hondaCivic.startCar();
        toyotaCamry.startCar();
        hondaCivic.accelerate();
        hondaCivic.setSpeed(50);
        toyotaCamry.accelerate();
        hondaCivic.emissionsChecked();
        toyotaCamry.stop();
        hondaCivic.setSpeed(100);
        hondaCivic.stop();


        System.out.println("\n\t******** Now you will be able to create a your own Car. *********");
        String inputAns;
        Boolean tryAgain = false;
        Car car;
        String model;
        String make;
        int year;
        String color;

        do {
            car = new Car();
            System.out.println("Enter car model: ");
            model = scanner.next();
            car.setModel(model);
            System.out.printf("Enter your %s make: \n", model);
            make = scanner.next();
            car.setMake(make);
            System.out.printf("Enter your %s %s year: \n", model, make);
            year = scanner.nextInt();
            car.setYear(year);
            System.out.printf("Enter your %s %s (%d) color: \n", model, make, year);
            color = scanner.next();
            car.setColor(color);

            cars.add(car);
            System.out.println("Do you want to add more cars? type \"no\" to stop");
            inputAns = scanner.next();
            tryAgain = inputAns.equalsIgnoreCase("no");

        } while (!tryAgain);

        System.out.println("These are cars that has been made by you from command line: \n");
        int counter=0;
        for(Car c : cars){
            System.out.println(++counter + ". " + c);
        }
    }
}

