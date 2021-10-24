import java.util.Arrays;

public class DynamicArray<T> {

    private int size = 0;

    Object[] array = new Object[10];

    public DynamicArray() {
    }

    public void add(T el) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = el;
        size++;
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
    }

    public T get(int index) {
        return (T) array[index];
    }

    public int getLength() {
        return array.length;
    }
}
