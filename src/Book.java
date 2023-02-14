import java.util.Objects;

public class Book implements Printable {
    private String name;

    public Book (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void print() {
        System.out.println("Название книги-  " + getName());
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }


    public int hashCode() {
        return Objects.hash(name);
    }


    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

}


