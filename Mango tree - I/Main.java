#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if((c>=1&&c<=b)||((c-1)%b==0)||(c%b==0))
    cout<<"Yes";
  else
    cout<<"No";
}