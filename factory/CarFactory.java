package factory;

public class CarFactory implements Factory {


    public Car createUKCar(CarType carType) {
        switch (carType){
            case VAN:{
                return new Van("2018", "1.6", "diesel", SteeringWheelPosition.Right);
            }
            case SEDAN:{
                return new Sedan("2018", "1.4", "petrol", SteeringWheelPosition.Right);
            }
            case HATCHBACK:{
                return new Hatchback("2018", "1.6", "hybrid", SteeringWheelPosition.Right);
            }
            default: {
            throw new RuntimeException("Nieprawidłowe argumenty!");
            }
        }
    }

    public Car createConinentalCar(CarType carType) {
        switch (carType){
            case VAN:{
                return new Van("2018", "1.6", "diesel", SteeringWheelPosition.Left);
            }
            case SEDAN:{
                return new Sedan("2018", "1.4", "petrol", SteeringWheelPosition.Left);
            }
            case HATCHBACK:{
                return new Hatchback("2018", "1.6", "hybrid", SteeringWheelPosition.Left);
            }
            default: {
                throw new RuntimeException("Nieprawidłowe argumenty!");
            }
        }
    }
}
