class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int i = 0, j = numbers.size()-1;
        while(i<j){
            int summ = numbers[i]+numbers[j];
            if(summ == target) return {i+1, j+1};
            else if(summ>target) j--;
            else i++;
        }
        return {};
    }
};
