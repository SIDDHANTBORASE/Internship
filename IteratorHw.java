import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class IteratorHw{
    public static void main (String args[]){
        System.out.println("");
        System.out.println("Tree Set: ");
        Set<String> set = new TreeSet<>();
            set.add("Apple");
            set.add("Cherry");
            set.add("Banana");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("Banana")){
                iterator.remove();
            }
        }
        System.out.println("Set after" +set);
        IteratorHw2 hw2 = new IteratorHw2();
        hw2.Hw();
        IteratorHw3 hw3 = new IteratorHw3();
        hw3.Hw();
        IteratorHw4 hw4 = new IteratorHw4();
        hw4.Hw();
    }
}

class IteratorHw2{
    void Hw (){
        System.out.println("");
        System.out.println("Hash Set: ");
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("Banana")){
                iterator.remove();
            }
        }
        System.out.println("Set after" +set);
    }
}

class IteratorHw3{
    void Hw(){
        System.out.println("");
        System.out.println("Hash Map: ");
        Map <String, Integer> map = new HashMap<>();
        map.put("Apple",1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("Banana")){
                iterator.remove();
            }
        }
        System.out.println("Set after" +map);
    }
}

class IteratorHw4{
    void Hw(){
        System.out.println("");
        System.out.println("Tree Map: ");
        Map <String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("Cherry", 2);
        map.put("Banana", 3);
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("Banana")){
                iterator.remove();
            }
        }
        System.out.println("Set after" +map);
    }
}




