import model.transport.Bike;
import model.transport.Van;
import model.transport.Vehicle;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WildCard {
    /*
    * The ? (question mark) symbol represents the wildcard element. It means any type. If we write <? extends Number>, it means any child class of Number, e.g., Integer, Float, and double. Now we can call the method of Number class through any child class object.

We can use a wildcard as a type of a parameter, field, return type, or local variable. However, it is not allowed to use a wildcard as a type argument for a generic method invocation, a generic class instance creation, or a supertype.
    * */

    public static void main(String[] args) {
        List<Bike> bikes= Arrays.asList(new Bike(),new Bike());
        getVehicle(bikes);

        List<Van> vans= Arrays.asList(new Van(),new Van());
        getVehicle(vans);

        List<Integer> integerList=Arrays.asList(1,2,3);
        List<String> stringList=Arrays.asList("Ramos","Serge","Tuna");
        displayList(integerList);
        displayList(stringList);
    }
    public static void getVehicle(List<? extends Vehicle> vehicles){
        Iterator<Vehicle> itr= (Iterator<Vehicle>) vehicles.iterator();
        while(itr.hasNext()){
            itr.next().intro();
        }
    }

    public static void displayList(List<?> displayList){
    for(Object obj: displayList){
        System.out.println(obj.toString());
    }
    }
}
