#include <iostream>
using namespace std;

int main(){
    string name,email,logemail,pass,logpass;

    cout <<"\nWelcome to the login statment \n\nEnter the name : ";
    cin >> name;
    cout <<"Enter the Email : ";
    cin >>email;
    cout <<"Create a password : ";
    cin >> pass;
    cout<<"\n\nLOGIN FORM\n\nEnter Your Email : ";
    cin >> logemail;
    cout <<"Enter Your password : ";
    cin >> logpass;
    if(name.empty() || email.empty() || pass.empty()){
        cout <<"Enter all the required "<<endl;
        return 0;   
    }
    else if(logemail == email && logpass == pass){
        cout <<"\n\nWelocome "<<name<<" buddy"<<endl;
        return 0;
    }
    else if (logpass != pass && logemail == email){
        cout<<"\n\n WARNING : Wrong Password...!"<<endl;
        return 0;
    }
    else if(logemail != email && logpass == pass){
        cout<<"\n\n WARNING : Wrong Email...!"<<endl;
        return 0;
    }
    else {
        cout<<"\n\n WARNING : Wrong email and password...! \n\nPlease try again."<<endl;
        return 0;
    }
    return 0;
}
