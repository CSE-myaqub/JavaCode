//Muhammad Yaqub
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();
		boolean playAgain = true; //controls if you want to replay the game
		//keeps the program running until user chooses to stop playing
		while (playAgain) {
			int playerScore = 0;
			int computerScore = 0;
			int round = 1;
			System.out.println("Lets Play Rock, Paper, Scissors");
			System.out.println("Best 2 out of 3 rounds wins!");
			System.out.println("---------------------------------------");
			//plays exactly 3 rounds
			while (round <= 3) {
				System.out.println("\nRound " + round + ":");
				System.out.print("Enter your choice (rock, paper, or scissors): ");
				String playerChoice = key.nextLine().trim().toLowerCase();
				//computers choice (0 = rock, 1 = paper, 2 = scissors)
				int compNum = rand.nextInt(3);
				String compChoice = "";
				if (compNum == 0) {
					compChoice = "rock";
				} else if (compNum == 1) {
					compChoice = "paper";
				} else {
					compChoice = "scissors";
				}
				System.out.println("Computer chose: " + compChoice);
				//computer gets a point automatically if input is invalid
				if (!playerChoice.equals("rock") && 
					!playerChoice.equals("paper") && 
					!playerChoice.equals("scissors")) {
					System.out.println("Invalid input! Computer gets the point.");
					computerScore++;
				} else if (playerChoice.equals(compChoice)) {
					//draw
					System.out.println("It's a draw. No points are awarded.");
				} else {
					//determines the winner
					boolean playerWins = 
						(playerChoice.equals("rock") && compChoice.equals("scissors")) ||
						(playerChoice.equals("paper") && compChoice.equals("rock")) ||
						(playerChoice.equals("scissors") && compChoice.equals("paper"));
					if (playerWins) {
						System.out.println("You win this round!");
						playerScore++;
					} else {
						System.out.println("Computer wins this round!");
						computerScore++;
					}
				}
				//shows current score after each round
				System.out.println("Score: You: " + playerScore + " | Computer: " + computerScore);
				round++;
			}
			//determines the overall winner
			System.out.println("\nFinal Results");
			if (playerScore > computerScore) {
				System.out.println("You are the overall winner!");
			} else if (computerScore > playerScore) {
				System.out.println("Computer is the overall winner!");
			} else {
				System.out.println("It's a tie!");
			}
			//asks if you want to play again
			System.out.print("\nDo you want to play again? (Yes/No): ");
			String response = key.nextLine().trim().toLowerCase();
			if (!response.equals("yes")) {
				playAgain = false;
				System.out.println("Thanks for playing!");
			}
		}

		key.close();

	}

}
