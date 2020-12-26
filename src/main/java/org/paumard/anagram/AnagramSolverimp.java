package org.paumard.anagram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramSolverimp implements AnagramService {
	
	@SuppressWarnings("unused")
	private AnagramSolverService anagramSolver ;
	

	public AnagramSolverimp(AnagramSolverService anagramSolver) {
		this.anagramSolver = anagramSolver;
	}

	@Override
	public Set<String> findLongestAnagramSetFrom(Set<String> words) {
		
	    Function<String, String> SortChars	 =  sentence -> {
			char[] ArrayS1 = sentence.toLowerCase().toCharArray();  
	        Arrays.sort(ArrayS1);  
	       String sortedsentence1 = new String(ArrayS1);
			return sortedsentence1.trim();
		};	
		
		Map<String, List<String>> map =
				words.stream().collect(Collectors.groupingBy(SortChars));
		
		Entry<String, List<String>> entry_1 =
				 map.entrySet()
				.stream()
				.filter(e -> e.getValue().size() >= 2)
				.max(Map.Entry.comparingByValue(Comparator.comparing(List::size)))
				.orElseThrow();

		return(entry_1.getValue().stream().collect(Collectors.toSet()));
		
	}

	@Override
	public Set<String> findLongestAnagramFrom(Set<String> words) {
		
	    Function<String, String> SortChars	 =  sentence -> {
				char[] ArrayS1 = sentence.toLowerCase().toCharArray();  
		        Arrays.sort(ArrayS1);  
		       String sortedsentence1 = new String(ArrayS1);
				return sortedsentence1;
			};	
		
		Map<String, List<String>> map = words.stream()
				.collect(Collectors.groupingBy(SortChars));
				
		//verification
		System.out.println("#Word  map " + map.size());
		
		Entry<String, List<String>> entry_2 = 
				map.entrySet().stream()
				.filter(e -> e.getValue().size() >= 2)
				.max(Map.Entry.comparingByKey(Comparator.comparing(String::length)))
				.orElseThrow();
			return  (entry_2.getValue().stream().collect(Collectors.toSet()));
			
	}
	
	
	
	
	
	

}
