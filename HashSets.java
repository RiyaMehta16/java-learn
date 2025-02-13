import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York"); // Duplicate ignored

        System.out.println(cities); // Output: [Chicago, Los Angeles, New York] (Order may vary)
    }
}
// 📌 Key Points:

// No duplicates allowed.
// No guaranteed order of elements.