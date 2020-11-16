package org.paumard.anagram;

import java.util.Set;

public interface AnagramService {

    /**
     * This method returns a <code>Set</code> of words which are all anagrams of each other.
     * This set is the one that contains the most words from the given <code>words</code>.
     *
     * @param words the set of words to search from
     * @return the longest set of words that are anagrams
     */
    Set<String> findLongestAnagramSetFrom(Set<String> words);

    /**
     * This returns a <code>Set</code> of words which all are anagrams of each other.
     * This set is the one in which the words are the longest from the give <code>words</code>.
     *
     * @param words the set of words to search from
     * @return the set of the longest words that are anagrams
     */
    Set<String> findLongestAnagramFrom(Set<String> words);
}
