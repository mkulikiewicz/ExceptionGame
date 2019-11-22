import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

class QuestionAnswerGenerator {

    private String userAnswer;
    QuestionAnswer questionAnswer;

    QuestionAnswerGenerator(QuestionAnswer questionAnswer) {
        this.questionAnswer = questionAnswer;

    }

    void setAnswer(String answer) {
        userAnswer = answer;
    }

    String getResult() {
        if (userAnswer == null) {
            return "Nie podałeś odpowiedzi";
        }
        if (userAnswer.equals(questionAnswer.getAnswer())) {
            return "Poprawna odpowiedź wyjątek " + questionAnswer.getQuestion() + " należy do grupy " + questionAnswer.getAnswer();
        } else {
            return questionAnswer.getAnswer() + "!!!!" +" do tej grupy należy wyjątek "+questionAnswer.getQuestion();
        }
    }

    static QuestionAnswerGenerator withRandom() throws IOException {
        GetExceptionFromFile getExceptionFromfile = new GetExceptionFromFile("src/main/resources/exception.csv");
        HashMap<String, String> map = getExceptionFromfile.getMap();

        Collection<String> keySet = map.keySet();
        String randomExceptionName = keySet.stream().skip(ThreadLocalRandom.current().nextInt(keySet.size())).findFirst().get();
        String exceptionGroup = map.get(randomExceptionName);

        return new QuestionAnswerGenerator(new QuestionAnswer(randomExceptionName, exceptionGroup));
    }

    void showQuestion() {
        System.out.print(questionAnswer.toString());
    }
}
