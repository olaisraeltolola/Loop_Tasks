import java.util.Scanner;
public class NumberOfTimesALetterAppearsInAWord {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a word");
String word = input.next();

int lengthOfWord = word.length();
int count = 0;

for (int index = 0; index <= (lengthOfWord - 1); index++){
char letter = word.charAt(index);

if (letter == 'e')
count++;
}
System.out.println(count);

}
}
