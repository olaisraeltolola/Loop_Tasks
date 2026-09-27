import java.util.Scanner;
public class LowercaseToUppercase {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a word");
String word = input.nextLine();

int lengthOfWord = word.length();
String uppercase = "";

for (int index = 0; index <= (lengthOfWord - 1); index++){
char letter = word.charAt(index);

if (Character.isLowerCase(letter))
uppercase += Character.toUpperCase(letter);

else
uppercase += letter;

}
System.out.println(uppercase);

}

}