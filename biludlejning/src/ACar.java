public abstract class ACar implements Car {
   private String registrationNumber;
   private String make;
   private  String model;
   private int NumberOfDoors;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }
}
