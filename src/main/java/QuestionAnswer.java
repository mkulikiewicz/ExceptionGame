import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class QuestionAnswer {

    private String exception;
    private String exceptionGroup;

    QuestionAnswer(String exception, String exceptionGroup) {
        this.exception = exception;
        this.exceptionGroup = exceptionGroup;
    }

    @Override
    public String toString() {
        return "Do jakiej grupy należy wyjątek: "+exception+" ?";
    }

    String getQuestion() {
        return exception;
    }

    String getAnswer() {
        return exceptionGroup;
    }
}
