package Movie;

import java.util.Scanner;

public class MovieDrivers{
   public static void main(String[] args) {
	   
	   //scanner method
	   try (Scanner keyboard = new Scanner(System.in)) {
		
		   String repeat = "y";
		//ignore the lower/uppercase
		while (repeat.equalsIgnoreCase("y"))
		   {
               
			  //title of the movie
		      System.out.println("Enter the name of a movie");
		      String movieTitle = keyboard.nextLine();
		       
		      //rating of the movie
		      System.out.println("Enter the rating of the movie");
		      String rating = keyboard.nextLine();
		       
		      //num of tickets sold 
		      System.out.println("Enter the number of tickets sold for this movie");
		      int ticketsSold = keyboard.nextInt();

		      Movie theMovie = new Movie(movieTitle,rating,ticketsSold);
		      System.out.println(theMovie);
              System.out.println("Do you want to enter another? (y or n)");
              repeat = keyboard.nextLine();

              //repeats if yes.
              repeat = keyboard.nextLine();
		   }
	}

      System.out.println("Goodbye");
   }
}
   
     