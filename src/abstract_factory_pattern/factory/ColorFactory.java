package abstract_factory_pattern.factory;

import abstract_factory_pattern.color.Blue;
import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.color.Green;
import abstract_factory_pattern.color.Red;
import abstract_factory_pattern.shape.Shape;

public class ColorFactory extends  AbstractFactory{
    @Override
    public Color getColor(String type) {
        if(type == "GREEN")
            return new Green();
        if(type == "BLUE")
            return new Blue();
        if(type == "RED")
            return new Red();
        return null;
    }
}
