
#include <vector>
#include <string>
using namespace std;

class Solution {

public:
    bool isPrefixString(const string& prefix, const vector<string>& words) const {
        int indexPrefix = 0;
        int sumLengthCompletedWords = 0;

        for (size_t i = 0; i < words.size() && indexPrefix < prefix.length(); ++i) {
            for (size_t j = 0; j < words[i].length() && indexPrefix < prefix.length(); ++j) {
                if (prefix[indexPrefix] != words[i][j]) {
                    return false;
                }
                ++indexPrefix;
            }
            sumLengthCompletedWords += words[i].length();
        }

        return prefix.length() == sumLengthCompletedWords;
    }
};
