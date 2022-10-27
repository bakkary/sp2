public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRange;

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
