number = input("Enter a number: ")
count = 0

for digits in (number):
	if digits.isdigit():
		count += 1

print(count)