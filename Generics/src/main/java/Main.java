import java.util.*;
public class Main {
    public static void main(String[] args) {
//        Box<Integer, Number> intBox = new Box<>("Integer Box");
//        intBox.setValue(42);
//
//        Box<String, Integer> stringBox = new Box<>("String Box");
//        stringBox.setValue("Hello, World!");
//
//        System.out.println("Integer value: " + intBox.getValue());
//        System.out.println("String value: " + stringBox.getValue());

        // Attempt to cast a different type
//        try {
//            intBox.castValue("Not an Integer");
//        } catch (ClassCastException e) {
//            System.out.println("ClassCastException caught: " + e.getMessage());
//        }

        // Check if boxes have the same name
//        Box<String, Double> doubleBox = new Box<>("Double Box");
//        System.out.println("Same name as intBox? " + intBox.hasSameName(doubleBox));
//        System.out.println("Same name as stringBox? " + stringBox.hasSameName(doubleBox));

//        intBox.setLargestValue(99,38L);
//        System.out.println(intBox.largestValue);

        List<Double> doubleNumbers = List.of(3.14, 2.71, 1.618);
        Box<Double, Double> doubleBox = new Box<>("DoubleBox");
        doubleBox.setLargestNumberFromList(doubleNumbers);
        System.out.println(doubleBox.largestValue);
    }
}