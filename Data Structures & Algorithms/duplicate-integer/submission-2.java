class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int value : nums){
            if(res.contains(value)) return true;
            res.add(value);
        }
        return false;
    }
}