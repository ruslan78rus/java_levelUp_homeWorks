package lesson_3;

//2 задача: Написать класс ArrayUtil. У него два метода - min(int[] array) и max(int[] array).
// Он должен возвращать вам минимум и максимум из переданного массива.
// Т.е. в метод min вы передаете массив, а в ответ вам возвращается число, которое является минимум из переданного массива.

public class ArrayUtil {

    static int min(int[] array) {

        int min = array[0];
        for (int arr : array) {
            if (arr <= min) {
                min = arr;
            }
        }
        return min;
    }

    static int max(int[] array) {

        int max = array[0];
        for (int arr : array) {
            if (arr >= max) {
                max = arr;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {6,3,9,1,4,7,3};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }


}

