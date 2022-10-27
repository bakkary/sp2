import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car) {

        fleet.add(car);
    }


    public int total(){
    return fleet.size();

}


    public  int getTotalRegistrationFeeForFleet(){
        int sum = 0;

        return sum;
    }



    @Override
    public String toString() {
        String test = "The fleet of cars is " + total() + " large.\n";
        for (Car car:fleet) {
            test += car + "\n";
        }
        test += "Total registration fee for fleet is " + getTotalRegistrationFeeForFleet();
        return test;
    }

}