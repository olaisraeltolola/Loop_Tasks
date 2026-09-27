word = input("Enter a word: ")
count = 0

for letters in (word):
	if letters == 'a' or letters == 'e' or letters == 'i' or letters == 'o' or letters == 'u' or letters == 'A' or letters == 'E' or letters == 'I' or letters == 'O' or letters == 'U':
		count += 1

print(count)