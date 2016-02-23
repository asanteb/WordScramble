package scrampler;

public class OriginalWord {
	
	private static String ogWord;
	
	public static void storeWord(String str){
		ogWord = str;
	}

	
	public static String returnWord(){
		return ogWord;
	}
	
}
