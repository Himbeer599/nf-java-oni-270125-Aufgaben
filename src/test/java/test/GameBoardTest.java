package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameBoardTest {

    @Test
    void expecteNull_whenGetX(){
//        int a = 0;
        int expected = 0;
        int actual = PlayerCharacter.getX();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expecteNull_whenGetY(){
//        int a = 0;
        int expected = 0;
        int actual = PlayerCharacter.getY();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void expecteTrue_whenMoveW(){
//        int a = 0;
        String str= "W";
        boolean expected = true;
        boolean actual = PlayerCharacter.move(str);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expecte_whenMoveW(){
//        int a = 0;
        int expected = 0;
        int actual = PlayerCharacter.getX();
        Assertions.assertEquals(expected, actual);

        expected = 0;
        actual = PlayerCharacter.getY();
        Assertions.assertEquals(expected, actual);

        String str= "W";
        boolean expectedmove = true;
        boolean actualmove = PlayerCharacter.move(str);
        Assertions.assertEquals(expectedmove, actualmove);

        expected = 1;
        actual = PlayerCharacter.getY();
        Assertions.assertEquals(expected, actual);
    }



}
