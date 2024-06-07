
import java.util.HashMap;
import java.util.Map;

public class HashMapExample{
    public static void main(String Args[] ){
        Map<String ,Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        System.out.println("Map: "+ map);
        map.remove("Banana");
        System.out.println("Map after removal: "+ map);
        System.out.println("Value for 'Cherry':"+map.get("Cherry"));
    }
}
