import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        
        // Adding key-value pairs
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 88);

        // Accessing values
        System.out.println(scores.get("Alice")); // Output: 90

        // Iterating through keys
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }
    }
}
// Key Points:

// Stores key-value pairs (like a dictionary).
// Keys are unique (values can be duplicate).
// Fast lookup using keys.