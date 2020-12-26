package org.paumard.anagram;

import java.util.Arrays;
import java.util.Objects;


public class AnagramSolver implements AnagramSolverService  {
	
    @Override
	public boolean isAnagram(String sentence1, String sentence2) {
    	
        String sortedsentence1 = sortChars(sentence1);
        String sortedsentence2 = sortChars(sentence2);
        
   return 	Objects.equals(sortedsentence1, sortedsentence2); 	
        
	}

	private String sortChars(String sentence1) {
		char[] ArrayS1 = sentence1.toLowerCase().toCharArray();  
         Arrays.sort(ArrayS1);  
        String sortedsentence1 = new String(ArrayS1);
		return sortedsentence1.trim();
	}
}
