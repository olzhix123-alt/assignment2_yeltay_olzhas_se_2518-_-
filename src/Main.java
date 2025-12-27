public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Alex", "KZ12345");
        Driver d2 = new Driver("Ivan", "KZ67890");

        Vehicle car = new Car("Toyota", 2020, 4, "Petrol");
        Vehicle moto = new Motorcycle("Yamaha", 2018, false);
        Vehicle truck = new Truck("Volvo", 2019, 15.5, 6);

        car.setDriver(d1);
        moto.setDriver(d1);
        truck.setDriver(d2);

        Vehicle[] vehicles = {car, moto, truck};

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.getDriver().displayDriverInfo();
            v.stopEngine();
        }
    }
}
