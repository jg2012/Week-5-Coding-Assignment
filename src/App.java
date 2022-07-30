import java.util.Scanner;

public class App {
	
	static Scanner scanner = new Scanner(System.in); //User Input Scanner 
	
	public static void main(String[] args) {
		
		System.out.println("Please type an a word: (i.e. Hello 🙋🏻‍♂️) ");
		String userWord = scanner.next(); 
		
		Logger loggerA = new AsteriskLogger(); 
		loggerA.error(userWord);
		loggerA.log(userWord);
		
		System.out.println("                                ");
		System.out.println("↓ Spaced Logger Started Below ↓");
		System.out.println("                                ");

		Logger loggerSL = new SpacedLogger(); 
		loggerSL.log(userWord);
		loggerSL.error(userWord);
	
	}

}
