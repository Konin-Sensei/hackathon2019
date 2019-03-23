#ifndef DRIVER_H
#define DRIVER_H

#include <string>

class Driver{
public:
    std::string get_name();
    std::string get_date_of_birth();
private:
    std::string name;
    std::string date_of_birth;
};

#endif 