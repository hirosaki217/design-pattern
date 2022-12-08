package factory;

public class ShapeFactory {
    public IShape getShape(String type){
        if(type == "CIRCLE"){
            return new Circle();
        }
        if(type == "RECTANGLE"){
            return new Rectangle();
        }
        return null;
    }
}
