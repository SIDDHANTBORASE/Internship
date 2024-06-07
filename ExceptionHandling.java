public class ExceptionHandling {
    public static void main(String args[]) {
        try {
            int[] number = {1, 2, 3};
            System.out.println(number[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound possible: " + e.getMessage());
        }try{
            int result = 10/0;

        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception: " + e.getMessage());
        }catch(Exception e){
            System.out.println("A general Exception occured: "+ e.getMessage());
        }
    }
}