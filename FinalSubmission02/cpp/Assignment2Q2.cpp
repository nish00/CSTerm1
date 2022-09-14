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
        std::cout<<"Number 1 is greater than number 2 and number 3";
    }
    else if(num2>num1&&num2>num3){
        std::cout<<"Number 2 is greater than number 1 and number 3";
    }
    else if(num3>num1&&num3>num2){
        std::cout<<"Number 3 is greater than number 1 and number 2";
    }
    else
        std::cout<<"All three numbers are equal";

//return of 0 value as there is no error
return 0;
}