import java.util.Scanner;
public class PrintCharactersInAWord{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a word");
String word = input.next();

int lengthOfWord = 0;
lengthOfWord = word.length();

for (int index = 0; index <= (lengthOfWord - 1); index++){
char letter = word.charAt(index);
System.out.println(letter);
}

}
}
