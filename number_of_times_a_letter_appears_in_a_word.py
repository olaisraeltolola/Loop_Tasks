word = input("Enter a word: ")
count = 0

for letters in (word):
	if letters == "e":
		count += 1

print(count)