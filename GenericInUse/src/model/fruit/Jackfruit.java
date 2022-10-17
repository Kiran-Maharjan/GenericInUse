package model.fruit;

public class Jackfruit {
    String id;
    String country;
    String color;
    public Jackfruit(String id, String country, String color) {
        this.id = id;
        this.country = country;
        this.color = color;
    }

    public Jackfruit() {

    }

    @Override
    public String toString() {
        return "Jackfruit{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
