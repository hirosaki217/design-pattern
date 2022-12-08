package composite;


import java.util.*;

public class CompoudGraphic implements IGraphic {
    private List<IGraphic> graphics = new ArrayList<>();
    @Override
    public void move(int x, int y) {
        graphics.forEach(graphic -> {
            graphic.move(x, y);
        });
    }

    @Override
    public void draw() {
        graphics.forEach(graphic -> {
            graphic.draw();
        });
    }
    public void add(IGraphic graphic){
        graphics.add(graphic);
    }

    public void remove(IGraphic graphic){
        graphics.remove(graphic);
    }
}
