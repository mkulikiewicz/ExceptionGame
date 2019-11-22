import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class QuestionAnswerTest {
    @Test
    public void testToString() {
        //Given
        QuestionAnswer question = new QuestionAnswer("Exception" , "Group");
        //Then
        assertEquals(question.toString(), "Do jakiej grupy należy wyjątek: Exception ?");
    }
}
