package lesson_4.task2;

public class App {

    public static void main(String[] args) {
        Reader[] readers = {
                new Reader(),
                new Reader(),
                new Reader()
        };

        readers[0].setFio("Иванов В.В.");
        readers[1].setFio("Петров А.А.");
        readers[2].setFio("Сидоров Е.Е.");


        readers[0].takeBook(3);
        readers[1].takeBook(2);
        readers[2].takeBook(1);
        System.out.println("-----------------------------------------------------------------");


        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[1].takeBook("Словарь", "Энциклопедия");
        readers[2].takeBook("Энциклопедия");
        System.out.println("-----------------------------------------------------------------");

        Book book1 = new Book("Капитан Немо", "Жюль Верн");
        Book book2 = new Book("Двадцать тысяч лье под водой", "Жюль Верн");
        Book book3 = new Book("Все о муми троллях", "Туве Янссон");

        Book[] books = {book1, book2, book3};

        readers[0].takeBook(book1, book2, book3);
        readers[1].takeBook(book1, book2);
        readers[2].takeBook(book1);
        System.out.println("-----------------------------------------------------------------");


        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].returnBook(book1, book2, book3);
        readers[1].returnBook(book1, book2);
        readers[2].returnBook(book1);

    }





}
