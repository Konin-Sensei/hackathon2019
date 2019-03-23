#include "issue.h"

int Issue::get_timestamp(){
    return timestamp;
}
std::string Issue::get_issue(){
    return issue_name;
}
bool Issue::get_issue_present(){
    return issue_present;
}