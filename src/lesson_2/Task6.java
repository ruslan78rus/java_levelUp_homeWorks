package lesson_2;

//6. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

public class Task6 {

    public static void main(String[] args) {

        for (int x = 1000; x < 10000; x += 3) {
            System.out.println(x);
        }

    }

}
