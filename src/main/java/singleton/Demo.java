package singleton;

public class Demo {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Foo");
        Singleton secondSingleton = Singleton.getInstance("Bar");

        System.out.println(singleton.getValue());
        System.out.println(secondSingleton.getValue());
    }
}
