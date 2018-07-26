import java.util.*;
import java.lang.*;

public class Crypto{
	public static void main(String[] args){
		System.out.println();
		String pedja = "(Pedja je kralj. Jeste!!!??;;!!,,...;;\")";
		String newPedja = new String();
		newPedja = encrypString(pedja, 5, 4);
		pedja  = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse magna leo, ullamcorper quis pharetra laoreet, aliquet at leo. Fusce dictum velit ac blandit fringilla. Quisque volutpat libero eget eros lacinia varius. Cras nec tincidunt odio. Quisque viverra aliquam nunc at egestas. Duis ultrices augue eget quam luctus, sit amet molestie orci fermentum. Aliquam bibendum tempor libero, non posuere ante finibus id. Nulla facilisi. Vivamus a purus dolor.Nam vulputate tristique velit vel ullamcorper. Ut mi neque, ornare ac euismod vitae, iaculis sollicitudin felis. Vestibulum laoreet tortor eu lacus elementum cursus. Sed tempor congue lectus non auctor. In hac habitasse platea. ";
		newPedja = encrypString(pedja, 5, 4);
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

	private static String encrypString(String text, int key, int group){
		String newText = new String();

		newText = normalizeText(text);
		System.out.println("After Normalizing...");
		System.out.println(newText);
		text = caesarify(newText, key);
		System.out.println("After caeserfy...");
		System.out.println(text);
		newText = groupify(text, group);
		System.out.println("After groupify...");
		System.out.println(newText);

		return newText;
	}
}