
public class Main {

    public static void main(String[] args) {

        Book book = new Book ("The Great Gatsby\n","F. Scott Fitzgerald\n","Nick interactions with mysterious millionaire\n","Total:14.99", "True");

        System.out.println("Your Book: ");
        book.getDisplayText();
        System.out.println("Your Total is: ");
        addPrice();
    }

    // Method that returns pricing for a requested number of books.
    public static void addPrice() {
        int Book = 20;
        int TotalBooks = 5;
        int sum;
        sum = Book * TotalBooks;

        System.out.println(sum);
    }
}
