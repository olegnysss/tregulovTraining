package Tregulov.collections.treeMap;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeMapTest {
    private TreeMap<String, Integer> treeMap;

    @Before
    public void setUp() {
        // Create a TreeMap and add some entries to it
        treeMap = new TreeMap<>();
        treeMap.put("John", 25);
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 20);
        treeMap.put("Chris", 35);
    }

    @Test
    public void testSortByValue() {
        // Create a custom Comparator to sort by value
        Comparator<String> valueComparator = (key1, key2) -> {
            Integer value1 = treeMap.get(key1);
            Integer value2 = treeMap.get(key2);
            return value1.compareTo(value2);
        };

        // Create a new TreeMap with the custom Comparator
        System.out.println(treeMap);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(valueComparator);
        sortedMap.putAll(treeMap);
        System.out.println(sortedMap);

        // Verify that the entries are sorted by value
        assertEquals("Bob", sortedMap.firstKey());
        assertEquals(Integer.valueOf(20), sortedMap.get("Bob"));
        assertEquals("Chris", sortedMap.lastKey());
        assertEquals(Integer.valueOf(35), sortedMap.get("Chris"));
    }
}
