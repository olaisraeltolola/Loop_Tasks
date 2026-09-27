word = input("Enter a word: ")

lower_case = ""

for letter in (word):
	if letter.isupper():
		lower_case += letter.lower()
	else:
		lower_case += letter
	
print(lower_case)		