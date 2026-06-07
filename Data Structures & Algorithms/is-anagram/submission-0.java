class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);
            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }

        }

        for (int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if (!count.containsKey(ch) || count.get(ch) == 0){
                return false;
            }
            else {
                count.put(ch, count.get(ch) - 1);
                }
        }

        return true;

    }
}
