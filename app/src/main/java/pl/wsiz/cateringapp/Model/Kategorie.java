package pl.wsiz.cateringapp.Model;

public class Kategorie {
    private String Name;
    private String Image;

    public Kategorie() {
    }

    public Kategorie(String name, String image) {
        Name = name;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
