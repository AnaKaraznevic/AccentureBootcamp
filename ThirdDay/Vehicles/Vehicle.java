package ThirdDay.Vehicles;

public class Vehicle {
    public String registrationNo;
    public String identificationNo;
    public String make;
    public String model;
    public int ProductionYear;
    public double marketValue;

    public void drive (){
        System.out.println("Vroom vroom");
    }

    public void steer (String direction){
        System.out.println("Direction: " + direction);
    }
}
