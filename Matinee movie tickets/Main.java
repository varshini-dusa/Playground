#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  string b;
  cin>>a>>b;
   if(b=="13.30")
   {
     if(a>13)
       cout<<"$5.00";
     else
       cout<<"$2.00";
   }
  else
  {
    if(a>13)
      cout<<"$8.00";
    else
      cout<<"$4.00";
  }
}