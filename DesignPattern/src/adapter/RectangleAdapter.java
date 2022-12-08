package adapter;

public class RectangleAdapter implements IShape{
    private RectangleAdaptee adaptee;

    public RectangleAdapter(RectangleAdaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void setRedBorder(){
        System.out.println("rectangle border red ");
    }
    @Override
    public void draw() {
        adaptee.draw();
        setRedBorder();
    }
}
