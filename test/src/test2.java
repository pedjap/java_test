import java.util.*;
import java.lang.*;


public class test2{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String text = new String();

	System.out.println("Hello World!!!");
	System.out.println(sum(10,23));
	
	text = input.nextLine();
	System.out.println(text);
    }

    // test method
    private static int sum(int a, int b){
	return a+b;
    }
}

