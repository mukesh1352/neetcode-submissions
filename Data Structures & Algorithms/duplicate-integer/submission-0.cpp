class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int, int> mp;
        for(auto &value : nums){
            mp[value]++;
        }

        for(auto &pair : mp){
            if(pair.second>=2) return true;
        }
        return false;
    }
};