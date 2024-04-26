public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>("Integer Box");
        intBox.setValue(42);

        Box<String> stringBox = new Box<>("String Box");
        stringBox.setValue("Hello, World!");

        System.out.println("Integer value: " + intBox.getValue());
        System.out.println("String value: " + stringBox.getValue());

        // Attempt to cast a different type
        try {
            intBox.castValue("Not an Integer");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }

        // Check if boxes have the same name
        Box<Double> doubleBox = new Box<>("Integer Box");
        System.out.println("Same name as intBox? " + intBox.hasSameName(doubleBox));
        System.out.println("Same name as stringBox? " + stringBox.hasSameName(doubleBox));
    }
}