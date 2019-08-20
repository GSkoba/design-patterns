package builder;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        route = "def route";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
