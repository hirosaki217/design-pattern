package abstract_factory;



public class ShapeFactory extends AbstractFactory{
    @Override
    public IShape getShape(String type) {
        if(type == "CIRCLE"){
            return new Circle();
        }
        if(type == "RECTANGLE"){
            return new Rectangle();
        }
        return null;
    }
}
