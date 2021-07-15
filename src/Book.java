
public class Book {
    private String Title;           // Title of Book
    private String Author;          // Title of Author
    private String Description;     // Description of Book
    private String Price;           // Total Price of Book
    private String isInstock;       // In-stock TRUE OR FALSE



    //Method to Display Author, Title, and Description
    void getDisplayText(){
        String DisplayText;
        DisplayText = Author + Title + Description;
        System.out.println(DisplayText);
    }

    //Method To The Pricing For A Requested Number Of Books
    public static void printTotalPrice(){
        System.out.println("Would You Like To Order A New Book?\n");

    }

    //Overload Constructor
    public Book(String Title,String Author, String Description, String Price, String IsIstock){
        this.Title = Title;
        this.Author = Author;
        this.Description = Description;
        this.Price = Price;
        this.isInstock = IsIstock;
    }
}
