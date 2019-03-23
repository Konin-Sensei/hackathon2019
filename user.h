#ifndef USER_H
#define USER_H

#include <string>
#include "car.h"

class User{
public:
    int get_timestamp();
    std::string get_issue();
    bool get_issue_present();
    
private:
    std::string username;
    std::string password;
    Car list_of_cars[];
};

#endif