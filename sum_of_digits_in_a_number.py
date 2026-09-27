number = input("Enter a number: ")
sum_of_digits = 0

for digits in (number):
	if digits.isdigit():
		sum_of_digits += int(digits)

print(sum_of_digits)