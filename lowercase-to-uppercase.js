const input = require("prompt-sync")()

const word = input("Enter a word: ")
let uppercaseWord = ""

for (let letter of word){
	if (letter.isUpperCase)
		uppercaseWord += letter

	else
		uppercaseWord += letter.toUpperCase()
}
console.log(uppercaseWord)