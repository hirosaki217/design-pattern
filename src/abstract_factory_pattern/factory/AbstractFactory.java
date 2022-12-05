package abstract_factory_pattern.factory;

import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.shape.Shape;

public abstract class AbstractFactory {
    public  Shape getShape(Shape.TYPE type) {
        return null;
    };
    public  Color getColor(String type) {
        return null;
    };
}
