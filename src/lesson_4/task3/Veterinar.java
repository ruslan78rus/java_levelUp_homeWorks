package lesson_4.task3;
//  Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
//  Пусть этот метод распечатывает food и location пришедшего на прием животного.
public class Veterinar {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getAnimal() + " ест " + animal.getFood() + ", животное " + animal.getLocation());
    }
}
