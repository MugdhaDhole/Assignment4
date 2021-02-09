package encapsulationAndInheritance;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		
		System.out.println("Enter the Book Details");
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		System.out.print("Enter the Book Number : ");
		int bookno = sc.nextInt();
		System.out.print("Enter the Book Title : ");
		String title = sc.next();
		System.out.print("Enter the Book Author : ");
		String author=sc.next();
		System.out.print("Enter the Book Price : ");
		float price=sc.nextFloat();
		
		book.setBookno(bookno);		
		book.setTitle(title);		
		book.setAuthor(author);		
		book.setPrice(price);
		
		EngineeringBook engineeringBook=new EngineeringBook();
		System.out.print("Enter the Book Category : ");
		String category=sc.next();
		engineeringBook.setCategory(category);
		
		System.out.println("Book Details : ");
		System.out.println("Book Number : "+book.getBookno());
		System.out.println("Book Title : "+book.getTitle());
		System.out.println("Book Author : "+book.getAuthor());
		System.out.println("Book Price : "+book.getPrice());
		System.out.println("Book Category : "+engineeringBook.getCategory());
		sc.close();
	}

}
