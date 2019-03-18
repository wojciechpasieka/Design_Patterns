package factory;

public interface Factory {

    Car createUKCar(CarType carType);
    Car createConinentalCar(CarType carType);
}
