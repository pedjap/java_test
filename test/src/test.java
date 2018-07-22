import java.util.Scanner;

/*
	Author: Predrag Petkovic
	Аутор: Предраг Петковић
*/

public class test {
    public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
			System.out.println("Ја сам геније за програмирање");
		}
		pedja();

		pedja();
		pedja();

		int a = 10;
		int b = 20;
		double aSq = Math.pow(a, 2);
		double bSq = Math.pow(b, 2);
		double c = Math.sqrt(aSq + bSq);

		System.out.print("c = " + c);
	}


	private static void pedja(){
		for(int i = 0; i < 10; i++){
			System.out.println("Ја могу све!!!");
		}
	}

	private static void sentance(String she,String who,String whom){
		System.out.println(who + " and " + whom + " like " + she);
	}

	private static void PrintStrings(String text, int numOfTimes){

		for(int i = 0; i < numOfTimes; i++){
			System.out.print(text);
		}
	}
}
/* Predrag Petkovic je genije za programiranje */
/* Предраг Петковић је геније за програмирање */
/**Predrag Je Kralj */