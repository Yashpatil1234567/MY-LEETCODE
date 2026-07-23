class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int i = 0;
        int j = 0;

        while (j < typed.length()) {

            // Characters match
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            // Current character in typed is a long press
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }
            // Invalid character
            else {
                return false;
            }
        }

        // All characters in name should be matched
        return i == name.length();
    }
}
