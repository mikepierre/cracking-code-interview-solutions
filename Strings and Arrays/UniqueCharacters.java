public class UniqueCharacters {

	public static void main(String[] args) {}
	
	/*
	 * Problem: Implement an algorithm to find unique characters in a string
	 * 1. Implement a method that takes one string argument
	 * 2. Check if the length of the string is greater than or equal to 128 bits.
	 * 3. create a boolean array to add unique characters up to 128 bits
	 * 4. Walk the string in a for loop.
	 * 5. When walking the string lets create a variable to get the individual 
	 * characters based off the index.
	 * 6. When walking the string lets see if the unique character all ready has been 
	 * identified and if so lets return false.
	 * 7. Or else lets set a flag to the char set to true.
	 */
	
	boolean uniqueChars(String str){
		if(str.length() > 128){
			return false;
		}
		
		boolean[] char_set = new boolean[128];
		
		for(int i=0; i < str.length(); i++){
			int val = str.charAt(i);
			if(char_set[val]){
				return false;
			} else {
				char_set[val] = true;
			}
		}
		return true;
	}

}
