import model.fruit.Fruit;
import model.fruit.Kiwi;
import model.fruit.Lychee;

public class Main {
    public static void main(String[] args) {
        Fruit f=new Fruit();
        Kiwi k=new Kiwi();
        f.acid=k;
        Kiwi kiwi=(Kiwi)f.acid;

        Fruit<Lychee> fruit=new Fruit<Lychee>();
        fruit.subAcid=new Lychee();
        Lychee lychee=  fruit.subAcid;

//        fruit.subAcid=new model.fruit.Blueberry();
//        fruit.acid=new model.fruit.Kiwi();
//        fruit.acid=new model.fruit.Tangelo();
//        fruit.sweet=new model.fruit.Jackfruit();
//        fruit.sweet=new model.fruit.Jujube();
//        fruit.nonSweet=new model.fruit.Avocado();
//        fruit.nonSweet=new model.fruit.BellPeppers();

//        f.acid=new model.fruit.Tangelo();
//        model.fruit.Tangelo t= (model.fruit.Tangelo) f.acid;
//
//        model.fruit.Bartender bartender=new model.fruit.Bartender();
//        model.fruit.Juice juice=new model.fruit.Juice();
//        model.fruit.Water water=new model.fruit.Water();
//        model.fruit.Cocktail cocktail=bartender. mix (juice,water);
//        bartender.mix(juice,water); //works as being type inference
//        model.fruit.Bartender.mix3(juice,water);
//        model.fruit.Bartender.<model.fruit.Juice,model.fruit.Water>mix3(juice,water);

        class Bottle<T> {

        }
        interface Liquid{}
        class Tea implements Liquid{}
        class Coffee implements Liquid{}
        class Alcohol{}
        class Wine {}

        Bottle<Tea> juiceBottle=new Bottle<>();
        Bottle<Coffee> coffeeBottle=new Bottle<>();
        Bottle<Wine> wineBottle=new Bottle<Wine>();

    }


}