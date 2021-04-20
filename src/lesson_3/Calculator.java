package lesson_3;

//1 задача: Создать класс Calculator. У него должны быть методы:
//        1. Сумма
//        2. Деление
//        3. Умножение
//        4. Вычитание
//        Все методы должны быть перегружены и работать с тремя типами - double, long и int.
//        Т.е. должны быть, к примеру, по 3 метода суммы: add(int a, int b), add(double a, double b) и add(long a, long b).


public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public long add(long a, long b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public long sub(long a, long b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public long mult(long a, long b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public long div(long a, long b) {
        return a / b;
    }

}
