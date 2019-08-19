package abstracts.factory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac OS button");
    }
}
