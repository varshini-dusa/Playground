#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int tb,tr,cr,cb;
  std::cin>>tb>>tr>>cr>>cb;
  double to,co;
  to=int(tb/6);
  co=int(cb/6)+0.1*(cb%6);
  double trr,crr;
  trr=tr/to;
  crr=cr/co;
  std::cout<<to<<endl<<co<<endl;
  printf("%.1f\n%.1f\n",crr,trr);
  if(crr>=trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win"; 
}