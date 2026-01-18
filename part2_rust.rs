fn main() {
    let vec = vec![1, 2, 3, 4, 5]; // heap allocation
    print_sum(&vec);               // borrow vec without taking ownership
} // vec goes out of scope here, and memory is automatically freed
 
fn print_sum(numbers: &Vec<i32>) {
    let sum: i32 = numbers.iter().sum();
    println!("Sum: {}", sum);
}
