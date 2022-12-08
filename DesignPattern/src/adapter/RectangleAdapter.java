package adapter;

public class RectangleAdapter implements IShape{
    private RectangleAdaptee adaptee;

    public RectangleAdapter(RectangleAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.draw();

    }
}
