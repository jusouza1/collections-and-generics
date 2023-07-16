package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");

//        for(int i = 0; i < animals.size(); i++){
//            System.out.println(animals.get(i));
//        }
//
//        for(String animal : animals) {
//            System.out.println(animal);
//        }

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Honda", "accord", 12000, false));
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
        vehicles.add(new Vehicle("Toyota", "Etios", 10000, true));

        for(Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }

        printElements(vehicles);
        printElements(animals);
        // we can pass both collections as parameters because they both implement the List interface
    }

    public static void printElements(List someList) {
        for(int i = 0; i < someList.size(); i++){
            System.out.println(someList.get(i));
        }
    }
}
