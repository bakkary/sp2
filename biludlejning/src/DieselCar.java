public class DieselCar extends AFuelCar{



    @Override
    public String getFuelType() {
        return null;
    }

    boolean hasParticleFilter() {
        return false;
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
        if (hasParticleFilter() == false){
        fee =+ 1000;
        } else {
          fee=0;

        }

        return fee;

    }

}
