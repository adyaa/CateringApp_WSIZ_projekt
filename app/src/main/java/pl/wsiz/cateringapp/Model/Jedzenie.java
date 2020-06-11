package pl.wsiz.cateringapp.Model;

public class Jedzenie {
    private String Name, Image, Opis, Cena, Znizka, MenuId;

    public Jedzenie() {

    }

    public Jedzenie(String name, String image, String opis, String cena, String znizka, String menuId) {
        Name = name;
        Image = image;
        Opis = opis;
        Cena = cena;
        Znizka = znizka;
        MenuId = menuId;
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

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    public String getCena() {
        return Cena;
    }

    public void setCena(String cena) {
        Cena = cena;
    }

    public String getZnizka() {
        return Znizka;
    }

    public void setZnizka(String znizka) {
        Znizka = znizka;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
