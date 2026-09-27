const input = require("prompt-sync")()

const word = input("Enter a word: ")

for (let letters of word){
	console.log(letters)
}
