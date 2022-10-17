import model.vegetable.GenericVegetable;
import model.fruit.Jackfruit;

import java.util.*;

public class TypeParameters {

/*
* Type Parameters
The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:

T - Type
E - Element
K - Key
N - Number
V - Value
* */

    public static <T> void printTypeParameter(T obj){
        System.out.println("Object type: "+obj.toString());
    }
    public static <T> void printTypeParameterList(List<T> objList){
        Iterator<T> itr=objList.listIterator();
        while (itr.hasNext()){

            System.out.println("Data: "+itr.next().toString());
        }
    }
    public static <E>void printElementsArray(E[] elements){

        for( E e:elements){
            System.out.println("Element :"+e.toString());
        }
    }

    //-- Generic class
    public static <T>void generateGenericClass(T obj){
        System.out.println(obj.toString());
    }
    public static void main(String [] args){
            //-- element type parameters array
//           Integer[] numbers={1,2,3,4};
//           Character[] letters={'a','b','c'};
//           printElementsArray(numbers);
//           printElementsArray(letters);
////
////           // -- Type parameter
//           Kiwi kiwi=new Kiwi("101","Germany","Green");
//           Blueberry blueberry=new Blueberry("101","Sweden","Blue");
//           printTypeParameter(kiwi);
//           printTypeParameter(blueberry);

           List<Jackfruit> jackfruits= Arrays.asList(new Jackfruit("101","Norway","Green"),
                   new Jackfruit("101","Norway","Yellow"),
                   new Jackfruit("101","Italy","Red")
                   );
//           printTypeParameterList(jackfruits);

        generateGenericClass(new GenericVegetable<String>("Red","Sweet","light"));
        }



}
