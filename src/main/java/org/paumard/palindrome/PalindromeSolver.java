package org.paumard.palindrome;

public class PalindromeSolver {
	
	
	   public String Corriger(String sentence) {
			 int i ; 
			 String str1="";
			 char c;
			 for(i=0;i<sentence.length();i++) {
			   c= sentence.charAt(i);
			 
		        if (c != ' ') 
		          if(c >= 'A' && c <= 'Z') {
		           c = (char)((int)c+32); 
		            str1 += c;	
		            }
		           else
		    	    str1 += c;		 
		           }
			 return str1; 
		 }

    public boolean isPalindrome(String sentence) {
       	
	String corr = Corriger(sentence);
	
		   int leftPos = 0;
	       int rightPos = corr.length() - 1;
	       

	       boolean palindrome=true;
	       while ((leftPos < rightPos) && palindrome) {
	            if (corr.charAt(leftPos) != corr.charAt(rightPos)) {
	                palindrome=false;
	            }
	            leftPos++;
	            rightPos--;
	        }     
	       
	      return palindrome; 
	       
	}
}
 
    