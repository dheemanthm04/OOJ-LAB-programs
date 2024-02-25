/*Create a class Book which contains four members: name, author, price, num_pages. 
Include a constructor to set the values for the members. Include methods to set and 
get the details of the objects. Include a toString( ) method that could display the 
complete details of the book. Develop a Java program to create n book objects.*/ 

import java.util.Scanner;

class Book {
    String bookname;
    String author;
    int price, pages;

    Book(String bookname, String author, int price, int pages) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBookauthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getBookname() {
        return bookname;
    }

    public String getBookauthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return "Book name: " + bookname + "\nAuthor: " + author + "\nPrice: " + price + "\nPages: " + pages;
    }
}

class Lab3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of books");
        int size = s.nextInt();
        s.nextLine();
        Book[] b = new Book[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter name of Book " + (i + 1));
            String bookname = s.nextLine();
            System.out.println("Enter author of Book " + (i + 1));
            String author = s.nextLine();
            System.out.println("Enter price of Book " + (i + 1));
            int price = s.nextInt();
            System.out.println("Enter pages of Book " + (i + 1));
            int pages = s.nextInt();
            s.nextLine(); 
            b[i] = new Book(bookname, author, price, pages);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("Book " + (i + 1) + ":\n" + b[i].toString());
        }
    }
}
