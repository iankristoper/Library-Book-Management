package com.ian.library_management_system;

import java.util.Scanner;

/**
 *
 * @author Ian Tagano
 */

//This is the main class 
public class Library_Management_System 
{
    public static void main(String[] args) 
    {
       Library library = new Library();
       Scanner scanner = new Scanner(System.in);
       
       //adding some books to the library
       library.addBook(new Book("Harry Potter", "J.K. Rowling"));
       library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
       library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
       
       int choice;
       
       do
       {
           System.out.println("\nLibrary Management System Menu:");
           System.out.println("1. Display Available Books");
           System.out.println("2. Borrow a Book");
           System.out.println("3. Return a Book");
           System.out.println("4. Exit");
           System.out.print("Enter your choice: ");
           
           choice = scanner.nextInt();
           
           
           switch(choice)
           {
               case 1:
                   library.displayAvailableBooks();
                   break;
                   
               case 2:
                   System.out.print("Enter title of the book you want to borrow: ");
                   scanner.nextLine(); //consume newline
                   
                   String borrowTitle = scanner.nextLine();
                   library.lendBook(borrowTitle);
                   break;
                   
               case 3:
                   System.out.print("Enter the title of the book you want to return: ");
                   scanner.nextLine(); //consume newline 
                   
                   String returnTitle = scanner.nextLine();
                   library.returnBook(returnTitle);
                   break;
                   
               case 4:
                   System.out.println("Exiting the Library Management System...");
                   break;
                   
               default:
                   System.out.println("Invalid choices, please try again");
                           
               
            
           }
            
            
            
       } while(choice != 4);
       
       scanner.close();
    }
}
