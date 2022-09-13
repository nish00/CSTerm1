#include <iostream>

int main() {
    int num1, num2; // Declaration of variable
    std::cout<<"Please enter number 1: "; // Printing on terminal
    std::cin>>num1; // User input   
    std::cout<<"Please enter number 2: "; // Printing on terminal
    std::cin>>num2; // User input   
    //Conditional Statements
    if(num1>num2){
        std::cout<<"Number 1 is the greater number.";
        }
        else if(num1<num2){
        std::cout<<"Number 2 is the greater number.";
        }
    else
        std::cout<<"Number 1 and Number 2 are equals.";
return 0;
}
