class Box<T, V> {
    private T value;
    V largestValue;
    private String name;


    public Box(String name, V largestValue) {
        this.name = name;
        this.largestValue = largestValue;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setLargestValue(V largestValue) {
        this.largestValue = largestValue;
    }

    public T castValue(Object otherValue) {
        try {
            System.out.println(otherValue);
            return (T) otherValue;
        } catch (ClassCastException e) {
            throw new ClassCastException("Cannot cast value to type T");
        }
    }

    public boolean hasSameName(Box<?> otherBox) {
        return this.name.equals(otherBox.name);
    }
}