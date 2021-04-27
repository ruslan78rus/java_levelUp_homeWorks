package lesson_4.task2;

//2 задачка:
//  Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон.
//  Разработать программу, в которой создается массив объектов данного класса.
//  Перегрузить методы takeBook(), returnBook():
//
//    1. takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//
//    2. takeBook, который будет принимать переменное количество названий книг.
//    Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//
//    3. takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги).
//    Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//
//    4. Аналогичным образом перегрузить метод returnBook().
//    Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги"



public class Reader {

    private String fio;
    private int readTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String telNumber;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getReadTicketNumber() {
        return readTicketNumber;
    }

    public void setReadTicketNumber(int readTicketNumber) {
        this.readTicketNumber = readTicketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }


    public void takeBook(int numOfBooks) {
        System.out.println(fio + " взял " +  numOfBooks + " книги");
    }

    public void takeBook(String ... bookTitle) {
        System.out.print(fio + " взял книги: ");
        for (int i = 0; i < bookTitle.length; i++) {
            System.out.print(bookTitle[i]);
            System.out.print(". ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(fio + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Название: " + books[i].getTitle());
            System.out.println("Автор: " + books[i].getAuthor() + ". ");
        }
        System.out.println();
    }

    public void returnBook(int numOfBooks) {
        System.out.println(fio + " вернул " +  numOfBooks + " книги");
    }

    public void returnBook(String ... bookTitle) {
        System.out.print(fio + " вернул книги: ");
        for (int i = 0; i < bookTitle.length; i++) {
            System.out.print(bookTitle[i]);
            System.out.print(". ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(fio + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Название: " + books[i].getTitle());
            System.out.println("Автор: " + books[i].getAuthor() + ". ");
        }
        System.out.println();
    }
}
