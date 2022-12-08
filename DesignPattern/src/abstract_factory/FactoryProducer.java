package abstract_factory;

public class FactoryProducer {
    public AbstractFactory getFactory(String type){
        if(type == "COLOR"){
            return new ColorFactory();
        }
        if(type == "SHAPE"){
            return new ShapeFactory();
        }
        return null;
    }
}
