package abstract_factory_pattern.shape;

public interface Shape {
    static enum TYPE  {
            CIRCLE,
            SQUARE,
            RECTANGLE
    }
    static final String CIRCLE = "CIRCLE";
    void draw();
}
