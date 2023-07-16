package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);
        list1.add(12);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(15);


        list1.addAll(newList);
        list1.removeAll(newList);

        var hasValue = list1.contains(67);
        var isEmpty = list1.isEmpty();
        list1.retainAll(newList);
        // removes elements from list except the ones passed as argument to the function
//
//        System.out.println(list1);


        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(15);
        hashSet.add(67);
        hashSet.add(43);
        hashSet.add(12);
        hashSet.add(12);
        hashSet.add(12);
        hashSet.add(12);

        List<Integer> li = new ArrayList<>(hashSet);
        // this will populate my list with the items from the hashset passed as argument
        System.out.println(li);

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(12);
        integerHashSet.add(43);
        integerHashSet.add(15);
        integerHashSet.add(67);

        ArrayList<Integer> hashSetConverted = new ArrayList<>(integerHashSet);

        Collections.sort(hashSetConverted);
        // receives a list as argument and sorts the elements

        System.out.println(hashSetConverted);

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Test");
        stringHashSet.add("Boolean");
        stringHashSet.add("Zoo");
        stringHashSet.add("Double");
        stringHashSet.add("Car");

        ArrayList<String> stringHashSetConverted = new ArrayList<>(stringHashSet);

        Collections.sort(stringHashSetConverted);

//        System.out.println(stringHashSet);
//        System.out.println(stringHashSetConverted);

        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(new Employee("Ferdnand", 2000, "IT"));
        employeeHashSet.add(new Employee("Carl", 1500, "Sales"));
        employeeHashSet.add(new Employee("Arnold", 3000, "Accounting"));
        employeeHashSet.add(new Employee("Zelda", 2500, "HR"));

        System.out.println(employeeHashSet);

        ArrayList<Employee> employees = new ArrayList<>(employeeHashSet);

        Collections.sort(employees);
        // we need to implement the comparable interface in order to compare one instance of employee with another

        System.out.println(employees);
    }
}
