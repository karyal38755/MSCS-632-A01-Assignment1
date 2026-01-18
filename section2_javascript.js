function outer() {
    let x = 7;
    return function inner() {
        x += 59;
        return x;
    }
}
 
const closureFunc = outer();
console.log(closureFunc());  
console.log(closureFunc());  
