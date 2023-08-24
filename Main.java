import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        findElementFrequencies(array);
    }

    public static void findElementFrequencies(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(number + " sayısı " + frequency + " kere tekrar edildi.");
        }
    }
}
