import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers); // Output: [5, 10, 20]

        numbers.addFirst(5);  // Add at the beginning
        
        System.out.println(numbers); // Output: [5, 10, 20]
    }
}
