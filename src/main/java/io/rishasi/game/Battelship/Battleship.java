package io.rishasi.game.Battelship;

public class Battleship {
    int[] locationCells;
    int numOfHits = 0;

    public void cellLocations(int[] location){
        locationCells = location;
    }

    public String checkAttempt(String userGuess){

        int guess = Integer.parseInt(userGuess);
        String result = "miss";

        for(int cell : locationCells){
            if(guess == cell){
                numOfHits++;
                result = "hit";
                break;
            }
        }

        if(numOfHits == locationCells.length){
            result = "kill";
        }

        return result;
    }
}
