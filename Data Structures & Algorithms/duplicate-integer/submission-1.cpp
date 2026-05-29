class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
      unordered_set<int> set;
      for(auto &number: nums){
        if(set.count(number)) return true;
        set.insert(number);
      } 
      return false;
    }
};