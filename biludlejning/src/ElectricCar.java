public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRange;

    private int power;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, int power) {
        super(registrationNumber, make, model, numberOfDoors);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
