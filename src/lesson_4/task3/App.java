package lesson_4.task3;
//  В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//  В цикле отправляйте их на прием к ветеринару :)
public class App {
    public static void main(String[] args) {
        Veterinar vet = new Veterinar();
        Animal dog = new Dog("Мясо", "Домашнее", "Собака");
        Animal cat = new Cat("Вискас", "Домашнее", "Кошка");
        Animal horse = new Horse("Сено", "Домашнее", "Лошадь");

        Animal[] animals = {
                dog,
                cat,
                horse
        };

        for (int i = 0; i < animals.length; i++) {
            vet.treatAnimal(animals[i]);
        }

    }
}
