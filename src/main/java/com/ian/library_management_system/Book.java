

package com.ian.library_management_system;

/**
 *
 * @author Ian Tagano
 */


public class Book 
{
    //private attributes for the book
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;
    
    
    //CONSTRUCTOR method -> used to initialize value when new object is created 
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    
    
    //GETTER methods -> used to return value from the private attirbutes
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author; 
    }
    
    public boolean isAvailable()
    {
        return isAvailable;
    }
    
    
    //SETTER methods -> used to set value to the private attributes 
    public void setAvailable(boolean available)
    {
        isAvailable = available;
    }
    
    @Override 
    public String toString()
    {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", isAvailable=" + isAvailable + '}';
    }
    
    
    
    
    
    
    
}
