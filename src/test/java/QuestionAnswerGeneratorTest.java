import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class QuestionAnswerGeneratorTest {

    @Test
    public void testGetResultWithCorrectAnswer() {
        //Given
        QuestionAnswerGenerator questionAnswer = new QuestionAnswerGenerator(new QuestionAnswer("IOException" , "Exception"));
        //When
        questionAnswer.setAnswer("Exception");
        //Then
        assertEquals(questionAnswer.getResult() , "Poprawna odpowiedź wyjątek IOException należy do grupyException");
    }

    @Test
    public void testGetResultWithIncorrectAnswer() {
        //Given
        QuestionAnswerGenerator questionAnswer = new QuestionAnswerGenerator(new QuestionAnswer("IOException", "Exception"));
        //When
        questionAnswer.setAnswer("RuntimeException");
        //Then
        assertEquals(questionAnswer.getResult() , "Nie poprawna odpowiedź IOException nie należy do grupy Exception");
    }

    @Test
    public void testGetResultWithoutAnswer() throws IOException {
        //Given
        QuestionAnswerGenerator questionAnswer = QuestionAnswerGenerator.withRandom();
        //When

        //Then
        assertEquals(questionAnswer.getResult() , "Nie podałeś odpowiedzi");
    }

}
