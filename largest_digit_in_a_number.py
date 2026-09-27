number = input("Enter a number: ")
largest_digit = '0'

for digits in (number):
	if digits.isdigit():
		if digits > largest_digit:
			largest_digit = digits

print(largest_digit)