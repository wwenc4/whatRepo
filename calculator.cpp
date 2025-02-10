#include <iostream>
using namespace std;

int main(){
    int num1, num2;
    int operation;

    cout << "Enter first number: ";
    cin >> num1;

    cout << "Enter second number: ";
    cin >> num2;

    cout << "What operation? (1 - Addition (+), 2 - Subtraction (-), 3 - Multiplication (x), 4 - Division (/), 5 - Modulo(%)): ";
    cin >> operation;

    switch(operation){
        case '1':
            cout << "Result: " << num1 + num2 << endl;
            break;
        case '2':
            cout << "Result: " << num1 - num2 << endl;
            break;
        case '3':
            cout << "Result: " << num1 * num2 << endl;
            break;
        case '4':
            cout << "Result: " << num1 / num2 << endl;
            break;
        case '5':
            cout << "Result: " << num1 % num2 << endl;
            break;
        default:
            cout << "Invalid operation" << endl;
    }   
    return 0;
}
