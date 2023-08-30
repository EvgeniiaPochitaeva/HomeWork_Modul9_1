package HomeWork_Modul9_1;

public class MyArrayList {
    private Object[] myArray;
    private int size;

   private String color;

    @Override
    public String toString() {
        return color;
    }

    public MyArrayList() {
        myArray = new Object[10];
        size = 0;
    }
    public void add(Object value) {
        if (size == myArray.length) {
           Object[] newArray = new Object[myArray.length * 2];
            System.arraycopy(myArray, 0, newArray, 0, size);
            myArray = newArray;
        }
        myArray[size] = value;
        size++;

    }


    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона.");
        }

        System.arraycopy(myArray, index + 1, myArray, index, size - index - 1);
        myArray[size - 1] = null;
        size--;
    }


    public void clear() {
        for (int i = 0; i < size; i++) {
            myArray[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона.");
        }
        return myArray[index];
    }
}

