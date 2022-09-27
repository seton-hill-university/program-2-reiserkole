//Project: Program 2
//Name:    Kole Reiser 
//Date:    September 26 2022
//Version: 1.0
//Desc:    Ask for user input and then modify them.

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Allows user to type in their own data
		Scanner keyboard = new Scanner(System.in);
		
		// Explains what is going on
		System.out.println("List the first of the three numbers");
		int numberOne =keyboard.nextInt();
		
		System.out.println("List the second of the three numbers");
		int numberTwo =keyboard.nextInt();
		
		System.out.println("List the last of the three numbers");
		int numberThree =keyboard.nextInt();
		
		
		
		System.out.println("Operation Menu");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("5. Exit Menu");
		
		System.out.println("Select menu option 1-5");
		
		// Placeholder to ask for user input later
		int menuChoice =keyboard.nextInt();
		
		int result = 0;
		
		
		
		switch(menuChoice){
		case 1:
			result = numberOne + numberTwo;
			System.out.println("The sum of your numbers is: " + result);
			break;
		case 2:
			result = numberOne - numberTwo;
			System.out.println("The difference of your numbers is: " + result);
			break;
		case 3:
			double numberTwoRound = numberTwo;
			double resultDiv = numberOne / numberTwoRound;
			if(numberTwo==0) {
				System.out.println("Cannot divide by 0");
				break;
			}else {
				System.out.println("The result of your numbers is: " + resultDiv);
				break;
			}
		
		case 4:
			result = numberOne * numberTwo;
			System.out.println("The product of your numbers is: " + result);
			break;
		default:
			break;
		}
		
		
		
		// Explains what is going on
		if(result>numberThree) {
			System.out.println("The result of number one and number two: " + result + " is greater than: " + numberThree);
		}else {
			if(result<numberThree) {
				System.out.println("The result of number one and number two: " + result + " is less than: " + numberThree);
			}else {
				System.out.println("The result of number one and number two: " + result + " is equal to: " + numberThree);
			}
		}
		
		

	}

}
