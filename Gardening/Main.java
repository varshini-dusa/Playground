#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c;
  if(c>a&&c<=(2*a))
    std::cout<<"It is a mango tree";
  else if(c>a*(b-2)&&c<=a*(b-1))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}