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
    this.city = city;
    this.mascot = mascot;
    wins = 0;
    losses = 0;
  }

  // GETTERS
  // Write 4 getters, one for each instance variable.
  String getCity() {
    return this.city;
  }
  String getMascot() {
    return this.mascot;
  }
  int getWins(){
    return this.wins;
  }
  int getLosses() {
    return this.losses;
  }


  // SETTERS
  // Write 4 setters, one for each instance variable.
  void setCity(String city){
    this.city = city;
  }
  void setMascot(String mascot) {
    this.mascot = mascot;
  }
  void setWins(int wins) {
    this.wins = wins;
  }
  void setLosses(int losses) {
    this.losses = losses;
  }


  // PLAY METHOD
  // Write an instance method called play() as follows.
  boolean play(Team t2) {
    // Here's the random number you need to determine who wins.
    double randNum = Math.random();
    if(randNum <= 0.5) {
      this.setWins(this.getWins() + 1);
      t2.setLosses(t2.getLosses() + 1);
      return true;
    }
    else {
      t2.setWins(t2.getWins() + 1);
      this.setLosses(this.getLosses() + 1);
      return false;
    }

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
    int numGames = Integer.parseInt(args[0]);
    if(numGames > MAX_GAMES){
      throw new IllegalArgumentException("Too many games requested.");
    }



    // Here's an ArrayList of strings to keep track of who one each game.
    ArrayList<String> results = new ArrayList<String>();

    // Create two Team objects using your constructor.
    Team GS_Warriors = new Team("Bay Area", "Warriors");
    Team Boston_Celtics = new Team("Boston", "Celtics");


    // Have them play each other as many times as specified by the
    // command line argument. Each time they play, add the name of the
    // winner (city + mascot) to the ArrayList results.
    for(int i = 0; i < numGames; i++){
      boolean outcome = GS_Warriors.play(Boston_Celtics);
      if(outcome == true) {
        results.add("Golden State Warriors (" + GS_Warriors.getCity() + ", " + GS_Warriors.getMascot() + ")");
      }
      else {
        results.add("Boston Celtics (" + Boston_Celtics.getCity() + ", " + Boston_Celtics.getMascot() + ")");
      }

    }

    for(String t:results){
      System.out.println("Game: " + t);
    }




    // After the desired number of games, use a for-each loop with the
    // ArrayList to print out the name of the winning team for each game.
    System.out.println("Golden States Warriors Wins: " + GS_Warriors.getWins());
    System.out.println("Golden States Warriors Losses: " + GS_Warriors.getLosses());
    System.out.println("Boston Celtics Wins: " + Boston_Celtics.getWins());
    System.out.println("Boston Celtics Losses: " + Boston_Celtics.getLosses());

    if(GS_Warriors.getWins() > Boston_Celtics.getWins()){
      System.out.println("The Warriors win the series!");
    }

    else{
      System.out.println("The Celtics win the series!");
    }
    }

    // Using the getters for the wins and losses instance variables,
    // print out the record of wins and losses for each team.


    // Print out which team won the whole series.


  }
