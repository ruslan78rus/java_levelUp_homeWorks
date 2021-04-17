package lesson_2;

//4. Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру. Примеры работы программы:
//В числе 208 наибольшая цифра 8. В числе 774 наибольшая цифра 7. В числе 613 наибольшая цифра 6


import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        Random r = new Random();
        int naturalNum = r.nextInt(900) + 100;

        int a = naturalNum / 100;
        int b = (naturalNum - (a * 100)) / 10;
        int c = naturalNum - (a * 100) - (b * 10);
        int maxNum = 0;

        if (a >= b && a >= c) {
            maxNum = a;
        }
        if (b >= a && b >= c) {
            maxNum = b;
        }
        if (c >= a && c >= b) {
            maxNum = c;
        }
        System.out.println("В числе " + naturalNum + " наибольшая цифра " + maxNum);

    }

}
