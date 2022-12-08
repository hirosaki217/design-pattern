package builder;

public class CarBuilder implements IBuilder{
    private String name;
    private int id;
    @Override
    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Car build() {
        return new Car(id, name);
    }
}
