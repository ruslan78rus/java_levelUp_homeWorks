package lesson_6.task1;

public class StructureApp {

    public static void main(String[] args) {
        Structure s = new DynamicArray(3);

        s.addValue(40);
        s.addValue(65);
        s.addValue(32);
        s.addValue(54);
        s.addValue(67);
        s.addValue(97);
        s.addValue(123);
        s.get(1);
        s.getSize();
        s.isEmpty();


    }

}
