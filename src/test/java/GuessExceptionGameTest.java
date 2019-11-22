import org.testng.annotations.Test;

public class GuessExceptionGameTest {

//    @Test
//    public void testShowQuestion() {
//        //Given
//        GuessExceptionGame quessExceptionGame = new GuessExceptionGame();
//
//        //When
//
//        //Then
//        assertThat(quessExceptionGame.showQuestion() , "test");
//    }
    @Test
    public void gameStart()
    {
        GuessExceptionGame guessExceptionGame = new GuessExceptionGame();
        guessExceptionGame.showQuestion();
        guessExceptionGame.setUserAnswer();
        guessExceptionGame.showResult();
    }

}
