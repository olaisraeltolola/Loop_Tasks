const input = require("prompt-sync")()

const word = input("Enter a word: ")
let lowercaseWord = ""

for (let letter of word){
	if (letter.isLowerCase)
		lowercaseWord += letter

	else
		lowercaseWord += letter.toLowerCase()
}
console.log(lowercaseWord)