import java.util.Scanner;

public class Number_guessing_game {

    public static void main(String[]args){

        int pickedNumber;
        Scanner keyboard;
        int guessedNumber;
        pickedNumber = (int)(Math.random()*100);


        keyboard = new Scanner(System.in);
        System.out.println(pickedNumber);

        System.out.println("Welcome to the number guessing game!");
        System.out.println("This is how things are going to work:");
        System.out.println("I'm going to pick a number between 1 and 100. You have to guess what number I am thinking of.\n You get 4 tries.");
        System.out.println("Got it? Alrighty then, what number am I thinking of?");
            guessedNumber = keyboard.nextInt();
            //first try
            if(guessedNumber==pickedNumber){
                System.out.println("Wow, you actually did it. Good job! Congrats, you won the game.");
            }
            else if(guessedNumber>pickedNumber){
                System.out.println("Nope. You aimed too high. Guess again. You have 3 tries left");
                guessedNumber = keyboard.nextInt();
                //second try
                if(guessedNumber==pickedNumber){
                    System.out.println("Wow, you actually did it. Good job! Congrats, you won the game.");
                }
                else if(guessedNumber>pickedNumber){
                    System.out.println("Nope. You aimed too high. Guess again. You have 2 tries left.");
                    guessedNumber = keyboard.nextInt();
                    //third try
                    if(guessedNumber==pickedNumber){
                        System.out.println("Wow, you actually did it. Good job! Congrats, you won the game.");
                    }
                    else if(guessedNumber>pickedNumber){
                        System.out.println("Nope. You aimed too high. Guess again. This is your last try.");
                        guessedNumber = keyboard.nextInt();
                        //fourth try
                        if(guessedNumber==pickedNumber){
                            System.out.println("Wow, you actually did it. Good job! Congrats, you won the game.");
                        }
                        else if(guessedNumber>pickedNumber){
                            System.out.println("Nope. You lost. Too bad. It was "+pickedNumber+".");
                            guessedNumber = keyboard.nextInt();
                        }
                        else if(guessedNumber<pickedNumber){
                            System.out.println("Nope. You lost. Too bad. It was "+pickedNumber+".");
                            guessedNumber = keyboard.nextInt();
                        }
                    }
                    else if(guessedNumber<pickedNumber){
                        System.out.println("Nope. You aimed too low. Guess again. This is your last try.");
                        guessedNumber = keyboard.nextInt();
                        //fourth try
                        if(guessedNumber==pickedNumber){
                            System.out.println("Wow, you actually did it. Good job! Congrats, you won the game.");
                        }
                        else if(guessedNumber>pickedNumber){
                            System.out.println("Nope. You lost. Too bad. It was "+pickedNumber+".");

                        }
                        else if(guessedNumber<pickedNumber){
                            System.out.println("Nope. You lost. Too bad. It was "+pickedNumber+".");
                        }
                    }
                    }

                }
                else if(guessedNumber<pickedNumber){
                    System.out.println("Nope.dfg You aimed too low. Guess again. You have 3 tries left.");
                    guessedNumber = keyboard.nextInt();

                //second try
                if(guessedNumber==pickedNumber){
                    System.out.println("Wow, you actually did it. Good job! Congrats, you won the game.");
                }
                else if(guessedNumber>pickedNumber){
                    System.out.println("Nope. You aimed too high. Guess again. You have 2 tries left.");
                    guessedNumber = keyboard.nextInt();
                    //third try
                    if(guessedNumber==pickedNumber){
                        System.out.println("Wow, you actually did it. Good job! Congrats, you won the game.");
                    }
                    else if(guessedNumber>pickedNumber){
                        System.out.println("Nope. You aimed too high. Guess again. This is your last try.");
                        guessedNumber = keyboard.nextInt();
                        //fourth try
                        if(guessedNumber==pickedNumber){
                            System.out.println("Wow, you actually did it. Good job! Congrats, you won the game.");
                        }
                        else if(guessedNumber>pickedNumber){
                            System.out.println("Nope. You lost. Too bad. It was "+pickedNumber+".");
                            guessedNumber = keyboard.nextInt();
                        }
                        else if(guessedNumber<pickedNumber){
                            System.out.println("Nope. You lost. Too bad. It was "+pickedNumber+".");
                            guessedNumber = keyboard.nextInt();
                        }
                    }
                    else if(guessedNumber<pickedNumber){
                        System.out.println("Nope. You aimed too low. Guess again. This is your last try.");
                        guessedNumber = keyboard.nextInt();
                        //fourth try
                        if(guessedNumber==pickedNumber){
                            System.out.println("Wow, you actually did it. Good job! Congrats, you won the game.");
                        }
                        else if(guessedNumber>pickedNumber){
                            System.out.println("Nope. You lost. Too bad. It was "+pickedNumber+".");

                        }
                        else if(guessedNumber<pickedNumber){
                            System.out.println("Nope. You lost. Too bad. It was "+pickedNumber+".");
                        }
                    }
                }
                }
                }

            }


            }






        
    }
}
