import java.util.Scanner;
public class NumberOfVowelsInAWord {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a word");
String word = input.nextLine();

int count = 0;
int lengthOfWord = word.length();

for (int index = 0; index <= (lengthOfWord - 1); index++){
char letter = word.charAt(index);

if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
count++;

}
System.out.println(count);
}
}