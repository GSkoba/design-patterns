package builder;

public class Director {

    public void createSportCar(Builder builder){
        builder.setEngine(new Engine(3.0, 0))
                .setSeats(2)
                .setGPSNavigator(new GPSNavigator("SPB"))
                .setTransmission(Transmission.AUTOMATIC)
                .setType(Type.SPORT_CAR);
    }

    public void createCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR)
                .setTransmission(Transmission.MANUAL)
                .setGPSNavigator(new GPSNavigator("New-York"))
                .setSeats(4)
                .setTripComputer(new TripComputer());
    }

}
