import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookList = new TreeSet<>();
        TreeSet<Book> bookList2 = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }

        });


        bookList.add(new Book("c", 10, "Batuhan", "4 Ocak 2023"));
        bookList.add(new Book("s", 20, "kayahan", "1 Ocak 2023"));
        bookList.add(new Book("d", 2230, "patika", "10 Ocak 2023"));
        bookList.add(new Book("a", 210, "102", "2 Ocak 2023"));
        bookList.add(new Book("ds", 320, "üstadı", "3 Ocak 2023"));


        bookList2.add(new Book("c", 10, "furkan", "6 şubat 2023"));
        bookList2.add(new Book("s", 20, "AhmetHaşim", "1 Ocak 2023"));
        bookList2.add(new Book("d", 2230, "Sezai", "10 Ocak 2023"));
        bookList2.add(new Book("a", 210, "Fırat", "2 Ocak 2023"));
        bookList2.add(new Book("ds", 320, "Selim", "3 Ocak 2023"));


        for (Book book : bookList) {
            System.out.println(book);
        }


        for (Book book : bookList2) {
            System.out.println(book);
        }
    }
}