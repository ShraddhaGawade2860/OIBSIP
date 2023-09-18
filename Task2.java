import java.util.Scanner;
import java.util.Random;
class Task2
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Random random = new Random(); //Random function for system to take random number

int min=1; //starting value
int max=100; //ending value
int num = random.nextInt(max - min + 1) + min; //formula for random number

int guess=6; 
int i=0;
int score=0;

System.out.println("1.Start the game \n2.Exit");
System.out.print("Enter your choice:");
int choice=sc.nextInt();

if(choice == 1)
{
System.out.println("A number is chosen" + " between 1 to 100." + "\nGuess the number" + " within 6 guesses.");

while (i < guess) {
            System.out.print("Enter your guess: ");
            int input = sc.nextInt();
            i++;

       if(num==input)  //user find perfect number
         { 
            System.out.println("Congratulations!" + " You guessed the number.");
            score = guess-i+1; //finding score by how many gusses found
            System.out.println("Your score: " + score);
            break; //if condition get true stop the program
          }
                  
                else if(num>input && i!=guess-1)
                       {
                          System.out.println("The number is " + "greater than " + input);
                       }

                else if(num<input && i!=guess-1)
                       {
                          System.out.println("The number is " + "less than " + input);
                       }


        if (i == guess) //if all count of guesses will complete stop it
           {
			System.out.println("You have exhausted your " + guess +" trial.");
			System.out.println("The number was " + num);
           }

}
}

else if(choice == 2)
{
System.exit(0);
}

else
{
System.out.println("Invalid Choice");
}
}
}
