public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Жамила", 500,  385, new Author("Айтматов", "aytmatov@gmail.com", 'M'));
        Book book2 = new Book("Гулсарат", 500,  416, new Author("Айтматов", "aytmatov@gmail.com", 'M'));
        Book book3 = new Book("Саманчынын жолу", 500,  395, new Author("Айтматов", "aytmatov@gmail.com", 'M'));
        Book [] books = {book1, book2, book3};
        for (Book b : books) {
            System.out.println(b);
        }

    }
}