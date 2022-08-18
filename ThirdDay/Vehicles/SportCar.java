package ThirdDay.Vehicles;

public class SportCar extends Car {

    public void drive (){
        System.out.println("Vrrrrrrr");
    }
    public void changeGear (int level){
        System.out.println("Gear level was changed to " + level + " SUPERFAST");
    }
}
