# Problem Set 3: Writing a real Java class
## Due Thursday, January 31, 11:59pm EST

This problem set will give you the opportunity to pratice your Java syntax while creating and using a Java class. 

---
### Reminders
If your code does not compile, you will get a 0. Don't submit code that doesn't compile! One way to avoid ending up with code a program that you can't get to compile is to re-compile often. Every time you write a few lines that ought to compile, re-compile. 

For instance, in this program you'll start by writing a construtor. Write it (about 4 lines), then compile. Keep fixing it until it compiles. Then try it out in the `main()` method by creating a `Team` object. Work on it until it compiles. Then move onto the next task, ensuring each time that it compiles before proceeding to the following task.

Finally, don't forget to write comments in your code. I will gladly give you partial credit for code that doesn't do exactly what it's supposed to do if you write comments explaining what you did and why.


### Part 1: Create a `Team` class
In the `src` directory, you will see a file called `Team.java`. **You will be modifying this file so look at it as you read this description.** This is a class that contains information (variables) and behaviors (methods) associated with a team that plays some sport. `Team` has the following instance variables:

```java
String city;
String mascot;
int wins;
int losses;
```

`Team` also has one static variable, `MAX_GAMES`, which is set to 25. I will explain how to use this in the `main()` method, below.

Here are your tasks:

1. Write a constructor that will create an instance of `Team` and will initialize the four instance variables. In the `Team.java` file, I have provided some of the code for the constructor, along with some helpful comments. You will fill in the rest.

2. Write getters and setters for each of the four instance variables. Look at the example code I provided in `Car.java` and in the Java appendix in the book for hints about how to write getters and setters.

3. Write an instance method called `play()`. The method will be called by an instance of the class and it will take as an argument a different instance of the class. Its return type will be `boolean`. I have provided some of the code for you, along with some comments.

    To simulate one team playing another, you will use `Math.random()` to generate a random number. If the random number is less than or equal to 0.5, the team who called the method wins. Otherwise the team who is the argument wins. 
  
    The method will do the following after deciding the winner: (1) Print out a message stating the winner and the loser (e.g., "The Springfield Humidifiers beat the Worcester Inhalers!"). (2) Using the setters, increment the winning team's `wins` variable by 1 and increment the losing team's `losses` variable by 1. (3) Return true if the calling `Team` won and return false if the argument `Team` won.

4. Write a `main()` method that tests your code as follows. Again, some of the code you need is in the `Team.java` file:
  * Read in the first command-line argument as an integer representing how many game should be played.
  * Make sure that it is less than the static variable `MAX_GAMES`. If it is more than `MAX_GAMES`, you will end the program by throwing this exception:
  ```java
  throw new IllegalArgumentException("Too many games requested.");
  ```
  * Create an empty ArrayList of String objects. This will store the winner of each game in a series.
  * Create a Team object with whatever city and mascot you wish.
  * Create a second Team object with whatever city and mascot you wish.
  * Play that many games between the two teams. (Hint: use a for loop!) After each game, add the name of the winner (i.e., the city + mascot) to the Array List.
  * After the desired number of games, announce how many games each team won.
  


