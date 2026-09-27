const input = require("prompt-sync")()
let number = Number(input("Enter a number: "))

for (let count = 1; count <= 12; count++){
console.log(number + " x " + count + " = " + (number * count))
}