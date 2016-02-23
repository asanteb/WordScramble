package scrampler;

import java.util.Random;

public class RandomFileLetter {
	
	public String fileLetter(){
			String[] filename = {"a","b","c","d","e","f","g","h","i","j",
		"k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
			Random letter = new Random();
			int n = letter.nextInt(26);
			return filename[n];
	
	}
	

}
