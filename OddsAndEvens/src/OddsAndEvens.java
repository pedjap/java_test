import java.util.*;

public class OddsAndEvens{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int  computer;
		int fingers;
		int sum;

		String name = "\0";
		String answer = "\0";
		

		Seperate();
		System.out.println("Let's play a game called \"Odds and Evens\"");
		System.out.print("What is your name? ");
		name = input.nextLine();
		System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
		answer = input.nextLine();

		if(answer.equals("O") || answer.equals("o")){
			System.out.println(name + " has picked odds! Computer will be evens.");
		}
		else if(answer.equals("E") || answer.equals("e")){
			System.out.println(name + " has picked even! Computer will be odds.");	
		}
		else{
			System.out.println("Wrong " +"(" +answer+")" + " option.\nOnly O or E.");
		}
		//System.out.println(answer);
		Seperate();

		System.out.print("How many \"fingers\" do you put out? ");
		fingers = input.nextInt();
		computer = rand.nextInt(6);
		System.out.println("The computer plays " + computer + " \"fingers\".\n");
		Seperate();

		sum = fingers + computer;
		boolean oddOrEven = sum % 2 == 0;
		System.out.println(fingers + " + " + computer + " = " + sum);

		if(oddOrEven){
			System.out.println(sum + " is ...Even!");
			if(answer.equals("e") || answer.equals("E")){
				System.out.println("That means " + name + " wins! :)");
			}
			else{
				System.out.println("That means Compuer wins! :)");
			}
		}
		else{
			
			System.out.println(sum + " is ...Odd!");
			if(answer.equals("O") || answer.equals("o")){
				System.out.println("That means " + name + " wins! :)");
			}
			else{
				System.out.println("That means Computer wins! :)");
			}
		}
		Seperate();

		input.close();
	}

	private static void Seperate(){
		String sparator = "--------------------------------------------------";
		System.out.println(sparator);
	}
}

/* Predrag Petkovic 2018 */