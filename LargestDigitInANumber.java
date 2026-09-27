import java.util.Scanner;
public class LargestDigitInANumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
String number = input.next();

int largestDigit = 0;

int lengthOfNumber = number.length();

for (int index = 0; index <= (lengthOfNumber - 1); index++){
char digit = number.charAt(index);

if (Character.isDigit(digit)){
	if (digit > largestDigit)
		largestDigit = (digit - '0');
}
}

System.out.println(largestDigit);

}
}