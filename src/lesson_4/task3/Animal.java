package lesson_4.task3;

//3 задачка:
//  Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
//  Класс Animal содержит:
//  переменные: food, location
//  методы: makeNoise, eat, sleep.
//  Метод sleep, например, может выводить на консоль "Такое-то животное спит".
//  Dog, Cat, Horse переопределяют методы makeNoise, eat.
//  Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
//  Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
//  Пусть этот метод распечатывает food и location пришедшего на прием животного.
//  В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//  В цикле отправляйте их на прием к ветеринару :)


public class Animal {
    private String food;
    private String location;
    private String animal;

    public Animal(String food, String location, String animal) {
        this.food = food;
        this.location = location;
        this.animal = animal;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void makeNoise() {}

    public void eat() {}

    public void sleep() {
        System.out.println(toString() + "животное спит");
    }
}
