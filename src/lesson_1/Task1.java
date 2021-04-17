package lesson_1;

//2. Написать программу, которая производит математические операции на двумя переменными a и b и вывести результаты на экран.
// Т.е. должны быть выведены сумма, разность, проиведение и частное. Попробуйте с разными типами a и b. Есть ли среди результатов отличия?


public class Task1 {

    public static void main(String[] args)  {
        int a = 2;
        int b = 7;
        double c = 21.78;
        double d = 23.5;
        int add = a + b;
        int sub = a - b;
        int mult = a * b;
        double div = c / d;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);

    }

}
