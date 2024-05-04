<h1>Magical Arena</h1>
<h2>Overview</h2>

The Magical Arena is a Java project that brings thrilling battles between players to life. Each player possesses unique attributes, including health, strength, and attack, which significantly impact their performance during these magical duels.The player dies if his health attribute touches 0


<h2>To Run the Project</h2>

To experience the magic firsthand, follow these steps:

1. Clone or download the project repository to your local machine.
2. Open the project in your preferred Java IDE (such as Eclipse or IntelliJ IDEA).
3. Locate the MagicalArena.java file in the project structure.
4. Run the main() method in MagicalArena.java to initiate a match between two players.
5. Follow the prompts or input the required parameters to simulate thrilling battles in the Magical Arena.

<h1>File Structure and TestCases Explained Below</h1>

<h2>MagicalArena.java</h2>

The MagicalArena.java file serves as the main entry point for the Magical Arena application. It orchestrates matches between players and determines the winner based on the outcome of the battle. 

<h3>Main Method</h3>

The main method initializes two player objects with static data (health, strength, and attack attributes) and creates a match between them using the Match class. After simulating the match, it calls the getMatchResult method to determine the winner and prints the result.

<h3>getMatchResult Method</h3>

The getMatchResult method takes two player objects as parameters and calculates the result of the match. It considers various scenarios such as both players being defeated, one player winning, or the match ending in a draw based on the health attributes of the players.

<h3>Dynamic Input (Commented Out)</h3>

The file includes commented-out code that allows for dynamic input of player attributes via user interaction with the console. This feature enables users to customize player attributes before initiating a match.

<h2>Match.java</h2>

The Match.java file contains the implementation of the Match class, responsible for managing battles between two players in the magical arena.

<h3>Constructor</h3>

The Match class has a constructor that initializes a match between two players. It determines the initial attacker and defender based on their health attributes. The player with lower health becomes the attacker, and the other becomes the defender.

<h3>fight() Method </h3>

The fight() method simulates the progression of the match until one of the players' health drops to 0 or below. Inside a loop, it rolls dice for attack and defense using a random number generator. It calculates attack and defense damages based on dice rolls and player attributes. The net damage is then deducted from the defender's health. The loop continues until one of the players is defeated.

This class ensures that battles between players are simulated accurately, taking into account their attributes and random factors such as dice rolls. It plays a crucial role in determining the outcome of matches in the magical arena.


<h2>Player.java</h2>

The Player.java file defines the attributes and behavior of a player in the magical arena.

<h3>Attributes</h3>

health: Represents the health points of the player.
strength: Denotes the strength attribute of the player, used for defense.
attack: Indicates the attack attribute of the player, used for inflicting damage on the opponent.

<h3>Constructor</h3>

The Player class has a parameterized constructor that initializes a player object with specific values for health, strength, and attack. It sets the initial values of the player's attributes based on the parameters passed to the constructor.

<h3>Getter and Setter Methods</h3

The class provides getter and setter methods for accessing and modifying the player's attributes. These methods ensure encapsulation and allow other classes to interact with player objects safely.

This class serves as the foundation for creating player objects with customizable attributes, crucial for participating in battles within the magical arena.





<h1>Test Cases</h1>
<h2>MagicalArenaTest.java</h2>

The MagicalArenaTest.java file contains unit tests to verify the functionality of the getMatchResult method in the MagicalArena class. This method determines the outcome of matches between two players in the magical arena.

<h3>Unit Tests</h3>

The testGetMatchResult_PlayerAWins() method tests the scenario where Player A wins the match by inflicting more damage than Player B.

The testGetMatchResult_PlayerBWins() method tests the scenario where Player B wins the match by inflicting more damage than Player A.

The testGetMatchResult_Draw() method tests the scenario where the match ends in a draw due to both players having equal health and attributes.

The testGetMatchResult_PlayerAWithHigherHealth_Wins() method tests the scenario where Player A wins the match due to having higher health than Player B, despite their attributes being lower.

The testGetMatchResult_PlayerBWithHigherHealth_Wins() method tests the scenario where Player B wins the match due to having higher health than Player A, despite their attributes being lower.

The testGetMatchResult_PlayerAAndBWithSameHealth_Draw() method tests the scenario where the match ends in a draw due to both players having equal health, even though their attributes may differ.

These unit tests ensure that the getMatchResult method behaves correctly under various scenarios, accurately determining the winner or declaring a draw based on the players' attributes and health.


<h2>MatchTest.java</h2>

The MatchTest.java file contains a unit test that validates the behavior of the fight method in the Match class. This method simulates battles between two players in the magical arena and determines the outcome based on their health and attributes.

<h3>Unit Test</h3>

The fight_PlayerHealthAboveZero_PlayerShouldWin() method tests the scenario where both players start with health above zero, and at least one of them should emerge as the winner.

It creates two players, player1 and player2, with specific attributes for health, strength, and attack.

Then, it initiates a match between the two players using the Match class.

The fight method of the Match class simulates the battle between the players, deducting health points based on their attributes and random dice rolls.

After simulating the match, the unit test verifies the outcome by checking the health of the players.

If player1's health drops to 0 or below, player2 should win the match. Otherwise, player1 should win the match.

The assertFalse assertion is used to ensure that the health of the winning player is not less than or equal to 0, indicating that they have won the match.

This unit test ensures that the fight method accurately determines the winner of a match where both players start with health above zero. It helps validate the correctness and reliability of the battle simulation logic in the Match class.

<h2>PlayerTest.java</h2>

The PlayerTest.java file contains a unit test that verifies the creation of Player objects and ensures that their attributes are initialized correctly.

<h3>Unit Test</h3>

The testPlayerCreation() method initializes a Player object with specific values for health, strength, and attack.

It creates a Player object named 'player' with initial attributes: health = 100, strength = 10, and attack = 5.

Then, it uses assertions to validate that the attributes of the player object are initialized correctly:

- assertEquals is used to check if the health attribute is set to 100.
- assertEquals is used to verify that the strength attribute is set to 10.
- assertEquals is used to ensure that the attack attribute is initialized to 5.

Each assertion includes a descriptive message to clarify the purpose of the check.

This unit test ensures that the Player class constructor initializes player objects with the correct attribute values. It helps ensure the correctness and reliability of the Player class, which is crucial for the functioning of other components that interact with Player objects.

<h2>Thank You</h2>
