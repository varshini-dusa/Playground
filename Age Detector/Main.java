#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  if(a>b)
    cout<<(2000+b - 1900-a);
  else
    cout<<(b-a);
}