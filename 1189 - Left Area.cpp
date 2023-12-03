#include <iostream>
using namespace std;

float matrix[12][12];

int main() {
 
    int input = 0;
    char operation;
    // indexes to read inner triangle
    int indexB = 1; // beginning
    int indexE = 11; // end
    float total = 0;
    
    // Read input
    cin >> operation;
    for(int l=0;l < 12;l++){
      for(int i=0;i < 12;i++){
        cin >> matrix[l][i];
      }
    }
    
    // for loop to read left triangle
    for(int i = 0 ; i < 12 ; i++){
      for(int l = indexB;l < indexE;l++){
        //cout << matrix[l][i] << " ";
        total += matrix[l][i];
      }
      indexB++;
      indexE--;
      //cout << "\n";
    }
    cout << fixed;
    cout.precision(1);
    
    if(operation == 'S') cout << total << "\n";
    if(operation == 'M') cout << total/30 << "\n";
    
    return 0;
}

/* 
    // Read input
    cin >> operation;
    for(int l=0;l < 11;l++){
      for(int i=0;i < 11;i++){
        cin >> matrix[l][i];
      }
    }
    // Print input
    for(int l=0;l < 11;l++){
      for(int i=0;i < 11;i++){
        cout << matrix[l][i] << "\t";
      }
      cout << "\n";
    }
*/