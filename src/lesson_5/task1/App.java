package lesson_5.task1;

// Далее в методе main создайте массив из объектов этого класса.
// И попробуйте с помощью цикла и метода equals найти объект в массиве.

public class App {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("Doberman", 70, 43, "brown");
        dogs[1] = new Dog("Black Terrier", 76, 55, "black");
        dogs[2] = new Dog("Zwergschnauzer", 35, 7, "pepper salt");

        for (int x = 0; x < dogs.length; x++) {
            boolean equals = dogs[x].getBreed().equals("Zwergschnauzer");
            if (equals == true) {
                System.out.println("Это " + (x+1) + " обьект под индексом: " + x);
            }
        }
    }
}
