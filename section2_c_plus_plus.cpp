#include <iostream>
using namespace std;
 
int main() {
    int x = 7;
    auto closure = [&x]() { 
        x += 59; 
        return x; 
    };
    
    cout << closure() << endl;  
    cout << closure() << endl;  
}
