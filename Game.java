package com.company;


import java.util.Scanner;

public class Game {
    int i=0;
   public boolean isSame(int k,char guess, char[] toGuessMovie){
       boolean same = false;
        for ( i = k; i <toGuessMovie.length ; i++) {
            if (guess == toGuessMovie[i] ) {
                same = true;
                break;
            }
            else {
                same = false;
            }
        }
       return same;
   }
    boolean isEnd(char [] hiddenMovie,char[] toGuessMovie){
       boolean hasWon = false;
        for (int j = 0; j < toGuessMovie.length; j++) {

            if(toGuessMovie[j] == hiddenMovie[j]){
                hasWon = true;
            }
            else{
                hasWon = false;
            }
        }
       return hasWon;
    }
    void startGame(char[] toGuessMovie){
        char [] hiddenMovie= new char[toGuessMovie.length];// = toGuessMovie;
        for(int i=0;i<toGuessMovie.length;i++){
            hiddenMovie[i] = '-';
        }
        char[] guess;
        Scanner scanner2 = new Scanner(System.in);
        for(int j=0;j<10;j++){
            System.out.println("Guess an alphabet:");
            guess = scanner2.next().toCharArray();
           // System.out.println(guess[0]);
           // System.out.println(toGuessMovie);
            for( i=0;i<toGuessMovie.length;i++){
                if(isSame(i,guess[0],toGuessMovie)){
                  //  System.out.println("jj");
                      hiddenMovie[i] = guess[0];
                }
                // System.out.println(hiddenMovie[i]);

            }
            System.out.println("You have " + (10-j-1) + "guesses left." );
            if ( i == toGuessMovie.length) {

                if (isEnd(hiddenMovie,toGuessMovie)){
                    break;
                }
            }
            for(int k=0;k<toGuessMovie.length;k++){
                System.out.print(hiddenMovie[k]);

            }
        }
        System.out.println(toGuessMovie);
        if (isEnd(hiddenMovie,toGuessMovie)) {
            System.out.println("You won!!!");
        }else{
            System.out.println("You lost.");
        }


    }
}
