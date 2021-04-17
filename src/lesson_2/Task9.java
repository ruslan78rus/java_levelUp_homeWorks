package lesson_2;

//9. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class Task9 {

    public static void main(String[] args) {

        int y = 0;
        for (int x = 2; y < 20; x += x) {
            System.out.println(x);
            y++;
        }

    }

}
