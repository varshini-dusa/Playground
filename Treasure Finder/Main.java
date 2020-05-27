#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,st,hcf;
  cin>>a>>b>>c;
  st=a<b?(a<c?a:c):(b<c?b:c);
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
  if((a>b&&a<c)||(a>c&&a<b))
    cout<<"The treasure is in box which has number "<<a<<endl;
  else if((b>a&&b<c)||(b>c&&b<a))
    cout<<"The treasure is in box which has number "<<b<<endl;
  else
    cout<<"The treasure is in box which has number "<<c<<endl;
  cout<<"The code to open the box is "<<hcf;
}