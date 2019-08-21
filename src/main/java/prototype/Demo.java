package prototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        List<Shape> listCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 4;
        circle.color = "red";
        list.add(circle);

        Circle copyCircle = (Circle) circle.clone();
        listCopy.add(copyCircle);

    }
}
