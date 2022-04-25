package Classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLibraryTest {

    private TestLibrary testLibrary;

    @BeforeEach
    void setUp() {
        testLibrary = new TestLibrary();
    }

    @Test
    @DisplayName("The numbers should be odds")
    public void oddsArray_oddInt_NewArrayCreated(){
        int n = 10;
        int[] testArray = {1,3,5,7,9};
        assertArrayEquals(testArray, testLibrary.oddsArray(n));
        int n1 = 7;
        int[] testArray1 = {1,3,5,7};
        assertArrayEquals(testArray1, testLibrary.oddsArray(n1));
    }

    @Test
    @DisplayName("Returns true if the String contains any Java Keywords")
    public void testKeywords_phraseString_shouldReturnFalse(){
        String phrase = "Don't break my heart";
        assertEquals(true, testLibrary.testKeywords(phrase));

    }

    @Test
    @DisplayName("should reduce the number of lives by one and restore the player’s health to its original state")
    public void livesSubtract_twoPlayers_returnSetPlayer(){
            Player player = new Warrior("Gwo",100,200,5,50);

            assertArrayEquals(new int[]{4,100}, testLibrary.livesSubtract(player));

    }

    @Test
    @DisplayName("the attacked player’s health should decrease by the attacking player’s strength")
    public void attack_playerPlayer_returnSetPlayer(){
        Player player1 = new Warrior("Gwo",200,200,5,50);
        Player player2 = new Elf("Neared",150,180,4,70);

        assertEquals(20, testLibrary.attack(player1,player2));

    }

}