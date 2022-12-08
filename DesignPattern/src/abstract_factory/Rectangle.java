package abstract_factory;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("RECTANGLE");
    }
}
