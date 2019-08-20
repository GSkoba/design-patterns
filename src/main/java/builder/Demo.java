package builder;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.createCityCar(carBuilder);
        Car car = carBuilder.getCar();
        System.out.println(car.getType());

        ManualBuilder manualBuilder = new ManualBuilder();
        director.createCityCar(manualBuilder);

        Manual manual = manualBuilder.getManual();
        System.out.println(manual.toString());
    }
}
