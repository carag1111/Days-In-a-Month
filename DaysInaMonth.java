#include <iostream>
using namespace std;

int main() {
  int month, year;

  //Ask user to input valid month
  cout << "Enter a month (1-12): ";
  cin >> month;

  //Input validation for month
  while (month < 1 || month > 12) {
    cout << "Invalid month. Please enter a month between 1 and 12: " << endl;
    return 1; // Exit the program with an error code
    }

  //Ask user to input valid year
  cout << "Enter a year: ";
  cin >> year;

  bool isLeapYear = false;

  //Determine if the year is a leap year
  if (year % 100 == 0) {
    if (year % 400 == 0) 
      isLeapYear = true;
    } else {
      if (year % 4 == 0)
        isLeapYear = true;
    }
int days;
  
   //Determine the number of days in the month
  switch (month) {
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
      days = 31;
      break;
    case 4: case 6: case 9: case 11:
      days = 30;
      break;
    case 2:
    days = isLeapYear ? 29 : 28;
      break;

  } cout << days << "days" << endl;
  return 0;
  }