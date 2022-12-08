package abstract_factory;



public class ColorFactory extends AbstractFactory{
    @Override
    public IColor getColor(String type) {
        if(type == "RED"){
            return new Red();
        }
        if(type == "BLUE"){
            return new Blue();
        }
        return null;
    }
}
