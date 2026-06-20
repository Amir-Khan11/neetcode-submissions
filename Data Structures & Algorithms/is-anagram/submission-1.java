class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) return false;

        boolean[] isVisited = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            boolean isFound = false;
            for (int j = 0; j < t.length(); j++) {
                if (isVisited[j]) continue;

                if (s.charAt(i) == t.charAt(j)){
                    isFound = true;
                    isVisited[j] = true;
                    break;
                }
            }

            if (!isFound) {
                return false;
            }
        }
        return true;
    }
}
