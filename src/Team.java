import java.util.ArrayList;
import java.util.Random;

class Team {

  /* --------------------------
     ------- VARIABLES --------
     -------------------------- */

  // STATIC VARIABLE
  static int MAX_GAMES = 25;

  // INSTANCE VARIABLES
  String city;
  String mascot;
  int wins;
  int losses;


  /* ------------------------
     ------- METHODS --------
     ------------------------ */

  // CONSTRUCTOR
  Team(String city, String mascot) {
    // Set the values of the instance variables here.
    // city and mascot should be set using the above parameters.
    // wins and losses should be set to 0.

  }

  // GETTERS
  // Write 4 getters, one for each instance variable.


  // SETTERS
  // Write 4 setters, one for each instance variable.


  // PLAY METHOD
  // Write an instance method called play() as follows.
  boolean play(Team t2) {
    // Here's the random number you need to determine who wins.
    double randNum = Math.random();

    // Write an if-else statement to determine who wins.
    // If randNum <= 0.5, the calling team (this) wins.
    // Otherwise the argument team, t2, wins. Within the if-else:
    // * Incremement each team's wins or losses variable.
    // * Return true if the calling team wins, otherwise false.

  }

  /* ------------------------
     ------- MAIN METHOD ----
     ------------------------ */

  // MAIN() METHOD
  public static void main (String[] args) {
    // Read in the first command line argument as an int.
    // If it is larger than the static variable MAX_GAMES,
    // quit the program by throwing an exception.
    // This is the code you can insert after the if-condition:
    // throw new IllegalArgumentException("Too many games requested.");


    // Here's an ArrayList of strings to keep track of who one each game.
    ArrayList<String> results = new ArrayList<String>();

    // Create two Team objects using your constructor.


    // Have them play each other as many times as specified by the
    // command line argument. Each time they play, add the name of the
    // winner (city + mascot) to the ArrayList results.


    // After the desired number of games, use a for-each loop with the
    // ArrayList to print out the name of the winning team for each game.


    // Using the getters for the wins and losses instance variables,
    // print out the record of wins and losses for each team.


    // Print out which team won the whole series.


  }

}
