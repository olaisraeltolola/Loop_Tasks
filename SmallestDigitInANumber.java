import java.util.Scanner;
public class SmallestDigitInANumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
String number = input.next();

int smallestDigit = (number.charAt(0));

int lengthOfNumber = number.length();

for (int index = 0; index <= (lengthOfNumber - 1); index++){
char digit = number.charAt(index);

if (Character.isDigit(digit)){
	if ((digit - '0') < smallestDigit)
		smallestDigit = (digit - '0');
}
}

System.out.println(smallestDigit);

}
}