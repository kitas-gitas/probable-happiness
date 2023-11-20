package lt.techin.calc;

public class App {

    public static void main(String[] args) {
        Car car = new Car("red", new ElectricEngine());
        car.drive();
        car.setEngine(new RocketEngine());
        car.drive();
    }
}
