
/**
 * @param {string} prefix
 * @param {string[]} words
 * @return {boolean}
 */
var isPrefixString = function (prefix, words) {
    let indexPrefix = 0;
    let sumLengthCompletedWords = 0;

    for (let i = 0; i < words.length && indexPrefix < prefix.length; ++i) {
        for (let j = 0; j < words[i].length && indexPrefix < prefix.length; ++j) {
            if (prefix.charAt(indexPrefix) !== words[i].charAt(j)) {
                return false;
            }
            ++indexPrefix;
        }
        sumLengthCompletedWords += words[i].length;
    }

    return prefix.length === sumLengthCompletedWords;
};
