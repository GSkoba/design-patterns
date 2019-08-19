package abstracts.factory;

public class App {
    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory gui) {
        button = gui.createButton();
        checkbox = gui.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
