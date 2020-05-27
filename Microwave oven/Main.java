#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t;
  cin>>n>>t;
  if(n==1)
    cout<<t;
  else if(n==2)
    cout<<(t+0.5*t);
  else if(n==3)
    cout<<(2*t);
  else
    cout<<"Number of items is more";
}