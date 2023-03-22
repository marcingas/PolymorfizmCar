public class Car {
    private String description;



    public Car() {
    }
    public Car(String description) {
        this.description = description;
    }



    public void startEngine(){
        System.out.println(description +" car engine Started");
    }


}
class GasPoweredCar extends Car{
    double avgkmPerLitre;
    int cylindres;
    String fuelType;

    public GasPoweredCar(String description, double avgkmPerLitre, int cylindres, String fuelType) {
        super(description);
        this.avgkmPerLitre = avgkmPerLitre;
        this.cylindres = cylindres;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " has " + cylindres + " cylinders,"+
                fuelType + " Engine started");
    }

}
class ElectricCar extends Car{
    private double avgPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgPerCharge, int batterySize) {
        super(description);
        this.avgPerCharge = avgPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " has battery size" + batterySize +
                " You don't hear it but engine is on");
    }
}
