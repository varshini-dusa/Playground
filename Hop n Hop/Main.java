#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a>>b;
  int ans=0;
  ans+=abs(3-a);
  b-=ans;
  if(b>4)
    ans+=abs(4-b);
  std::cout<<ans;
}