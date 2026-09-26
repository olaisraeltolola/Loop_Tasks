public class NumbersDivisibleBySevenCount{
	public static void main(String[] args){

int count = 0;

for (int numbers = 1; numbers <= 100; numbers++){
	if (numbers % 7 == 0)
	count ++;

}
System.out.println(count);

}

}