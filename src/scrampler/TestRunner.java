package scrampler;

import java.io.IOException;
import java.util.Scanner;

public class TestRunner {

	public static void main(String[] args) throws IOException {
		
		//RandomFileLetter rLetter = new RandomFileLetter();
		//rLetter.fileLetter();
		
		//String file = "src/WordBank/" + rLetter.fileLetter() + ".txt";
		//int result;
		//result = ReadLines.countLines(file);
		String yes = "n";
		
		while(yes != "y"){
			randomGen.newGenerate();
			String ogWord = OriginalWord.returnWord();
			Scanner usrInput = new Scanner(System.in);
			String input;
			
			for(int i = 0; i < 3;i++)
			{
				input = usrInput.nextLine();
							
				if(input.equals(ogWord)){
					System.out.println("Congrats! You got it.");
					break;
				}
				
				System.out.println("Please try again you have "+ (2-i) + " chances left");
			}
			System.out.println("Would you like to try again?");
			yes = usrInput.nextLine();
			//usrInput.close();
		}
		

		String newWord = WordSelector.randWord();
		
		
		System.out.println(newWord);
		
	}

}
