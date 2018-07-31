import java.util.*;
import java.lang.*;


public class ArrayTest {

	public static void main(String[] args) {
		ArrayListInt pedja = new ArrayListInt(5);
		
		System.out.println("size:" + pedja.size());
		pedja.add(12);
		pedja.add(13);
		pedja.add(14);
		
		System.out.println(pedja.toString());
		
		pedja.add(15);
		pedja.add(16);
		pedja.add(17);
		
		System.out.println(pedja.toString());
		System.out.println("size:" + pedja.size());
		
		System.out.println(pedja.get(2));
		pedja.set(2,22);
		System.out.println(pedja.get(2));
		
		pedja.addAt(11,33);
		System.out.println(pedja.toString());
		
		pedja.remove(11);
		pedja.addAt(7,7);
		System.out.println(pedja.toString());
		System.out.println(pedja.size());

	}

}
