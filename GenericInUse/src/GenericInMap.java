import java.util.*;
class GenericInMap{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"vijay");
        map.put(4,"umesh");
        map.put(2,"ankit");

//Now use Map.Entry for Set and Iterator  
        Set<Map.Entry<Integer,String>> set=map.entrySet();

        Iterator<Map.Entry<Integer,String>> itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry e=itr.next();//no need to typecast
            System.out.println(e.getKey()+" "+e.getValue());
        }

        ArrayList<String> list=new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
//list.add(32);//compile time error

        String s=list.get(1);//type casting is not required
        System.out.println("element is: "+s);

        Iterator<String> itr2=list.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }

}

