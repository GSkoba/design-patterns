package singleton;

public final class Singleton {
    private static Singleton singleton;
    private String value;

    public Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Singleton getInstance(String value) {
        if (singleton == null) {
            singleton = new Singleton(value);
        }
        return singleton;
    }
}
