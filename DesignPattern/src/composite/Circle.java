package composite;

public class Circle extends Dot{
    private int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
    }

    @Override
    public void draw() {
        super.draw();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
