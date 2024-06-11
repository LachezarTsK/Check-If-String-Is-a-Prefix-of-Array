
public class Solution {

    public boolean isPrefixString(String prefix, String[] words) {
        int indexPrefix = 0;
        int sumLengthCompletedWords = 0;

        for (int i = 0; i < words.length && indexPrefix < prefix.length(); ++i) {
            for (int j = 0; j < words[i].length() && indexPrefix < prefix.length(); ++j) {
                if (prefix.charAt(indexPrefix) != words[i].charAt(j)) {
                    return false;
                }
                ++indexPrefix;
            }
            sumLengthCompletedWords += words[i].length();
        }

        return prefix.length() == sumLengthCompletedWords;
    }
}
