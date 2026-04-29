import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class PracticeProblem {

    // 1. Swap elements in an ArrayList
    public static void swap(ArrayList<String> list, int index1, int index2) {
        String temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    // 2. Convert double array to ArrayList
    public static ArrayList<Double> createArrayList(double[] arr) {
        ArrayList<Double> list = new ArrayList<>();
        for (double d : arr) {
            list.add(d);
        }
        return list;
    }

    // 3. Combine parallel arrays into a HashMap
    public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(names[i], ages[i]);
        }
        return map;
    }

    // 4. Increase the age value in a HashMap
    public static void increaseAge(HashMap<String, Integer> map, String name) {
        if (map.containsKey(name)) {
            int currentAge = map.get(name);
            map.put(name, currentAge + 1);
        }
    }
}