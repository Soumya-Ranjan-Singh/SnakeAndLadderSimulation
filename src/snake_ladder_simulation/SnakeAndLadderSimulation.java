//This is a Snake and Ladder game simulation program.
//Single player is playing.He starts the game from zero.
//He is rolling the die to get a number.
//He is checking for an option, whether it is a No play, Ladder or Snake.
//Repeat to roll the die till the player reaches to the winning position 100.
//Repeat to roll the die till the player reaches to the exact winning position 100.
//Report the no of times the dice was played to win the game and also the position after every die roll.
//Playing this game with two players and finding out the winner.

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

        String p1 = "Player 1";
        String p2 = "Player 2";
        int count1 = getCount(p1, startingPosition, playerPosition, winningPosition, count, ladder, snake, random);
        int count2 = getCount(p2, startingPosition, playerPosition, winningPosition, count, ladder, snake, random);
        System.out.println();
        System.out.println(p1+" having dice count : "+count1);
        System.out.println(p2+" having dice count : "+count2);

        //Comparing and finding the winner.
        if (count1 > count2)
            System.out.println(p2+" is the winner.");
        else if (count2 > count1)
            System.out.println(p1+" is the winner.");
        else if (count1 == count1)
            System.out.println("Match Draw.");

    }

    public static int getCount(String player, int startingPosition, int playerPosition, int winningPosition, int count, int[] ladder, int[] snake, Random random) {
        count = startsGame(player, startingPosition, playerPosition, winningPosition, count, ladder, snake, random);
        return count;
    }

    //Starts the game.
    public static int startsGame(String player, int startingPosition, int playerPosition, int winningPosition, int count, int[] ladder, int[] snake, Random random) {
        System.out.println("Starting Position of the "+player+" is : "+startingPosition+"\n");
        do {
            //Rolling the die.
            int dieRolls = (random.nextInt(6) + 1);
            count++;
            System.out.println(player+" rolls the die and gets a number : " + dieRolls + "\n");
            playerPosition = playerPosition + dieRolls;
            int position = checkOption(player, playerPosition, ladder, snake);
            playerPosition = position;
            System.out.println(player+" current position is : " + playerPosition + "\n");
            if (playerPosition > winningPosition)
            {
                playerPosition -= dieRolls;
                System.out.println("Position goes beyond 100.\nSo no play - "+player+" stays in the same position \n");
                System.out.println(player+" current position is : " + playerPosition + "\n");
                System.out.println("The number required by the "+player+" is : "+(winningPosition-playerPosition)+"\n");
            }
        }while(playerPosition != winningPosition);
        System.out.println(player+" reaches the exact winning position. \n");
        System.out.println("The number of times the dice was rolled is : "+count+"\n");
        return count;
    }
    //Check for the options.
    public static int checkOption(String player, int playerPosition, int[] ladder, int[] snake) {
        if (playerPosition == ladder[0])
        {
            System.out.println("Hurray gets Ladder!! & "+player+" moves ahead \n");
            playerPosition = 12;
        } else if (playerPosition == ladder[1]) {
            System.out.println("Hurray gets Ladder!! & "+player+" moves ahead \n");
            playerPosition = 45;
        } else if (playerPosition == ladder[2]) {
            System.out.println("Hurray gets Ladder!! & "+player+" moves ahead \n");
            playerPosition = 80;
        } else if (playerPosition == ladder[3]) {
            System.out.println("Hurray gets Ladder!! & "+player+" moves ahead \n");
            playerPosition = 95;
        } else if (playerPosition == ladder[4]) {
            System.out.println("Hurray gets Ladder!! & "+player+" moves ahead \n");
            playerPosition = 93;
        }  else if (playerPosition == snake[0]) {
            System.out.println("Oops Snake bytes!! & "+player+" moves behind \n");
            playerPosition = 10;
        }else if (playerPosition == snake[1]){
            System.out.println("Oops Snake bytes!! & "+player+" moves behind \n");
            playerPosition = 32;
        }else if (playerPosition == snake[2]){
            System.out.println("Oops Snake bytes!! & "+player+" moves behind \n");
            playerPosition = 53;
        }else if (playerPosition == snake[3]){
            System.out.println("Oops Snake bytes!! & "+player+" moves behind \n");
            playerPosition = 9;
        }else {
            System.out.println("No play - "+player+" stays in the same position \n");
        }
        return playerPosition;
    }
}
