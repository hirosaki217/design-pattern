package abstract_factory_pattern.factory;

import abstract_factory_pattern.color.Blue;
import abstract_factory_pattern.shape.Circle;
import abstract_factory_pattern.shape.Rectangle;
import abstract_factory_pattern.shape.Shape;
import abstract_factory_pattern.shape.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(Shape.TYPE type) {

        if( Shape.TYPE.CIRCLE==type)
            return new Circle();
        if(type == Shape.TYPE.SQUARE)
            return new Square();
        if(type == Shape.TYPE.SQUARE)
            return new Rectangle();
        return null;
    }
}
