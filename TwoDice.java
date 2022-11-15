// Chapter 5 game zone exercise
public class TwoDice
{
	public static void main(String[] args)
	{
		// variables and constants
		String outcome;
		Die die1 = new Die();
		Die die2 = new Die();
		// processing phase
		if(die1.getDieValue() > die2.getDieValue())
		{
			outcome = "The player wins the game!";
		}
		else
		{
			if(die1.getDieValue() < die2.getDieValue())
			{
				outcome = "The computer has won.";
			}
			else
			{
				outcome = "We have a tie game!";
			}
		}
		// output
		System.out.println("The player's die was a roll of: " + die1.getDieValue());
		System.out.println("The computer's die was a roll of: " + die2.getDieValue());
		System.out.println(outcome);
	}
}