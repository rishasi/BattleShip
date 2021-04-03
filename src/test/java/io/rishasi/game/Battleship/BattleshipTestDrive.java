package io.rishasi.game.Battleship;

import io.rishasi.game.Battelship.Battleship;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattleshipTestDrive {

    public int[] locations = {2,3,4};

    @Test
    void shouldCheckHit(){
        Battleship myGame =  new Battleship();
        myGame.cellLocations(locations);
        String userGuess = "2";
        String expected = "hit";
        String actual = myGame.checkAttempt(userGuess);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCheckKill(){
        Battleship myGame =  new Battleship();
        myGame.cellLocations(locations);
        myGame.checkAttempt("2");
        myGame.checkAttempt("3");
        String actual = myGame.checkAttempt("4");
        String expected = "kill";
        assertEquals(expected, actual);
    }
}
