package scrampler;

import java.io.IOException;
import java.util.Random;

public class randomGen {
		
		public static void newGenerate() throws IOException{
			
			String selectedWord = WordSelector.randWord();
			//String tempWord = null;
			//char tempChar;
			
			int length = selectedWord.length();
			char[] element = new char[length];
		
			Random generate = new Random();
			int number;
		
			Boolean [] available = new Boolean[length];
			for(int i = 0; i < length; i++){
				available[i] = true;
			}
		

		
			for(int i = 0; i < length; i++){
				Boolean met = false;
					while(met == false){
						number = generate.nextInt(length);
						if(number == 10)
							number--;
				
						if(available[number] == true){
							element[i] = selectedWord.charAt(number);
							available[number] = false;
							met = true;
						}
					}
				}
					
			
			
		
		
		
		
		
			String output = new String(element);
		
			System.out.println(output);

			//return output;
		}
}
