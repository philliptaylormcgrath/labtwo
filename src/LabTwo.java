
// Perimeter = sum of the sides of the shape
// Area = Length * Width
// Volume = L * W * H

import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Would you like to measure a room? Please input 'yes' or 'no': ");

		String userCont = scan.nextLine();

		while (userCont.equals("yes")) {

			System.out.println("Please enter the width of the room: ");

			double width = scan.nextInt();

			System.out.println("Please enter length of room: ");

			double length = scan.nextInt();

			Scanner inputThree = new Scanner(System.in);

			System.out.println("Please enter the height of the room: ");

			double height = scan.nextInt();

			System.out.println("The area of the room is: " + width * length);
			System.out.println("The perimeter of the room is: " + ((length * 2) + (width * 2)));
			System.out.println("The volume of the room is: " + width * length * height);

			scan.nextLine();

			System.out.println("Would you like to measure a room? Please input 'yes' or 'no': ");

			userCont = scan.nextLine();

		}
		
		if (userCont.contentEquals("no")) {
			System.out.println("Have a wonderful day!");
		}
	}
}