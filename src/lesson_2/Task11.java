package lesson_2;

//11. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите натуральное число: ");
        String sNumber = reader.readLine();
        int number = Integer.parseInt(sNumber);

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (number%i == 0) {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.println("Введите положительное число.");
        }
    }

}
