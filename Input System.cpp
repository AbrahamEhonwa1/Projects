/*
This is a simple system that will request the user to enter their name and age the system will then output the users name and age.
*/
#include <iostream>
using namespace std;

int main()
{
 string x;
 int y;
 
 cout<<"what is your name"<<endl;
 cin>>x;//this is where the user inputs name
 
 cout<<"What is your age"<<endl;
 
 cin>>y;
 
 cout<<x<<" is "<<y<<" years old";//his will output the users name and age
 return 0;
}