class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int l = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int ll = 1;
                int next = num+1;
                while(set.contains(next)){
                    next++;
                    ll++;
                }
                l = Math.max(l,ll);
            }
        }
        return l;
    }
}