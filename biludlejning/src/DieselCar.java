public class DieselCar extends AFuelCar{

private boolean particleFilter;
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }




    public int getRegistrationFee() {

        int kmPrLitre = getKmPrLitre();
        int fee = 0;

        if(kmPrLitre < 5){
            fee = 10470 + 15260;
        }
        else if(kmPrLitre >= 5 && kmPrLitre <= 10){
            fee = 5500 + 2770;
        }
        else if(kmPrLitre >= 10 && kmPrLitre <= 15){
            fee = 2340 + 1850;
        }
        else if(kmPrLitre >= 15 && kmPrLitre <= 20){
            fee = 1050 + 1390;
        }
        else if(kmPrLitre >= 20 && kmPrLitre <= 50){
            fee = 330 + 130;
        }
        if (particleFilter == false){
        fee =+ 1000;
        } else {
          fee=0;

        }

        return fee;

    }
    @Override
    public String toString(){
    return "the model is " + getModel() + " and the fuel type is  " + getFuelType() + " the make is " + getMake() + " the particle filter is " + particleFilter + " and the registration number is " + getRegistrationNumber();

    }

}
