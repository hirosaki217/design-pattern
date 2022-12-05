package abstract_factory_pattern;

import abstract_factory_pattern.factory.AbstractFactory;
import abstract_factory_pattern.factory.ColorFactory;
import abstract_factory_pattern.factory.ShapeFactory;
import abstract_factory_pattern.shape.Shape;

public class FactoryProducer {
    public AbstractFactory getFactory(String type){
        if(type == "SHAPE")
            return new ShapeFactory();
        if(type == "COLOR")
            return new ColorFactory();
        return null;
    };
}
