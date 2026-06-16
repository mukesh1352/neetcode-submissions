/*

sc = string_character_split;
ss = String_string;

*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String word : strs){
            char[] sc = word.toCharArray();
            Arrays.sort(sc);
            String ss = new String(sc);
            mp.putIfAbsent(ss, new ArrayList<>());
            mp.get(ss).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}
