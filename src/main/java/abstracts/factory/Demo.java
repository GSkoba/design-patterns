package abstracts.factory;

public class Demo {

    private static App configuration() {
        App app;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println("OS name the " + osName);
        if (osName.equals("mac")) {
            guiFactory = new MacOSFactory();
            app = new App(guiFactory);
        } else {
            guiFactory = new WinFactory();
            app = new App(guiFactory);
        }
        return app;
    }

    public static void main(String[] args) {
        App app = configuration();
        app.paint();
    }
}
