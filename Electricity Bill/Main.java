#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  std::cin>>a;
  if(a<=200)
    std::cout<<"Rs."<<int(0.5*a);
  else if(a>200&&a<=400)
    std::cout<<"Rs."<<(0.65*a+100);
  else if(a>400&&a<=600)
    std::cout<<"Rs."<<(0.80*a+200);
  else
    std::cout<<"Rs."<<(1.25*a+425);
}