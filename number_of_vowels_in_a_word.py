word = input("Enter a word: ")
count = 0

for letters in (word):
	if letters == 'a' or letters == 'e' or letters == 'i' or letters == 'o' or letters == 'u':
		count += 1

print(count)