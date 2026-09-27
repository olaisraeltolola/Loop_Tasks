word = input("Enter a word: ")

upper_case = ""

for letter in (word):
	if letter.islower():
		upper_case += letter.upper()
	else:
		upper_case += letter
	
print(upper_case)		