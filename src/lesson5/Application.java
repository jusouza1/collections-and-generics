package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        /*
         identify the data type for the key and the data type for the value
         implement the map interface
         does not keep the order of the elements
         */
        dictionary.put("Brave", "ready to face and endure danger or pain; showing courage");
        dictionary.put("Brilliant", "exceptionally clever or talented");
        dictionary.put("Joy", "a feeling of great pleasure and happiness");
        dictionary.put("Confidence", "the state of feeling certain about the truth of somethin");

        for (String word: dictionary.keySet()){
            // with the keySet() method we are able to loop through the keys of the dictionary
            System.out.println(word + ": " + dictionary.get(word));
            //the keys are not ordered
        }

        LinkedHashMap<String, String> dictionaryOrdered = new LinkedHashMap<>();
        // linkedHashMap preserves the order of insertion

        dictionaryOrdered.put("Brave", "ready to face and endure danger or pain; showing courage");
        dictionaryOrdered.put("Brilliant", "exceptionally clever or talented");
        dictionaryOrdered.put("Joy", "a feeling of great pleasure and happiness");
        dictionaryOrdered.put("Confidence", "the state of feeling certain about the truth of somethin");

        System.out.println("////////////////////////////////");

        for (String word: dictionaryOrdered.keySet()) {
            System.out.println(word + ": " + dictionaryOrdered.get(word));
        }

        System.out.println("////////////////////////////////");

        for (Map.Entry<String, String> set:  dictionaryOrdered.entrySet()){
            // access both key and value pairs at once
            System.out.println(set);
        }

        System.out.println("////////////////////////////////");

        TreeMap<String, String> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("Brave", "ready to face and endure danger or pain; showing courage");
        stringTreeMap.put("Brilliant", "exceptionally clever or talented");
        stringTreeMap.put("Joy", "a feeling of great pleasure and happiness");
        stringTreeMap.put("Confidence", "the state of feeling certain about the truth of somethin");
        //maintains natural order: for strings, alphabetical, for numbers, ascending order
        // cannot be used to store duplicates in the map data structure
        // if you need duplicate keys, then you need to override equals/hashcode methods

        for (String set:  stringTreeMap.values()){
            // access both key and value pairs at once
            System.out.println(set);
        }
    }
}
