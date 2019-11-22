import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class GetExceptionFromFileTest {



    @Test
    public void testGetMap() throws IOException {
        //Given
        GetExceptionFromFile getExceptionFromFile = new GetExceptionFromFile("src/main/resources/exception.csv");
        //When

        //Then
        assertEquals(getExceptionFromFile.getMap().size(), 83);
    }


}
