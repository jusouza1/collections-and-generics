package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

    public static void main(String[] args) {
        /*
        Sets => prevents duplicates from being inserted into it,
        HashSet => doesn't care about order, but won't receive duplicates
        LinkedHashSet => maintains the order and prevents duplicates
         */
        /*
        Linked lists are better for adding/removing data, but arraylists are better for retrieving data
         */
        HashSet<Integer> values = new HashSet<>();
        values.add(12);
        values.add(43);
        values.add(15);
        values.add(67);
        values.add(43);

//        for(Integer value: values) {
//            System.out.println(value);
//        }

        LinkedHashSet<Integer> valuesOrdered = new LinkedHashSet<>();
        valuesOrdered.add(12);
        valuesOrdered.add(43);
        valuesOrdered.add(15);
        valuesOrdered.add(67);
        valuesOrdered.add(43);

        for(Integer value: valuesOrdered) {
            System.out.println(value);
        }


        HashSet<Animals> animals = new HashSet<>();
        /*
        HashSet is not able to identify equal objects if we don't override it withing the class Animals
        We also need to override the hashcode method, otherwise the objects will still be identified as different
        When we override the equals object and hashcode, now hashset won't accept equal objects of type Animals
         */
        Animals animals1 = new Animals("Dog", 1);
        Animals animals2 = new Animals("Cat", 2);
        Animals animals3 = new Animals("Bird", 1);
        Animals animals4 = new Animals("Dog", 1);
        Animals animals5 = new Animals("Cangaroo", 6);

        animals.add(animals1);
        animals.add(animals2);
        animals.add(animals3);
        animals.add(animals4);
        animals.add(animals5);

        for(Animals animal: animals) {
            System.out.println(animal);
        }

        System.out.println(animals1.hashCode());
        System.out.println(animals4.hashCode());
        // these objects have the same hashcode, so now hashmap will identify them as equals

    }
}
