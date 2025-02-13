import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Accessing elements
        System.out.println("names:");
        System.out.println(names.get(1)); // Output: Bob
        
        // Iterating
        for (String name : names) {
            System.out.println("name in interation");
            System.out.println(name);
        }

        // Removing an element
        names.remove("Alice");
        System.out.println("name after iteration");
        System.out.println(names); // Output: [Bob, Charlie]
    }
}

