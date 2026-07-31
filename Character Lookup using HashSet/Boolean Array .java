class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> set = new HashSet<>();

        // Store allowed characters
        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int count = 0;

        // Check each word
        for (String word : words) {
            boolean valid = true;

            for (char ch : word.toCharArray()) {
                if (!set.contains(ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}
