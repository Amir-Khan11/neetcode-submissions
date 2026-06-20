class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> list = new ArrayList<>();
        boolean[] isVisited = new boolean[str.length];

        for (int i = 0; i < str.length; i++) {
            if(isVisited[i]) {
                continue;
            }

            List<String> temp = new ArrayList<>();
            temp.add(str[i]);

            char[] ch = str[i].toCharArray();
            Arrays.sort(ch);
            for (int j = i + 1; j < str.length; j++) {

                if (str[i].length() == str[j].length()) {
                    char[] a = str[j].toCharArray();
                    Arrays.sort(a);
                    if (new String(ch).equals(new String(a))) {
                        temp.add(str[j]);
                        isVisited[j] = true;
                    }

                }


            }
            list.add(temp);
        }

        return list;
    }
}
