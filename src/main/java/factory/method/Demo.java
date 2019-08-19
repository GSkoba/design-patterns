package factory.method;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        run();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("win")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void run() {
        dialog.renderWindow();
    }
}
