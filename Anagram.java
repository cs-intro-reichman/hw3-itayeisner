/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true
 
		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed"); 
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		// Replace the following statement with your code
		boolean isang = false;
		String str11 = preProcess(str1);
		String str22 = preProcess(str2);
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<str11.length();i++){
			for(int j=0;j<str11.length();j++){
				if(str11.charAt(i)==str11.charAt(j)&&str11.charAt(i)!=' '){count1++;}
			}
			for(int j=0;j<str22.length();j++){
				if(str11.charAt(i)==str22.charAt(j)&&str11.charAt(i)!=' '){count2++;}
			}
			if(count1==count2){isang=true;}
			else{return false;}
			count1 = 0;
			count2 = 0;
		}
		if(str1==""&&str2==""){isang=true;}
		
		return isang;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		// Replace the following statement with your code
		String pre = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)<=' '){
				pre += str.charAt(i);
			}
		}
		pre = pre.toLowerCase();
		return pre;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		// Replace the following statement with your code
		String sub = "";
		String str1 = "";
		String check =str;
		boolean isan = false;
		while(!isan&&str.length()>0){
			int rand = (int) (Math.random()*str.length());
			sub += sub.charAt(rand);
			for(int i=0;i<str.length();i++){
				if(i != rand){
				str1 += str.charAt(i);}
			}
			str=str1;
			str1="";
			if(isAnagram(sub, check)){isan = true;}
		}
		
		return sub;	
		}
		
}
