package lesson_6.task1;

//1 задачка:
//Написать методы класса DynamicArray.
//•	removeByValue(int value) - удаляет все элементы из массива, которые равны заданному значению.
// К примеру, removeByValue(3), массив элементов [3, 5, 6, 3, 8, 4], в результате должны остаться [5, 6, 8, 4].
//•	removeByIndex(int index) - удаляет элемет по индексу
//•	trim() - уменьшает размер массива до количества элементов, т.е. Если размер массива 9, а элементов 5, то размер массива должен стать равным 5.
//•	get(int index) - получение элемента по индексу
//•	getSize() - получение размера списка
//•	isEmpty() - возвращает true, если список пуст, иначе false.



public class DynamicArray implements Structure {

    private int[] elements;
    private int size;


    public DynamicArray(int initialCapacity) {
        this.elements = new int[initialCapacity];
        this.size = 0;
    }

    @Override
    public void addValue(int value) {
        if (elements.length == size) {
            int[] oldArray = elements;
            elements = new int[size * 2];
            System.arraycopy(oldArray, 0, elements, 0, oldArray.length);
        }
        elements[size++] = value;
    }


    @Override
    public void removeByValue(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (i == value) {
                System.arraycopy(elements, i + 1, elements, i, elements.length - i - 1);
                size--;
            }
            System.out.println(elements[i]);
        }
    }

    @Override
    public void removeByIndex(int index) {
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                System.arraycopy(elements, i + 1, elements, i, elements.length - i - 1);
                size--;
            }
            System.out.println(elements[i]);
        }
    }


    @Override
    public void trim() {
        if (size != elements.length) {
            int[] oldArray = elements;
            elements = new int[size];
            System.arraycopy(oldArray, 0, elements, 0, size);
        }
    }

    @Override
    public void get(int index) {
        System.out.println(elements[index]);
    }

    @Override
    public void getSize() {
        System.out.println(size);
    }

    @Override
    public void isEmpty() {
        if (size == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
