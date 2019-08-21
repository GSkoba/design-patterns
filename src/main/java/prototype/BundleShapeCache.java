package prototype;

import java.util.HashMap;
import java.util.Map;

public class BundleShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundleShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.color = "yellow";
        circle.radius = 11;

        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 14;
        rectangle.width = 2;
        rectangle.height = 25;
        rectangle.color = "red";
        cache.put("Yellow circle", circle);
        cache.put("Red rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
