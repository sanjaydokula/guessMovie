package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {
    // write your code here
    public static void main (String[] args)throws Exception {
                // write your code here
                File file = new File("movies.txt");
                Scanner scanner = new Scanner(file);
                String words = "";
                String  movie = "";
                String line;
                int numberOfMovies = 0;
                while (scanner.hasNextLine()) {
                    line = scanner.nextLine();
                    movie += (line + "\n");
                    numberOfMovies++;
                }
                System.out.println(numberOfMovies);
                int randomNumber;
                randomNumber = (int)(Math.random() * numberOfMovies);
                System.out.println(randomNumber);
                int i=0;
                String  selectedMovie = "";
                Scanner scanner1 = new Scanner(movie);
                while ( i<=randomNumber) {
                    selectedMovie = scanner1.nextLine();
                    i++;
                }
                char [] toGuessMovie;
                toGuessMovie = selectedMovie.toCharArray();
       /* for( i =0;i<selectedMovie.length();i++){

            System.out.print(toGuessMovie[i]);
        }*/
        Game game = new Game();
        game.startGame(toGuessMovie);

            }
        }


