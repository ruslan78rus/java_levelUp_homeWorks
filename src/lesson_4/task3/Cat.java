package lesson_4.task3;

public class Cat extends Animal {

    private String animal;
    public Cat(String food, String location, String animal) {
        super(food, location,animal);
    }


    public void makeNoise(String noise) {
        System.out.println(noise);
    }

    public void eat(String eat) {
        System.out.println(eat);
    }
}
