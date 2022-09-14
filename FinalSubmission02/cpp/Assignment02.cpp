#include <iostream>

int main() {
    int num1, num2; // Declaration of variable
    std::cout<<"Please enter number 1: "; // Printing on terminal
    std::cin>>num1; // User input   
    std::cout<<"Please enter number 2: "; // Printing on terminal
    std::cin>>num2; // User input   
    //Conditional Statements
    if(num1>num2){
        std::cout<<"The greatest number is "<<num1;
        }
        else if(num1<num2){
        std::cout<<"The greatest number is "<<num2;
        }
    else
        std::cout<<"Both numbers are equal";
return 0;
}
