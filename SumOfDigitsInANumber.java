import java.util.Scanner;
public class SumOfDigitsInANumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
String number = input.next();

int sum = 0;

int lengthOfNumber = number.length();

for (int index = 0; index <= (lengthOfNumber - 1); index++){
char digit = number.charAt(index);

if (Character.isDigit(digit))
sum += (digit - '0');

}

System.out.println(sum);

}
}