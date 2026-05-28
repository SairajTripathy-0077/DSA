/*
QUESTION:-
Given an array Arr of size N, print second largest distinct element from an array.

Example:

Input:
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the
array is 35 and the second largest element
is 34.
*/
#include <iostream>
using namespace std;

int SecondLargest(int arr[], int n){
    int largest = 1, second_largest = -1;
    for (int i = 1; i < n; i++)
    {
        if(arr[i] > largest){
            second_largest = largest;
            largest = arr[i];
        }
    }
    return second_largest;
}
int main(){
    int arr[] = {1,2,3,4,5,6,5,5,4};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << SecondLargest(arr, n);
}