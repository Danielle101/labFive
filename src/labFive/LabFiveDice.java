//Author: Danielle Hall
//Description: This app simulates a dice rolling game
package labFive;
import java.util.*;
public class LabFiveDice {
static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
//welcome the user to the game and ask if they would like to play
		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (y/n) :");
		String choice2 = Validator.getString("Roll the dice? (y/n) :");
				while (choice2.equalsIgnoreCase("y"))
				{	
//if the user inputs "y" then ask how many faces they'd like on their dice
		System.out.println("Please enter how many faces you'd like on your dice:");
//turn the number input from the user into an integer
		int diceNumber = Validator.readValidInt();
		Random random1 = new Random ();
// generate the random number for dieOne and dieTwo using the dieUno method by using the formula random1.nextInt(diceNumber)+1; 
		int dieOne = dieUno(diceNumber, random1);
		int dieTwo = dieUno(diceNumber, random1);
//calculate the sum of dieOne and dieTwo. if the user rolls two ones then a message saying "You rolled Snake Eyes!" will appear
				int addRandoms = dieOne + dieTwo;
				if (addRandoms <= 2){
					System.out.println ("Roll 1: ");
					System.out.println (dieOne); 
					System.out.println (dieTwo);
					System.out.println ("You rolled Snake Eyes!");
					System.out.println("Roll again? (y/n)");
					choice2 = sc.nextLine();
				}
//if the user does not rolls two ones then a message displaying the two numbers they rolled will appear
				else {System.out.println ("Roll 1: ");}
				System.out.println (dieOne); 
				System.out.println (dieTwo);
				choice2 = Validator.getString("Roll again? (y/n)");
				}
//if the user does not want to play the game at all or does not want to play again display "Bye!".
				System.out.println("Bye!");
		}
	/**
	 * @param diceNumber
	 * @param random1
	 * @return
	 * dieUno includes the formula to generate the random rolled number using the diceNumber the user inputs and the random1 generator
	 */
	public static int dieUno(int diceNumber, Random random1) {
		int dieOne = random1.nextInt(diceNumber)+1;
		return dieOne;
	}
				}
				
				
		

		
		
				

