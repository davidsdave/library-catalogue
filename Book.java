import java.util.Scanner;

class Book 
{
 private String tittle, author,publisher,year_published;

 public void data_in()
{
   Scanner read= new Scanner(System.in);
   System.out.print("Enter the tittle of the book: ");  
   tittle =read.nextLine();
    System.out.print(":Enter the author of the book: ");  
    author =read.nextLine();
    System.out.print("Enter the publisher of the book : ");  
    publisher =read.nextLine();
    System.out.print("Enter the year of publishing the book: ");  
    year_published = read.nextLine();
}
  public void output()
{
  System.out.println("\nTittle " + tittle);
  System.out.println("\nAothor " + author);
  System.out.println("\nPublisher " + publisher );
  System.out.println("\nYear Published " + year_published);
}
  public static void main (String args [])
{ 
  Book book1 = new Book();

  System.out.println("\n****Data Entry****");
  System.out.println("----------------------------");
  book1.data_in();

  System.out.println("\n****Data Analysis****");
  System.out.println("----------------------------");
  book1.output();
 }
}