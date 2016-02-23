package scrampler;

import java.util.Random;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

public class WordSelector {

	public static String randWord() throws IOException{
		
		List<String> list = new ArrayList<>();
		Random rWord = new Random();
		int numberLines = ReadLines.countLines("src/WordBank/" + "c" + ".txt");
		
		int randLine = rWord.nextInt(numberLines);
		
		list = WordSorter.sortOut();
		String theWord = list.get(randLine);
		
		OriginalWord.storeWord(theWord);
		
		return theWord;
		
		
		
	}
	
	
}
