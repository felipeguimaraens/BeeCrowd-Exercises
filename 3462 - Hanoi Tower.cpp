#include <iostream>

using namespace std;

int moves = 0;

void Hanoi(int disks, int* moves){
        *moves = *moves + 1;
        if(disks == 1){
            return;
        }
        else{
            Hanoi(disks-1, moves);
            Hanoi(disks-1, moves);
        }
    }

int main()
{
    int disks = 0;
    while(1){
      cin >> disks;
      if(disks == 0) break;
      cout<<"Teste "<<disks<<"\n";
      Hanoi(disks,&moves);
      cout<<moves<<"\n"<<"\n";
      moves=0;
    }
    return 0;
}

