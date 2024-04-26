class Box<T, V> implements BoxOperations<V> {
    private T value;
    private String name;
    V largestValue;

    public Box(String name) {
        this.name = name;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public T castValue(Object otherValue) {
        try {
            return (T) otherValue;
        } catch (ClassCastException e) {
            throw new ClassCastException("Cannot cast value to type T");
        }
    }

    public boolean hasSameName(Box<?, ?> otherBox) {
        return this.name.equals(otherBox.name);
    }

    @Override
    public void setLargestValue(V value1, V value2){
        if (value1 instanceof Comparable && value2 instanceof Comparable){
            if (value1.getClass().equals(value2.getClass())){
                Comparable<V> comparableValue1 = (Comparable<V>) value1;
                Comparable<V> comparableValue2 = (Comparable<V>) value2;
                largestValue = comparableValue1.compareTo((V) comparableValue2) >=0 ? value1:value2;
            } else {
                System.out.println("Can't compare different types");
            }
        } else {
            System.out.println("It must be a number type");
        }

    }
}
