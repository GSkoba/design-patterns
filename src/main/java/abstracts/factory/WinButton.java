package abstracts.factory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win button");
    }
}
