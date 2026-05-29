class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> output;
        int n=strs.size();
        unordered_map<string, vector<string>> mp;
        for(string str : strs){
            string sortedstr = str;
            sort(sortedstr.begin(), sortedstr.end());
            mp[sortedstr].push_back(str);
        }
        for(const auto &pair : mp){
            output.push_back(pair.second);
        }
        return output;
    }
};
