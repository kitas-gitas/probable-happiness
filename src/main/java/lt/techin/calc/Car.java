package lt.techin.calc;

public class Car {

    private String color;

    private Engine engine;


    public Car(String color, Engine engine) {
        this.color = color;
        this.engine = engine;
    }

    public void drive(){
        engine.start();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
