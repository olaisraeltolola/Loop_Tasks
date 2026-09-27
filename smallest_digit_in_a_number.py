number = input("Enter a number: ")
smallest_digit = number[0]

for digits in (number):
	if digits.isdigit():
		if digits < smallest_digit:
			smallest_digit = digits

print(smallest_digit)