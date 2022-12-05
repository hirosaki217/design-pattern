package builder_pattern;

public interface Builder {
    public Builder title(String title);
    public Builder description(String description);
    public Builder url(String url);
    public Video build();
}
