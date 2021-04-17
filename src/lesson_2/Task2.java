package lesson_2;

//2. Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n.
// Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ведите 2 числа: ");
        String sM = reader.readLine();
        String sN = reader.readLine();
        double m = Double.parseDouble(sM);
        double n = Double.parseDouble(sN);

        if (Math.abs(10 - m) > Math.abs(10 - n)) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }

    }

}
