package com.ian.library_management_system;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ian Tagano
 */


public class Library 
{
    private final List<Book> books;
   
    
    //constructor for creating new object
    public Library()
    {
        this.books = new ArrayList<>();
    }
    
    
    //methods for adding book
    public void addBook(Book book)
    {
        books.add(book);
    }
    
    
    //methods for displaying the available books
    public void displayAvailableBooks()
    {
        System.out.println("Available books: ");
        
        for(Book book : books)
        {
            if(book.isAvailable())
            {
                System.out.println(book);
            }
        }
    }
    
    
    //methods for lending a book
    public void lendBook(String title)
    {
        for(Book book : books)
        {
            if(book.getTitle().equalsIgnoreCase(title) && book.isAvailable())
            {
                book.setAvailable(false);
                System.out.println("You have borrowed: " + book.getTitle());
                return;
            }
        }
        
        
        System.out.println("Sorry, the book is not available for borrowing");
    }
    
    
    //methods for returning the book
    public void returnBook(String title)
    {
        for(Book book : books)
        {
            if(book.getTitle().equalsIgnoreCase(title) && !book.isAvailable())
            {
                book.setAvailable(true);
                System.out.println("You have return " + book.getTitle());
                return;
            }
        }
        
        System.out.println("This is not valid book to return");
    }
    
}
