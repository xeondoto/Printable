
public class Printablee {
    public static void main(String[] args) {
        Book book1 = new Book("Твое имя");
        Book book2 = new Book("Богатый папа,бедный папа");
        Magazine magazine1 = new Magazine("Максим");
        Magazine magazine2 = new Magazine("как выиграть в Доту");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        {
            for (Printable printable:printables) {
                printable.print();
            }
        }
    }
}