public class Main {
    public static void main(String[] args) {

        Car usual = new Car("Honda");
        GasPoweredCar HondaC = new GasPoweredCar("Honda Civic", 100,6,"Gas");
        ElectricCar HondaPHEV = new ElectricCar("Honda PHEV",200,600);
        usual.startEngine();
        HondaC.startEngine();
        HondaPHEV.startEngine();

    }
}