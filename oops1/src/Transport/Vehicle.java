package Transport;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    public Vehicle() {

    }

    public Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void StartEngine() {
        System.out.printf("The engine is starting of %s : %s\n", name, model);
    }

    void StopEngine() {
        System.out.printf("The engine is stoping of %s : %s\n", name, model);
    }
}
