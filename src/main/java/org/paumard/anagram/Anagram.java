package org.paumard.anagram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Anagram{

	public static void main(String[] args) {
		
		AnagramSolverService anagramSolver = new AnagramSolver();
		AnagramService anagramService = new AnagramSolverimp(anagramSolver);

		Path path = Path.of("files/wordlist_cleaned.txt");
		
		Set<String> words = null;
		try (Stream<String> lines = Files.lines(path);) {

			words = lines.map(String::toLowerCase)
					.collect(Collectors.toSet());
	
   System.out.println("#Words Set : " + words.size()); 
		} 
	catch (IOException e) {
			e.printStackTrace();
		}
		
	System.out.println("# Set Anagrams les plus longs :\n"+anagramService.findLongestAnagramSetFrom(words));
	System.out.println("# Anagrams les plus longs :\n "+anagramService.findLongestAnagramFrom(words));
		
	}

}
