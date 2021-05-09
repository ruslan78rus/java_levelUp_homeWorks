package lesson_5.task1;

//1 задачка: Создайте класс любой сущности на выбор.
// Определите у нее несколько полей, конструктор с параметрами и переопределите метод equals.
// Далее в методе main создайте массив из объектов этого класса. И попробуйте с помощью цикла и метода equals найти объект в массиве.

import java.util.Objects;

public class Dog {

    private String breed;
    private int height;
    private int weight;
    private String color;

    public Dog(String breed, int height, int weight, String color) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog second = (Dog) o;
        return Objects.equals(breed, second.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }
}
