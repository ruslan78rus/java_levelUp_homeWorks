package lesson_3;
import java.util.*;
//3 задача: Написать класс ArraySorting, в котором будет метод bubbleSort.
//Он на вход принимает массив целых чисел (int), а на выход отдает новый! массив с отсортированными по возрастанию значениями.
//Вам нужно выполнить сортировку массива с помощью сортировки пузырьком.

public class ArraySorting {

    public static void bubbleSort(int array[]) {
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,1,8,4,0,5};
        System.out.println("массив до сортировки: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("массив после сортировки: " + Arrays.toString(array));
    }
}
