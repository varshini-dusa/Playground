#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int f,s,a;
  f=(fa-(fd*0.01*fa)+fs);
  s=(sa-(sd*0.01*sa)+ss);
  a=(aa-(ad*0.01*aa)+as);
  cout<<"In Flipkart Rs."<<f<<endl;
  cout<<"In Snapdeal Rs."<<s<<endl;
  cout<<"In Amazon Rs."<<a<<endl;
  if(f<=s&&f<=a)
    cout<<"He will prefer Flipkart";
  else if(s<=f&&s<=a)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}