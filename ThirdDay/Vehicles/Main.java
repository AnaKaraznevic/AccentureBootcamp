package ThirdDay.Vehicles;// Create a base class of a ThirdDay.Vehicles.Vehicle,
// then create a ThirdDay.Vehicles.Car class which inherits from the ThirdDay.Vehicles.Vehicle class.
// Also, create another class, a specific type of ThirdDay.Vehicles.Car that inherits from the ThirdDay.Vehicles.Car class.
// Program should be able to handle steering, changing gears, and drive (having speed in other words).
// You might decide where to put the appropriate state and behaviors (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed of driving should be included.

public class Main {
    public static void main (String[] args){
        Vehicle vehicle1 = new Vehicle();
        vehicle1.drive();
        vehicle1.steer("left");

        Car car1 = new Car();
        car1.drive();
        car1.changeGear(4);
        car1.steer("right");

        SportCar sportCar1 = new SportCar();
        sportCar1.drive();
        sportCar1.changeGear(3);
        sportCar1.steer("forward");

    }
}
