package builder;

public interface IBuilder {
    IBuilder setName(String name);
    IBuilder setId(int id);
    Object build();
}
