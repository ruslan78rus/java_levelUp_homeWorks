package lesson_2;

//10. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите натуральное число: ");
        String sNumber = reader.readLine();
        int number = Integer.parseInt(sNumber);
        if (number > 0) {
            long factorial = 1;
            for (int x = 1; x <= number; x++) {
                factorial *= x;
            }
            System.out.println(factorial);
        } else {
            System.out.println("Введите положительное число.");
        }
    }
}
