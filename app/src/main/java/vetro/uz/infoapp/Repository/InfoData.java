package vetro.uz.infoapp.Repository;

public class InfoData {
    private String name;
    private String resname;
    private int image;
    private String description;

    public InfoData(String name, String resname, int image, String description) {
        this.name = name;
        this.resname = resname;
        this.image = image;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return resname;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
