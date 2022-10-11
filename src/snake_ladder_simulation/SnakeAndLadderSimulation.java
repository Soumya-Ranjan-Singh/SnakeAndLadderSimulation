//This is a Snake and Ladder game simulation program.
//Single player is playing.He starts the game from zero.
//He is rolling the die to get a number.
//He is checking for an option, whether it is a No play, Ladder or Snake.
//Repeat to roll the die till the player reaches to the winning position 100.
//Repeat to roll the die till the player reaches to the exact winning position 100.
//Report the no of times the dice was played to win the game and also the position after every die roll.

package snake_ladder_simulation;

import java.util.Random;

public class SnakeAndLadderSimulation {
    SnakeAndLadderSimulation()
    {
        System.out.println("Welcome to Snake and Ladder Simulation \n");
    }

    public static void main(String[] args) {
        SnakeAndLadderSimulation a = new SnakeAndLadderSimulation();
        int startingPosition = 0;
        int playerPosition = 0;
        int[] ladder = {4,15,35,55,87};
        int[] snake = {20,44,67,92};
        int winningPosition = 100;
        int count = 0;
        Random random = new Random();
        System.out.println("Starting Position of the Single Player is : "+startingPosition+"\n");

        startsGame(playerPosition, winningPosition, count, ladder,snake,random);
    }
    //Starts the game.
    public static void startsGame(int playerPosition,int winningPosition, int count, int[] ladder, int[] snake, Random random) {
        do {
            //Rolling the die.
            int dieRolls = (random.nextInt(6) + 1);
            count++;
            System.out.println("The Player rolls the die and gets a number : " + dieRolls + "\n");
            playerPosition = playerPosition + dieRolls;
            int position = checkOption(playerPosition, ladder, snake);
            playerPosition = position;
            System.out.println("Player current position is : " + playerPosition + "\n");
            if (playerPosition > winningPosition)
            {
                playerPosition -= dieRolls;
                System.out.println("Position goes beyond 100.\nSo no play - Player stays in the same position \n");
                System.out.println("Player current position is : " + playerPosition + "\n");
                System.out.println("The number required by the player is : "+(winningPosition-playerPosition)+"\n");
            }
        }while(playerPosition != winningPosition);
        System.out.println("Player reaches the exact winning position. \n");
        System.out.println("The number of times the dice was rolled is : "+count);
    }
    //Check for the options.
    public static int checkOption(int playerPosition, int[] ladder, int[] snake) {
        if (playerPosition == ladder[0])
        {
            System.out.println("Hurray gets Ladder!! & Player moves ahead \n");
            playerPosition = 12;
        } else if (playerPosition == ladder[1]) {
            System.out.println("Hurray gets Ladder!! & Player moves ahead \n");
            playerPosition = 45;
        } else if (playerPosition == ladder[2]) {
            System.out.println("Hurray gets Ladder!! & Player moves ahead \n");
            playerPosition = 80;
        } else if (playerPosition == ladder[3]) {
            System.out.println("Hurray gets Ladder!! & Player moves ahead \n");
            playerPosition = 95;
        } else if (playerPosition == ladder[4]) {
            System.out.println("Hurray gets Ladder!! & Player moves ahead \n");
            playerPosition = 93;
        }  else if (playerPosition == snake[0]) {
            System.out.println("Oops Snake bytes!! & Player moves behind \n");
            playerPosition = 10;
        }else if (playerPosition == snake[1]){
            System.out.println("Oops Snake bytes!! & Player moves behind \n");
            playerPosition = 32;
        }else if (playerPosition == snake[2]){
            System.out.println("Oops Snake bytes!! & Player moves behind \n");
            playerPosition = 53;
        }else if (playerPosition == snake[3]){
            System.out.println("Oops Snake bytes!! & Player moves behind \n");
            playerPosition = 9;
        }else {
            System.out.println("No play - Player stays in the same position \n");
        }
        return playerPosition;
    }
}
