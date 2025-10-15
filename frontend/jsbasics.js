// ===============================================
// 🌟 JavaScript Basics: Variables, Operators, Loops
// ===============================================

// ----- 🧩 VARIABLES -----
// Variables store data. JS uses `let`, `const`, and `var`.

// let → can change value later
let name = "Mosin";

// const → cannot change (constant)
const age = 25;

// var → old version (avoid in modern JS)
var city = "Chennai";

console.log("Name:", name);
console.log("Age:", age);
console.log("City:", city);

// Change value of 'let' variable
name = "Abdul Mosin";
console.log("Updated Name:", name);

// -----------------------------------------------
// ⚙️ OPERATORS
// -----------------------------------------------

// Arithmetic Operators (+, -, *, /, %, **)
let a = 10, b = 3;

console.log("\n--- Arithmetic Operators ---");
console.log("a + b =", a + b);  // addition
console.log("a - b =", a - b);  // subtraction
console.log("a * b =", a * b);  // multiplication
console.log("a / b =", a / b);  // division
console.log("a % b =", a % b);  // remainder
console.log("a ** b =", a ** b); // exponent (a to the power b)

// Assignment Operators (=, +=, -=, etc.)
let num = 5;
num += 3; // num = num + 3
console.log("\n--- Assignment Operator ---");
console.log("num =", num);

// Comparison Operators (>, <, >=, <=, ==, ===)
console.log("\n--- Comparison Operators ---");
console.log("a > b:", a > b);
console.log("a < b:", a < b);
console.log("a >= b:", a >= b);
console.log("a <= b:", a <= b);
console.log("a == b:", a == b);   // compares value
console.log("a === b:", a === b); // compares value + type

// Logical Operators (&&, ||, !)
let x = true, y = false;
console.log("\n--- Logical Operators ---");
console.log("x && y =", x && y);  // AND
console.log("x || y =", x || y);  // OR
console.log("!x =", !x);          // NOT

// String Operators (+, +=)
let firstName = "Abdul";
let lastName = "Mosin";
let fullName = firstName + " " + lastName;
console.log("\n--- String Operator ---");
console.log("Full Name:", fullName);

// -----------------------------------------------
// 🔁 LOOPS
// -----------------------------------------------

// for loop
console.log("\n--- for loop ---");
for (let i = 1; i <= 5; i++) {
  console.log("Number:", i);
}

// while loop
console.log("\n--- while loop ---");
let i = 1;
while (i <= 5) {
  console.log("Count:", i);
  i++;
}

// do...while loop
console.log("\n--- do...while loop ---");
let j = 1;
do {
  console.log("Value:", j);
  j++;
} while (j <= 5);

// for...of loop (used with arrays)
console.log("\n--- for...of loop ---");
let fruits = ["apple", "banana", "cherry"];
for (let fruit of fruits) {
  console.log(fruit);
}

// for...in loop (used with objects)
console.log("\n--- for...in loop ---");
let user = { name: "Mosin", age: 25, city: "Chennai" };
for (let key in user) {
  console.log(key + ":", user[key]);
}

// -----------------------------------------------
// 💡 Practice Example: Sum of numbers
// -----------------------------------------------
console.log("\n--- Sum of 1 to 10 ---");
let sum = 0;
for (let n = 1; n <= 10; n++) {
  sum += n; // same as sum = sum + n
}
console.log("Total Sum:", sum);

// -----------------------------------------------
// ✅ END OF FILE code need
// -----------------------------------------------
