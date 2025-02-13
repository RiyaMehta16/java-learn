import java.util.TreeMap;

//TreeMap (Sorted Key-Value Store)
public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String, Integer> students = new TreeMap<>();
        
        students.put("Alice", 23);
        students.put("Bob", 21);
        students.put("Charlie", 22);
        
        System.out.println(students); // Output: {Alice=23, Bob=21, Charlie=22} (Sorted by key)
    }
}

// Data Structure	Feature	Allows          Duplicates?	    Ordered?

// Array	        Fixed-size list	        ✅ Yes	        ✅ Yes
// ArrayList	    Dynamic list	        ✅ Yes	        ✅ Yes
// LinkedList	    Fast insert/delete	    ✅ Yes	        ✅ Yes
// HashSet	        Unique elements	        ❌ No	        ❌ No
// TreeSet	        Sorted unique elements	❌ No	        ✅ Yes
// HashMap	        Key-value pairs	        ✅ Yes (Values)	❌ No
// TreeMap	        Sorted key-value pairs	✅ Yes (Values)	✅ Yes (Keys)
