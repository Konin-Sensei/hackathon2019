#ifndef ISSUE_H
#define ISSUE_H

#include <string>

class Issue{
public:
    int get_timestamp();
    std::string get_issue();
    bool get_issue_present();
    
private:
    int timestamp;
    std::string issue_name;
    bool issue_present;
};

#endif