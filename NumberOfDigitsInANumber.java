import java.util.Scanner;
public class NumberOfDigitsInANumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
String number = input.next();

int count = 0;

int lengthOfNumber = number.length();

for (int index = 0; index <= (lengthOfNumber - 1); index++){
char digit = number.charAt(index);

if (Character.isDigit(digit))
count++;
}

System.out.println(count);

}
}