package lesson_4.task1;

//Класс Phone.
//        1. Создайте класс Phone, который содержит переменные number, model и weight.
//        2. Создайте три экземпляра этого класса.
//        3. Выведите на консоль значения их переменных.
//        4. Добавить в класс Phone методы:
//        receiveCall, имеет один параметр – имя звонящего.Выводит на консоль сообщение “Звонит {name}”.
//        getNumber – возвращает номер телефона.
//        Вызвать эти методы для каждого из объектов.
//        5. Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//        6. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//        7. Добавить конструктор без параметров.
//        8. Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        9. Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//        10. Создать метод sendMessages c массивом строк (String[]) в качестве одного из параметров.
//        Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.



public class Phone {

    private String number;
    private int model;
    private int weight;

    public Phone(String number, int model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, int model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {}

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void receiveCall(String callName) {
        System.out.println("Звонит " + callName);
    }

    public void receiveCall(String callName, String number) {
        System.out.println("Звонит: " + callName);
        System.out.println("Его номер телефона: " + number);
    }

    public static void sendMessages(String[] numbers, String mesage) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Послать сообщение: " + mesage + " на номер " + numbers[i]);
        }
    }
}
