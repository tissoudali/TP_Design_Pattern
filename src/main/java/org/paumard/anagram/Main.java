package org.paumard.anagram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		AnagramSolverService anagramSolver = new AnagramSolver();
		AnagramService anagramService = new AnagramSolverimp(anagramSolver);
		
		Path path =  Path.of("files/wordlist_cleaned.txt");
		try(Stream<String> lines = Files.lines(path);){
			
		List<String> words =
	                    lines.map(String::toLowerCase).collect(Collectors.toList());
		System.out.println("# words LIST = " +words.size() );
				
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		Set<String> words = null ;
		try(Stream<String> lines = Files.lines(path);){
			
			 words =
		              lines.map(String::toLowerCase).collect(Collectors.toSet());
			System.out.println("# words SET = " +words.size() );
					
			}catch (IOException e) {
				
				e.printStackTrace();
			}
					
    Function<String, String> SortChars	 =  sentence -> {
		char[] ArrayS1 = sentence.toLowerCase().toCharArray();  
        Arrays.sort(ArrayS1);  
       String sortedsentence1 = new String(ArrayS1);
		return sortedsentence1.trim();
	};	
	
	// Cles = chaines triees.
	// Valeurs = listes de mots anagrams les uns des autres.
	
	Map<String, List<String>> map =
			             	words.stream().collect(Collectors.groupingBy(SortChars));
	
	System.out.println("# words map = " +map.size() );
		
Entry<String, List<String>> entry_1 = map.entrySet().stream()
          .filter(e -> e.getValue().size() >= 2)
	      .max(Map.Entry.comparingByKey(Comparator.comparing(String::length)))
	      .orElseThrow();
 System.out.println("# Anagrams les plus longs" );
 entry_1.getValue().forEach(System.out::println);

	}		
				
}	
		

	


