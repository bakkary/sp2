public class GasolineCar extends AFuelCar{
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {

        return null;
    }



    public int getRegistrationFee() {

        int kmPrLitre = getKmPrLitre();
        int fee = 0;

        if(kmPrLitre < 5){
            fee = 10470;
        }
        if(kmPrLitre >= 5 && kmPrLitre <= 10){
            fee = 5500;
        }
        if(kmPrLitre >= 10 && kmPrLitre <= 15){
            fee = 2340;
        }
        if(kmPrLitre >= 15 && kmPrLitre <= 20){
            fee = 1050;
        }
        if(kmPrLitre >= 20 && kmPrLitre <= 50){
            fee = 330;
        }

        return fee;

    }

}
