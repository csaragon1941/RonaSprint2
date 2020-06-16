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
		
		MadQuiz1 MadObject = new MadQuiz1(); 
		MadObject.lib1(); 
		
		
		System.out.println();
		plant plant1 = new plant();
		plant plant2 = new plant();
		
		System.out.println(plant1.getTypePlant());
		plant1.setTypePlant("Sunflower");
		System.out.println(plant1.getTypePlant());
		System.out.println(plant2.getTypePlant());
		System.out.println();
		
		System.out.println(); 
// PRESS ANY KEY TO CONINTUE SECTION	
				System.out.println("Comparing two strings together");
				System.out.println();
				Scanner keyboardInput1 = new Scanner(System.in); 
				System.out.print("Press Anykey to continue"); 
				String intro2 = keyboardInput1.nextLine();
				System.out.println(); 
		// Comparing two string together
				String spongebob = "yellow and square" ; 
				String gary = "snail"; 
				System.out.println(); 
				
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
					System.out.println(); 
					
					
					
						double first_num, second_num, answer;
					// beginnersbook.com
								first_num = 10;
								second_num = 20;
								answer =first_num+ second_num;
								System.out.println("Double Variable Exmaple Output: "
												+ "Sum of Num = " + answer + "\n"
												+ "                   ");
								System.out.println(); 
								
								final int digit;
								digit = 10;
					// The variable final means that the value stored inside a variable cannot be changed later
								System.out.println("Int. Exmaple Output: "
												+ " = " + digit + "\n"
											+ "                   ");
								
								System.out.println(); 
								Ray rayObject = new Ray(); 
								rayObject.array(); 
								System.out.println(); 
								
								System.out.println("Come Back Again");
							
				} 	while(!readyPlay);
				
	}

	
			
	
		

			
		

	private static Object assertThat(boolean contentEquals) {
		// TODO Auto-generated method stub
		return null;
	}
	}


// Operator precedence is the order that the operator goes first in the expression

// Sprint 1
// What is Variable?
// In programing a value is a part of the program that can change depending on 
//its condition or on info passed to the program
// What is the term Scope?
// A scope refers to the visibility of variables
