#include<iostream>
using namespace std;
int main()
{
  int a;
  std::cin>>a;
  if(a%400==0)
    std::cout<<"Vicky can celebrate his birthday.";
  else if(a%100==0)
    std::cout<<"Vicky can't celebrate.";
  else if(a%4==0)
    std::cout<<"Vicky can celebrate his birthday.";
  else
    std::cout<<"Vicky can't celebrate.";
}