package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameBoardTest {

    @Test
    void expecteUp_whenPressW(){
        int a = 0;
        int expected = 0;
        int actual = PlayerCharacter.getX(a);
        Assertions.assertEquals(expected, actual);
    }


}
