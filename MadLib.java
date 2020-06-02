import java.util.Scanner;

public class MadLib {
	public void trivia() {
		System.out.println("AREE YOUUU READYYY TO RUMBLEEEE!");
		
		boolean readyPlay = true;
				
		if(readyPlay) {
			
			Scanner keyboardInput = new Scanner(System.in);
// Mad Lib Prompt Idea (pghpaper.com)		
			System.out.print("Enter the name of a person: ");
			String person = keyboardInput.nextLine();
		
			System.out.print("Enter an action (present tense): ");
			String action = keyboardInput.nextLine();
		
			System.out.print("Enter something that Prof. Vanselow would do (-ing): ");
			String wwpvd = keyboardInput.nextLine();
			// wwpvd = What would Prof Vanselow do
			
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
			
			

			System.out.println("The coronavirus has taken a toll on everyone, especially " + person + "\n"
						+ "President Martin has asked students to " + action + "\n"
						+ "That didn't stop Professor Vanselow from " + wwpvd + "\n"
						+ "Professor Vanselow seems like a neat guy, he has {numPlats} in his garden"
						+ "He definetly has {difPlant} different plants");
		}
	}
	
}

		