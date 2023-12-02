#include <iostream>
using namespace std;

double A[100];
int arraySize = sizeof(A)/sizeof(A[0]);

void printArray(double array[], int arraySize){
  for(int i = 0; i < arraySize; i++)
  {
    cout << "N[" << i << "] = " << array[i] << "\n";
  }
}
void arrayFill(int index, double n){
  if(index > arraySize) printArray(A,100);
  else{
    A[index] = n;
    arrayFill(index+1,n/2.0);
  }
}

int main() 
{
    // configure cout for 4 decimal units
    cout  << fixed;
    cout.precision(4);
    
    double n = 0;
    cin >> n;
    arrayFill(0,n);
    return 0;
}



