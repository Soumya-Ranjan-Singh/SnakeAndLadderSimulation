//This is a Snake and Ladder game simulation program.
//Single player is playing.He starts the game from zero.
//He is rolling the die to get a number.

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
        Random random = new Random();
        System.out.println("Starting Position of the Single Player is : "+startingPosition+"\n");

        startsGame(random);
    }

    public static void startsGame(Random random) {
        //Rolling the die.
        int dieRolls = (random.nextInt(6) + 1);
        System.out.println("The Player rolls the die and gets a number : " + dieRolls + "\n");
    }
}
