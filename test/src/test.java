import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/*
	Author: Predrag Petkovic
	Аутор: Предраг Петковић
*/

public class test {
    public static void main(String[] args) {
	//	System.out.println(makeFancy("JAVA"));
	//	System.out.println(mystery5(1));
		System.out.println(puzzle(22, 11));
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

	// from 1 to range
	private static int RandomNumber(int range){
		double randDouble = 0;
		randDouble = Math.random() * range + 1;
		int randInt = (int)Math.round(randDouble);
		
		return randInt;
	}

	// recursive factoral method
	private static int factoral(int fact){

		if(fact == 1){
			return 1;
		}

		return fact * factoral(fact - 1);
	}

	// accepts a intgiger parameter and returns a string of stars (asterisks) 2n long (i.e., 2 to the nt
	private static String starString(int n){
		String star = "\0";
		int num = 1;
		
		if(n == 0){
			return "*";
		}
		else if(n < 0){
			throw new IllegalArgumentException();
		}

		for(int i = 0; i < n; i++){
			num *= 2;
		}

		for(int i = 0; i < num; i++){
			star += "*";
		}

		return star;
	}

	// recursive repeat string method
	private static String repeat(String text, int numOfTimes){
		
		String newText = new String(text);
		if(numOfTimes < 0){
			throw new IllegalArgumentException();
		}
		else if(numOfTimes == 0){
			return "";
		}
		else if(numOfTimes == 1){
			return newText;
		}
		
		return newText.concat(repeat(text,numOfTimes - 1));
	}

	// recursive numbers print 
	private static void writeNums(int n){
		if(n < 1){
			throw new IllegalArgumentException();
		}
		else if (n == 1){
			System.out.print(n);
		}
		else{
			writeNums(n - 1);
			System.out.print(", " + n);
		}
	}

	public static void mystery1(int n) {
 	   if (n <= 1) {
 	       System.out.print(n);
 	   } else {
 	       mystery1(n / 2);
 	       System.out.print(", " + n);
		}
	}

	public static void mystery3(int n) {
		if (n <= 0) {
			System.out.print("*");
		} else if (n % 2 == 0) {
			System.out.print("(");
			mystery3(n - 1);
			System.out.print(")");
		} else {
			System.out.print("[");
			mystery3(n - 1);
			System.out.print("]");
		}
	}

	private static int mystery5(int x){
		if(x == 5){
			return x;
		}else{
			return mystery5(x--) * 5;
		}
	}

	public static void print(int n) {
		if (n == 1) {
			System.out.print("< bc >");
		} else {
			System.out.print("p(" + n + ") -> ");
			print(n-1);
		}
	}

	public static void mystery(String foo, String bar, String zazz) {
        System.out.println(zazz + " and " + foo + " like " + bar);
	}
	
	private static int smallest(int a, int b, int c){
		return Math.min(Math.min(a,b),c);
	}

	private static int lastDigit(int num){
		return (int)Math.abs(num % 10);
	}

	public static String makeFancy(String s) {
		if (s.length() == 0) {
			return "*";
		}
		return "*" + s.substring(0,1) + makeFancy(s.substring(0, s.length()-1));
	}

	public static int puzzle(int i, int j) {
		if (i == j) {
			return 0;
		} else {
			return 1 + puzzle(i - 2, j - 1);
		}
	}

}
/* Predrag Petkovic je genije za programiranje */
/* Предраг Петковић је геније за програмирање */
/**Predrag Je Kralj */