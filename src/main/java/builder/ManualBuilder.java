package builder;

public class ManualBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gps;

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
        this.gps = gps;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Manual getManual() {
        return new Manual(this.type, this.engine, this.seats, this.transmission, this.tripComputer, this.gps);
    }
}
