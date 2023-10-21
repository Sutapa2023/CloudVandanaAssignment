package cloudvandanaAssignment.cloudvandanaProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ShuffleArray {

	 public static void main(String[] args) {
	        Integer[] originalArray = {1, 2, 3, 4, 5, 6, 7};

	        // Convert the array to a list for easy shuffling
	        List<Integer> list = Arrays.asList(originalArray);
	        
	        // Shuffle the list
	        Collections.shuffle(list);
	        
	        // Convert the list back to an array
	        Integer[] shuffledArray = list.toArray(new Integer[0]);

	        // Print the shuffled array
	        System.out.println(Arrays.toString(shuffledArray));
	    }
}
