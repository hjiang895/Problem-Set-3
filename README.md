# Problem Set 3: Writing a real Java class
## Due Thursday, January 31, 11:59pm EST

This problem set will give you the opportunity to pratice your Java syntax while creating and using a Java class. 

---

### Part 1: Create a Team class
In the `src` directory, you will see a file called `Team.java`. **You will be modifying this file so look at it now.** This is a class that contains information (variables) and behaviors (methods) associated with a team that plays some sport. A team has the following instance variables:

```java
String city;
String mascot;
int wins;
int losses;
```

Here are your tasks:
1. Write a constructor that will create an instance of `Team` and will initialie the four instance variables. The constructor will have this declaration, which you can also see in the `Team.java` file:

```java
```

2. Write getters and setters for each of the four instance variables. Look at the example code I provided in `Car.java` and in the Java appendix in the book for hints about how to write getters and setters.

3. Write a method called `play()`. The method will be called by an instance of the class and it will take as an argument a different instance of the class. Its return type will be `boolean`. 

  To simulate one team playing another, you will use `Math.random()` to generate a random number. If the random number is less than .5, the team who called the method wins. Otherwise the team who is the argument wins. 
  
   The method will do the following after deciding the winner: (1) Print out a message stating the winner. (2) Using the setters, increment the winning team's `wins` variable by 1 and increment the losing team's `losses` variable by 1. (3) Return true if the calling Team won and return false is the argument Team won.
   
 4. Write a `main()` method that tests your code as follows:
 

4. Write a `main()` method that will 


Part 2: Extend the Team class