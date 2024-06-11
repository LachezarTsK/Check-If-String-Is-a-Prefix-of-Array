
class Solution {
    fun isPrefixString(prefix: String, words: Array<String>): Boolean {
        var indexPrefix = 0
        var sumLengthCompletedWords = 0

        var i = 0
        while (i < words.size && indexPrefix < prefix.length) {

            var j = 0
            while (j < words[i].length && indexPrefix < prefix.length) {
                if (prefix[indexPrefix] != words[i][j]) {
                    return false
                }
                ++indexPrefix
                ++j
            }
            sumLengthCompletedWords += words[i].length
            ++i
        }

        return prefix.length == sumLengthCompletedWords
    }
}
