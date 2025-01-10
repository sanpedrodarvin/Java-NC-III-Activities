public class Tasksheet123 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Java Programming", "John Smith", 2021, 39.99);
        books[1] = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        books[2] = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        for(int b = 0; b < books.length; b++)
            System.out.println("Book " + (b + 1) + ":\n"
                                + "Title: \"" + books[b].getTitle() + "\"\n"
                                + "Author: \"" + books[b].getAuthor() + "\"\n"
                                + "Year Published: " + books[b].getYearPublished() + "\n"
                                + "Price: $" + books[b].getPrice() + "\n");
    }

}

class Book {
    private String title, author;
    private int yearPublished;
    private double price;

    public Book (String title, String author, int yearPublished, double price)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
    }
}
