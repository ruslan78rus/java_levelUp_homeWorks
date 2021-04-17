package lesson_2;

//1. Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.

import java.io.*;

public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите пожалуйста число: ");
        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);

        if (num%2 == 0) {
            System.out.println("Число является чётным");
        } else {
            System.out.println("Число является нечётным");
        }

    }
}
