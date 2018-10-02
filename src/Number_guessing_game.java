import java.util.Scanner;

public class Number_guessing_game {

    public static void main(String[] args) {
        //==========|
        //||        |
        //||        0
        //||      --+--
        //||        |
        //||      _/ \_
        //||

        //    GAME OVER.


        //If(hangedMan==1){
        // System.out.println("
        //hangMan++;


        int pickedNumber;
        Scanner keyboard;
        int guessedNumber;
        pickedNumber = (int) (Math.random() * 100);
        boolean value = true;
        int hangedMan = 0;


        keyboard = new Scanner(System.in);

        System.out.println(pickedNumber);

        System.out.println("Welcome to the Hanged Man game!");
        System.out.println("This is how things are going to work:");
        System.out.println("I'm going to pick a number between 1 and 100.\nWhat you have to do is guess what number I am thinking of.\nFor each try you get incorrect, a piece of the Hanged Man will appear.");
        System.out.println("Once the man is completed, the man is hung and you lose.\nGot it?\nAlrighty then, what number am I thinking of?");
        guessedNumber = keyboard.nextInt();


        while (value) {

            if (guessedNumber != pickedNumber) {
                System.out.println(printMan(hangedMan, false, guessedNumber, pickedNumber));
                guessedNumber = keyboard.nextInt();

            }

            if (hangedMan > 6) {
                value = false;
                System.out.println(printMan(hangedMan, false, guessedNumber, pickedNumber));

            }
            if (guessedNumber == pickedNumber) {
                System.out.println(printMan(hangedMan, true, guessedNumber, pickedNumber));
                value = false;
            }
            hangedMan++;

        }
    }

    public static String printMan(int tries, boolean win, int guessedNumbeer, int pickedNumbers){
        String response = "";
        String message;
        if (win) {
            message = "That is unbelievable. You WIN!";
        } else {
            if (guessedNumbeer > pickedNumbers) {
                message = "You are too high.";
            } else {

                message = "You are too low!";
            }
        }


        switch (tries) {


            case 0:
                Scanner keyboard;
                keyboard = new Scanner(System.in);
                String reset;

                response = "==========|\n" +
                        "||        \n" +
                        "||        \n" +
                        "||          \n" +
                        "||        \n" +
                        "||      \n" +
                        "||\n"
                        +message
                        ;

                break;
            case 1:
                response =
                        "==========|\n" +
                                "||        |\n" +
                                "||        0\n" +
                                "||          \n" +
                                "||        \n" +
                                "||      \n" +
                                "||\n" +
                                "\n" +
                                message+
                                " Guess again.";
                break;
            case 2:
                response =
                        "==========|\n" +
                                "||        |\n" +
                                "||        0\n" +
                                "||        +  \n" +
                                "||        \n" +
                                "||      \n" +
                                "||\n" +
                                "\n" +
                                message+
                                " Guess again.";
                break;
            case 3:
                response =
                        "==========|\n" +
                                "||        |\n" +
                                "||        0\n" +
                                "||        +  \n" +
                                "||        |\n" +
                                "||       \n" +
                                "||\n" +
                                "\n" +
                                message+
                                " Guess again.";
                break;
            case 4:
                response =
                        "==========|\n" +
                                "||        |\n" +
                                "||        0\n" +
                                "||        +  \n" +
                                "||        |\n" +
                                "||      _/ \n" +
                                "||\n" +
                                "\n" +
                                message+
                                " Guess again.";
                break;
            case 5:
                response =
                        "==========|\n" +
                                "||        |\n" +
                                "||        0\n" +
                                "||        +  \n" +
                                "||        |\n" +
                                "||      _/ \\_\n" +
                                "||\n" +
                                "\n" +
                                message+
                                " Guess again.";
                break;
            case 6:
                response =

                        "==========|\n" +
                                "||        |\n" +
                                "||        0\n" +
                                "||      --+\n" +
                                "||        |\n" +
                                "||      _/ \\_\n" +
                                "||\n" +
                                "\n" +
                                message+
                                " Guess again.";
                break;
            case 7:
                response =


                        "==========|\n" +
                                "||        |\n" +
                                "||        0\n" +
                                "||      --+--\n" +
                                "||        |\n" +
                                "||      _/ \\_\n" +
                                "||\n"+
                                "\n\n GAMEOVER"
                ;
                break;
            default:
                break;
        }
        return response;
    }
}
