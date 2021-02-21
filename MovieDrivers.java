package Movie;

import java.util.Scanner;

public class MovieDriverstask2 {

	public static void main(String[] args) {
		
		//scanner method
		try (Scanner keyboard = new Scanner(System.in)) {
			    System.out.println("Enter the name of a movie");//title of movie
			    String movieTitle = keyboard.nextLine();
			    System.out.println("Enter the rating of the movie");//movie rating
			    String rating = keyboard.nextLine();
			    System.out.println("Enter the number of tickets sold for this movie");//num of tickets sold
			    int ticketsSold = keyboard.nextInt(); keyboard.nextLine();
			    Movie theMovie = new Movie(movieTitle,rating,ticketsSold);
			    System.out.println(theMovie);
		        System.out.println("Goodbye");

			}
		}

    }

