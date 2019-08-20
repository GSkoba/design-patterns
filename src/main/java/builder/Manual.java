package builder;

public class Manual {
    private final Type type;
    private final Engine engine;
    private final int seats;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gps;

    public Manual(Type type, Engine engine, int seats, Transmission transmission, TripComputer tripComputer, GPSNavigator gps) {
        this.type = type;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "type=" + type +
                ", engine=" + engine +
                ", seats=" + seats +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}
