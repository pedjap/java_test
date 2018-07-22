import java.util.Scanner;

public class LongestName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        longestName(input,5);
    }

    public static void longestName(Scanner console, int numOfNames) {

        String[] names = new String[numOfNames];
        String longest = " ";
        String temp = " ";
        int longestPos = 0;

        boolean tie = false;

        for (int i = 0; i < numOfNames; i++) {
            System.out.print("name #"+ (i+1) +"? ");
            names[i] = console.next();

        }

        longest = names[0];

        for(int i = 0; i < numOfNames; i++) {
            if(longest.length() < names[i].length()){
                longest = names[i];
                longestPos = i;
            }
        }

        for(int i = 0; i < numOfNames; i++) {
            if(i == longestPos ){
                continue;
            }
            else if(longest.length() == names[i].length()){
                tie = true;
            }
        }


        longest = longest.toLowerCase();
        temp = longest.substring(0,1);
        temp = temp.toUpperCase();
        temp += longest.substring(1);

        System.out.println(temp + "\'s name is longest");
        if(tie){
            System.out.println("(There was a tie!)");
        }
    }
}
