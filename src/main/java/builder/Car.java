package builder;

public class Car {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gps;
    private final TripComputer tripComputer;
    private double fuel = 0;

    public Car(Type type, int seats, Engine engine, Transmission transmission, GPSNavigator gps, TripComputer tripComputer) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gps = gps;
        this.tripComputer = tripComputer;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGps() {
        return gps;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
