// Christina Aragon
// Mad Libs: Carona Edition
// This is a project I am doing on Mad Libs and I want to somehow incorporate math into it
// Sprint 1

// In this program we are using Int, Boolean, String
// Boolean = There are no more than two type of values: True or False
//Int = Stores whole number integers, no decimals
// String = Stores text values and is surrounded by double quotation marks
// Source: w3schools.com
// Source: beginnersbook.com

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// This is a method and there is a header to the method
	
		Scanner keyboardInput = new Scanner(System.in); 
		System.out.print("I HOPE U AREE YOUUU READYYY TO RUMBLEEEE! Yes? No? "); 
		String intro = keyboardInput.nextLine();
		
		boolean readyPlay = true; 
	do {
		
		if(intro.equals("Yes")) {
			Scanner keyboardInput1 = new Scanner(System.in);
// Mad Lib Prompt Idea (pghpaper.com)		
			System.out.print("Enter the name of a person: ");
			String person = keyboardInput1.nextLine();
		
			System.out.print("Enter an action (present tense): ");
			String action = keyboardInput1.nextLine();
		
			System.out.print("Enter something that Prof. Vanselow would do (-ing): ");
			String wwpvd = keyboardInput1.nextLine();
			// wwpvd = What would Prof Vanselow do
			
			// For the equation in the system
			int a = 2;
			int b = 1;
			int c = 4;
			//NUMBER OF PLANTS
			int dice1 = 0;
			Random r1 = new Random();
			dice1 = r1.nextInt(10)+1;
			int numPlants= dice1 + (a + c - b) * b % a; 

			// TYPE OF PLANTS 
			double dice2 = 0;
			Random r2 = new Random();
			dice2 = r2.nextInt(10)+1;
			double numType= dice2 + (a + c - b) * b / a;
		
			System.out.println("The coronavirus has taken a toll on everyone, especially " + person + "\n"
						+ "President Martin has asked students to " + action + "\n"
						+ "That didn't stop Professor Vanselow from " + wwpvd + "\n"
						+ "Professor Vanselow seems like a neat guy, he has " + Math.abs(numPlants) + " in his garden "
						+ "and definetly has " + Math.abs(numType) + " different plants");
	
			String compare = numType>numPlants ? "He has more variety of plant" : "He has ALOT of the same Plant"; 
			System.out.println(compare);
				
			boolean diverse = numType > 6;
			
			while (diverse == true) {
				System.out.print("What a diverse plant guy \n");	
				break; // The break is to stop the loop from becoming an infinite loop and doesnt have a reason to go to the rest of the code
			}
			
			switch(numPlants) {
			case 1:
				System.out.println("Step up your plant game sir ");
			case 2:
				System.out.println("TWO JUST TWO ");
			case 3:
				System.out.println("Eh treat yourself with another plant " );
			case 4:
				System.out.println("Yee Yee Good Plants " );
			default:
				System.out.println("WE GOT OURSELF A PLANT OWENER " );
			
			}
			
		
			
			}		
		else {
				
				Scanner keyboardInput1 = new Scanner(System.in); 
				System.out.print("Press Anykey to continuef"); 
				String intro2 = keyboardInput1.nextLine();
		// Comparing two string together
				String spongebob = "yellow and square" ; 
				String gary = "snail"; 
				
				int var1 = spongebob.compareTo(gary);
				System.out.println("Spongebob & Gary comparison: " + var1);
			// == compares two object references and not what is in the string
				
				
				
		// For loops and other methods that I did not know how to integrate in my Mad Libs Yet			
					for(int y=1; y <10; y ++) {	
				// These are parameters up above ^^
						System.out.println("value of y: " + y + "\n");
						continue; // The continue loop skips to the next part of the loop
					}	
					for(int i=3; i <5; i --) {
						System.out.println("value of i: " + i + "\n");
						break;
					}
					
					int x = 0;
					int opp = (x += 53.6);
					// This is an Argument ^^
					System.out.println("The answer to += is: " + opp); 
					System.out.println("");
					int lit = 1; 
						
					
					
						double first_num, second_num, answer;
					// beginnersbook.com
								first_num = 10;
								second_num = 20;
								answer =first_num+ second_num;
								System.out.println("Double Variable Exmaple Output: "
												+ "Sum of Num = " + answer + "\n"
												+ "                   ");

								
								final int digit;
								digit = 10;
					// The variable final means that the value stored inside a variable cannot be changed later
								System.out.println("Int. Exmaple Output: "
												+ " = " + digit + "\n"
											+ "                   ");
				
					
								
								System.out.println("Come Back Again");
							
				}
				
			}
			
		while(!readyPlay);
		

			
		}

	private static Object assertThat(boolean contentEquals) {
		// TODO Auto-generated method stub
		return null;
	}
	}


// Operator precedence is the order that the operator goes first in the expression




// What is Variable
// In programing a value is a part of the program that can change depending on 
//its condition or on info passed to the program

// What is the term Scope?
// A scope refers to the visibility of variables
