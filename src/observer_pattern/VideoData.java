package observer_pattern;

public class VideoData extends Subject{
    private String title;
    private String description;
    private String fileName;

    public String getTitle() {
        return title;
    }

    public VideoData(String title, String description, String fileName) {
        this.title = title;
        this.description = description;
        this.fileName = fileName;
    }

    public VideoData() {
    }

    public void setTitle(String title) {
        this.title = title;
        this.videoDataChange();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.videoDataChange();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        this.videoDataChange();
    }

    private void videoDataChange(){
        String title = this.getTitle();
        String description = this.getDescription();
        String fileName = this.getFileName();
        notifyObservers(this, null);
    }
}
