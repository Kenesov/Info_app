package vetro.uz.infoapp.models;

public class ProgrammingLanguage {
    private String name;
    private String description;
    private String usageArea;
    private int[] images;
    private int learningLevel;
    private int popularity;
    private int efficiency;
    private int iconResId;

    public ProgrammingLanguage(String name, String description, String usageArea,
                               int[] images, int learningLevel, int popularity,
                               int efficiency, int iconResId) {
        this.name = name;
        this.description = description;
        this.usageArea = usageArea;
        this.images = images;
        this.learningLevel = learningLevel;
        this.popularity = popularity;
        this.efficiency = efficiency;
        this.iconResId = iconResId;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getUsageArea() { return usageArea; }
    public int[] getImages() { return images; }
    public int getLearningLevel() { return learningLevel; }
    public int getPopularity() { return popularity; }
    public int getEfficiency() { return efficiency; }
    public int getIconResId() { return iconResId; }
}