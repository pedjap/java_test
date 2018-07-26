import java.util.*;
import java.lang.*;


// Predrag Petkovic


public class Crypto{
	public static void main(String[] args){
		
	}


	private static String normalizeText(String text){
		String newText = new String();		
		int length = text.length();
		int ch;

		for(int i = 0; i < length; i++){
			ch = text.charAt(i);
			if(ch  == 33 || ch == 32 || ch == 34 || ch == 39 || ch == 40 || ch == 41 || ch == 44 || ch == 46 || ch == 58 || ch == 59 || ch == 63 || ch == 96){
				continue;
			}else{
				newText += text.charAt(i);
			}

			 newText = newText.toUpperCase();
		}

		return newText;
	}

	private static String caesarify(String text, int key){
		String newText = new String();
		int length = text.length();

		while(key > 26){
			key -= 26;
		}
		for(int i = 0; i < length; i++){
			if(text.charAt(i) + key > 'Z'){
				newText += Character.toString((char)(text.charAt(i) - 26 + key));
			}else{
			newText += Character.toString((char)(text.charAt(i) + key));
			}
		}
		return newText;
	}
	
	private static String groupify(String text, int numOfLetters){
		String newText = new String();
		int count = 0;
		int length = text.length();

		for(int i = 0; i < length; i++){
			if(count == numOfLetters){
				count = 0;
				newText += " ";
			}
			newText += Character.toString(text.charAt(i));
			count++;
		}

		if(count < numOfLetters){
			while(count != numOfLetters){
				count++;
				newText += "x";		
			}			
		}
		return newText;
	}

	private static String encryptString(String text, int key, int group){
		String newText = new String();

		newText = normalizeText(text);
		newText = caesarify(newText, key);
		newText = groupify(newText, group);

		return newText;
	}
}