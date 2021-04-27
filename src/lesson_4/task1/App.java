package lesson_4.task1;

public class App {

    public static void main(String[] args) {

        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();

        String[] numbers = {"+7 (999) 214-89-29", "+7 (904) 123-45-67", "+7 (904) 614-35-34"};

        System.out.println("номер телефона: " + p1.getNumber() + ", номер модели: " + p1.getModel() + ", вес телефона: " + p1.getWeight());
        System.out.println("номер телефона: " + p2.getNumber() + ", номер модели: " + p2.getModel() + ", вес телефона: " + p2.getWeight());
        System.out.println("номер телефона: " + p3.getNumber() + ", номер модели: " + p3.getModel() + ", вес телефона: " + p3.getWeight());

        p1.receiveCall("Руслан");
        p2.receiveCall("Максим");
        p3.receiveCall("Артем");

        p1.receiveCall("Руслан", "+7 (999) 214-89-29");
        p2.receiveCall("Максим", "+7 (904) 123-45-67");
        p3.receiveCall("Артем", "+7 (904) 614-35-34");

        Phone.sendMessages(numbers, "Позвони родителям");

    }


}
