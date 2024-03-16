package com.ian.library_management_system;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ian Tagano
 */


public class Library 
{
    private List<Book> books;
    
    public Library()
    {
        this.books = new ArrayList<>();
    }
    
    
    public void addBook(Book book)
    {
        books.add(book);
    }
    
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
