public class AppMain {

    public static void main(String[] args) {
        GuessExceptionGame guessExceptionGame = new GuessExceptionGame();
        guessExceptionGame.showQuestion();
        guessExceptionGame.showChooseAnswerOption();
        guessExceptionGame.setUserAnswer();
        guessExceptionGame.showResult();
        main(args);
    }
}
