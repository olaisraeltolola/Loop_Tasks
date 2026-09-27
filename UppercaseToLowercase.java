import java.util.Scanner;
public class UppercaseToLowercase {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a word");
String word = input.nextLine();

int lengthOfWord = word.length();
String lowercase = "";

for (int index = 0; index <= (lengthOfWord - 1); index++){
char letter = word.charAt(index);

if (Character.isUpperCase(letter))
lowercase += Character.toLowerCase(letter);

else
lowercase += letter;

}
System.out.println(lowercase);

}

}