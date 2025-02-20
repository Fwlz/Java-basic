package Scanner;
import java.util.Scanner;
public class Guess {

	public static void main(String[] args) {
		String[] words = {"java", "python", "ruby", "javascript", "html"};
        String chosenWord = words[(int) (Math.random() * words.length)];
        
        char[] guessedWord = new char[chosenWord.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
        
        int attemptsLeft = 10;
        boolean wordGuessed = false;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Guess the Word Game!");
        System.out.println("You have " + attemptsLeft + " attempts to guess the word.");
        
        while (attemptsLeft > 0 && !wordGuessed) {
            System.out.println("Current word: " + String.valueOf(guessedWord));
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Enter a letter: ");
            
        char guessedLetter = scanner.next().toLowerCase().charAt(0);
            
            boolean correctGuess = false;
            for (int i = 0; i < chosenWord.length(); i++) {
                if (chosenWord.charAt(i) == guessedLetter) {
                    guessedWord[i] = guessedLetter;
                    correctGuess = true;
                }
            }
            
            if (correctGuess) {
                System.out.println("Correct guess!");
            } else {
                System.out.println("Wrong guess!");
                attemptsLeft--;
            }
            if (wordGuessed) {
                System.out.println("Congratulations! You guessed the word: " + chosenWord);
            } else {
                System.out.println("Game Over! The correct word was: " + chosenWord);
            }
		

	}

	}
}
