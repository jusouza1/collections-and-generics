package lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        /*
        arrays -> limitations: when created, the size cannot be changed
        new data types to deal with those limitations

         */
//        ArrayList words = new ArrayList();
        ArrayList<String> words = new ArrayList<>();
        words.add("hello!");
        words.add("there");
        String itemOne = words.get(0);
        words.remove(1);
        // if array is of type is generic, every time we try to access an item, we're going to need type casting
        // ArrayList -> resizeable array, the default size at initialization is 10
        // when we try to add another item, it will create another
        // array of size 20 and then copy all items to the new array and so on
        //its more efficient for retrieving data
        System.out.println(itemOne);

        LinkedList<Integer> numbers = new LinkedList<>();
        // parametrization cannot be done with primitive type, so we need to use the class Integer
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);
        numbers.remove(2); // removes item at given index
        numbers.remove(); // removes the first item
        // will add each item at the end, its more efficient to deal with data than the arraylist
        // its less efficient to retrieve data but its more efficient to remove data

        for(int number: numbers) {
            System.out.println(number);
        }
    }
}