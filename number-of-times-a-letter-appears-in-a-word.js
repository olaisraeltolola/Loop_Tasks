const input = require("prompt-sync")()

const word = input("Enter a word: ")
let count = 0

for (let letter of word){
	if (letter == 'e')
		count++
}
console.log(count)