public class CarApp {
    public static void main(String[] args) {
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

    }
}

