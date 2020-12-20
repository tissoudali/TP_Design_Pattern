package org.paumard.anagram;

import java.util.Arrays;

public class AnagramSolver {
	

	
	
    public boolean isAnagram(String sentence1, String sentence2) {
    	char[] ArrayS1 = sentence1.toLowerCase().toCharArray();  
        char[] ArrayS2 = sentence2.toLowerCase().toCharArray();  
        Arrays.sort(ArrayS1);  
        Arrays.sort(ArrayS2);  
     boolean  result = Arrays.equals(ArrayS1, ArrayS2); 	
        return result;
    }
}
