/*
QUESTION:-
Given an array "ARR' containing 'N' elements, rotate this array Left by once means to shift all elements by one place to the left and move the first element to the last position in the array.

Example:
Input: 'N' 5, 'ARR' = [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]

Explanation:
We moved the 2nd element to the 1st position and 3rd element to the 2nd position and 4th element to the 3rd position and 5th element to the 4th position and move oth element to the 5th position.
*/
#include <vector>
#include <iostream>
using namespace std;
vector<int> rotate(vector<int>& nums, int k) {
        int temp = nums[0];
        for(int i=1;i<k;i++){
            nums[i-1] = nums[i];
        }
        nums[k-1] = temp;
        return nums;
    }
int main(){
    vector<int> nums = {1, 2, 3, 4, 5};
    vector<int> arr = rotate(nums, nums.size());
    for(int i=0;i<arr.size();i++){
        cout << arr[i] << " ";
    }
}