const input = require("prompt-sync")()

const word = input("Enter a word: ")
let count = 0

for (let letter of word){
	if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
		count++
}
console.log(count)