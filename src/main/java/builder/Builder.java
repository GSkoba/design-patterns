package builder;

public interface Builder {
    Builder setType(Type type);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gps);
    Builder setTransmission(Transmission transmission);
}
