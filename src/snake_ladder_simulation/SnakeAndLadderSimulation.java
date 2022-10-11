//This is a Snake and Ladder game simulation program.
//Single player is playing.He starts the game from zero.
//He is rolling the die to get a number.
//He is checking for an option, whether it is a No play, Ladder or Snake.

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
        Random random = new Random();
        System.out.println("Starting Position of the Single Player is : "+startingPosition+"\n");

        startsGame(playerPosition,ladder,snake,random);
    }
    //Starts the game.
    public static void startsGame(int playerPosition, int[] ladder, int[] snake, Random random) {
        //Rolling the die.
        int dieRolls = (random.nextInt(6) + 1);
        System.out.println("The Player rolls the die and gets a number : " + dieRolls+"\n");
        playerPosition = playerPosition + dieRolls;
        int position = checkOption(playerPosition, ladder, snake);
        playerPosition = position;
        System.out.println("Player current position is : " + playerPosition+"\n");
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
