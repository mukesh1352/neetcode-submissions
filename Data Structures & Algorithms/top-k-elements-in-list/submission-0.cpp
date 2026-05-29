class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
       vector<int> output;
        unordered_map<int, int> mp;
        for(int x : nums) mp[x]++; //find the frequency
        vector<pair<int, int>> v;
        for(auto it:mp){
            v.push_back({it.second, it.first});
        }
        sort(v.begin(), v.end(), greater<pair<int, int>>());
        for(int i = 0;i<k;i++){
            output.push_back(v[i].second);
        }
        return output;
    }
};
