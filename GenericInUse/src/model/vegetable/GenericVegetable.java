package model.vegetable;

public class GenericVegetable<T> {
    private T color;
    private T flavor;
    private T texture;


    public GenericVegetable(T color, T flavor, T texture) {
        this.color = color;
        this.flavor = flavor;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "GenericVegetable{" +
                "color=" + color +
                ", flavor=" + flavor +
                ", texture=" + texture +
                '}';
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }

    public T getFlavor() {
        return flavor;
    }

    public void setFlavor(T flavor) {
        this.flavor = flavor;
    }

    public T getTexture() {
        return texture;
    }

    public void setTexture(T texture) {
        this.texture = texture;
    }

    public GenericVegetable() {

    }
}
