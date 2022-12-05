package builder_pattern;

public class VideoBuilder implements Builder{
    private String title;
    private String description;

    private String url;
    @Override
    public Builder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public Builder description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Builder url(String url) {
        this.url = url;
        return this;
    }

    @Override
    public Video build() {
        return new Video(title, description, url);
    }

}
