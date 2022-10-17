package model.fruit;

public class Blueberry {

    String id;
    String country;
    String color;
    public Blueberry(String id, String country, String color) {
        this.id=id;
        this.country=country;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Blueberry{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
