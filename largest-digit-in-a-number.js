const input = require("prompt-sync")()

function isDigit(char){
return char >= '0' && char <= '9'
}

const number = input("Enter a number: ")
let largestDigit = 0

for (let digit of number){
	if (isDigit(digit)){
		if (digit > largestDigit)
		largestDigit = digit
	}
}
console.log(largestDigit)