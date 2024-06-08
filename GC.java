class GenericClass<T> {
    private T value;
    public GenericClass(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class GC{
    public static void main(String Args[]){
        //Int Type
        GenericClass<Integer> intObject = new GenericClass<>(123);
        System.out.println("Integer value: " + intObject.getValue());
        //String Type
        GenericClass<String> StringObject = new GenericClass<>("Hello, World");
        System.out.println("String Value: "+ StringObject.getValue());
        //Double Type
        GenericClass<Double> doubleObject = new GenericClass<>(34.5);
        System.out.println("Double Value: "+ doubleObject.getValue());
    }
}