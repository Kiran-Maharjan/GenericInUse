package model.fruit;

public class Kiwi {
    private String id;
    private  String country;
    private  String color;

    public Kiwi(String id, String country, String color) {
    this.id=id;
    this.country=country;
    this.color=color;
    }

    public Kiwi() {

    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
