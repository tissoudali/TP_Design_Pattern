package org.paumard.anagram;

public interface AnagramSolverService {

	 /**
	 
     * This method returns TRUE IF  a <code>setence1</code> anagrams of each other <code>sentence2</code>.
     * Two sentence are anagrams if they have the same letters are used in both, regardless of upper/lower case and space.
     * @param sentence1
     * @param sentence2
     * @return
     */
	boolean isAnagram(String sentence1, String sentence2);

}