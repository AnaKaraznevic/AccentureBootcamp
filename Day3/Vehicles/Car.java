package Day3.Vehicles;

public class Car extends Vehicle {
    public int power;
    public int noOfSeats;

    public void drive (){
        System.out.println("Broom broom");
    }

    public void changeGear (int level){
        System.out.println("Gear level was changed to " + level);
    }
}
