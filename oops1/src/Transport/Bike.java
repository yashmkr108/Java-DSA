package Transport;

public class Bike extends Vehicle{
    public String barHandleStyle;
    public String suspensionType;

    public Bike(String name,String model,int noOfTypres,String barHandleStyle,String suspensionType){
        super(name,model,noOfTypres);
        this.barHandleStyle = barHandleStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie(){
        System.out.println("Performing wheelie");
    }
}
