
public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println(userWord(log));		
	}

	@Override
	public void error(String error) {
		System.out.println("Error: " + userWord(error));
		
	}
	
	private String userWord(String userInput){
		StringBuilder finalWord = new StringBuilder(); 
		for(int i = 0; i < userInput.length(); i ++ ) {
			if( i< userInput.length()-1) {
				finalWord.append(userInput.charAt(i)); 
				finalWord.append(" "); 
			}else {
				finalWord.append(userInput.charAt(i));
			}
		}
		return finalWord.toString(); 
	}
	
	

}
