package factory;

public class Car {

    private final String productionYear;
    private final String engine;
    private final String fuel;
    private final SteeringWheelPosition position;

    public Car(String productionYear, String engine, String fuel, SteeringWheelPosition position) {
        this.productionYear = productionYear;
        this.engine = engine;
        this.fuel = fuel;
        this.position = position;
    }

    public String getProductionYear() {
        return productionYear;
    }


    public String getEngine() {
        return engine;
    }


    public String getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear='" + productionYear + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", position=" + position +
                '}';
    }
}
