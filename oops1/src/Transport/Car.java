package Transport;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    public Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres); // Initialized inherited values
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAc() {
        System.out.println("The Ac is starting : " + name + " " + model);
//        super.StartEngine(); // we can do this but it is less used to call parent class methods
    }

    public void stopAc() {
        System.out.println("The Ac is stoping : " + name + " " + model);
    }
}
