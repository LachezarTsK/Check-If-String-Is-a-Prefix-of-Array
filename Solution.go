
package main

import "fmt"

func isPrefixString(prefix string, words []string) bool {
	indexPrefix := 0
	sumLengthCompletedWords := 0

	for i := 0; i < len(words) && indexPrefix < len(prefix); i++ {
		for j := 0; j < len(words[i]) && indexPrefix < len(prefix); j++ {
			if prefix[indexPrefix] != words[i][j] {
				return false
			}
			indexPrefix++
		}
		sumLengthCompletedWords += len(words[i])
	}

	return len(prefix) == sumLengthCompletedWords
}
