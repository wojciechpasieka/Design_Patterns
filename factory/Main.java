package factory;

public class Main {

    public static void main(String[] args) {

        CarFactory createCar = new CarFactory();
        Car golf = createCar.createConinentalCar(CarType.SEDAN);
        Car polo = createCar.createUKCar(CarType.HATCHBACK);

        System.out.println(polo);
        System.out.println(golf);

    }
}
