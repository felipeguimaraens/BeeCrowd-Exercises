#include <iostream>
using namespace std;

int sumCons(int n){
  // odd
  if(n%2){
    int total = n + 1;
    for(int i=2; i < 10; i+=2){
      total += (n + 1) + i;
    }
    return total;
  }
  // even
  else{
    int total = n;
    for(int i=2; i < 10; i+=2){
      total += n + i;
    }
    return total;
  }
}

int main() 
{
    int input = 0;
    while(1){
      cin >> input;
      if(input == 0) break;
      cout << sumCons(input) << "\n";
    }
    return 0;
}