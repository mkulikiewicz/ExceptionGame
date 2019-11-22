import java.io.IOException;
import java.util.Scanner;

class GuessExceptionGame {

    QuestionAnswerGenerator actualQuestion;
    private int score;

    GuessExceptionGame() {
    }

    private void generateQuestion() {
        try {
            actualQuestion = QuestionAnswerGenerator.withRandom();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void showQuestion() {
        generateQuestion();
        actualQuestion.showQuestion();
        System.out.println("\n");
        showScore();
    }

    private void showScore() {

    }


    void setUserAnswer() {
        String answer = new Scanner(System.in).next();
        if (answer.equals("1")) {
            actualQuestion.setAnswer("Error");
        } else if (answer.equals("2")) {
            actualQuestion.setAnswer("CheckException");
        } else if (answer.equals("3")) {
            actualQuestion.setAnswer("RuntimeException");
        } else {
            actualQuestion.setAnswer(answer);
        }


    }

    void showResult() {
        System.out.println(actualQuestion.getResult() + "\n\n");
    }

    void showChooseAnswerOption() {
        System.out.println("[1]Error [2]Exception [3]RuntimeException");
    }
}
