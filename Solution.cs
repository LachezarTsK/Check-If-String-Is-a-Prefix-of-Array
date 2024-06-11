
using System;

public class Solution
{
    public bool IsPrefixString(string prefix, string[] words)
    {
        int indexPrefix = 0;
        int sumLengthCompletedWords = 0;

        for (int i = 0; i < words.Length && indexPrefix < prefix.Length; ++i)
        {
            for (int j = 0; j < words[i].Length && indexPrefix < prefix.Length; ++j)
            {
                if (prefix[indexPrefix] != words[i][j])
                {
                    return false;
                }
                ++indexPrefix;
            }
            sumLengthCompletedWords += words[i].Length;
        }

        return prefix.Length == sumLengthCompletedWords;
    }
}
