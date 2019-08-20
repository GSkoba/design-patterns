package builder;

public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private Transmission transmission;

    @Override
    public Builder setType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public Builder setGPSNavigator(GPSNavigator gps) {
        this.gpsNavigator = gps;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Car getCar() {
        return new Car(this.type, this.seats, this.engine, this.transmission, this.gpsNavigator, this.tripComputer);
    }
}
