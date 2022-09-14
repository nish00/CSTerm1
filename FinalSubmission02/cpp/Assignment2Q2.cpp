//importing input and output class
#include<iostream>

//Declarating of main class
int main(){
    //Declaration of num integers
    int num1,num2,num3;
    
    //Prompt on terminal
    std::cout<<"Please enter number 1: ";
    //Input from user
    std::cin>>num1;
    //Prompt on terminal
    std::cout<<"Please enter number 2: ";
    //Input from user
    std::cin>>num2;
    //Prompt on terminal
    std::cout<<"Please enter number 3: ";
    //Input from user
    std::cin>>num3;

    //Selection statement or conditional statements
    if(num1>num2&&num1>num3){
        std::cout<<"The greatest number is "<<num1;
    }
    else if(num2>num1&&num2>num3){
        std::cout<<"The greatest number is "<<num2;
    }
    else if(num3>num1&&num3>num2){
        std::cout<<"The greatest number is "<<num3;
    }
    else
        std::cout<<"Both numbers have the same value";

//return of 0 value as there is no error
return 0;
}