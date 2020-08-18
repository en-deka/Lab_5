import java.util.*;
import java.io.*;

public class UserStrings {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Let's talk about your book. What would you like to add today?");

		Scanner book = new Scanner(System.in);
		String string = book.nextLine();
		if (string.equals("DONE")) {
			System.exit(0);
		} else {

			PrintWriter output = new PrintWriter(string);
			output.println(book);
			new Scanner(System.in);
			System.out.println("Great job today. Your output file has been created.");
			output.close();
		}
	}
		
	}




