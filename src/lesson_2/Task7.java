package lesson_2;

//7. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …

public class Task7 {

    public static void main(String[] args) {

        int y = 0;
        for (int x = 1;y < 55 ; x += 2) {
            System.out.println(x);
            y++;
        }
    }

}
