import java.util.Random;
import java.util.Scanner;
public class testWatersort
{
    static Character red = new Character('r');
    static Character green = new Character('g');
    static Character blue = new Character('b');
    public static void main(String[] args)
    {
        System.out.print("\f");
        StackAsMyArrayList bottle0 = new StackAsMyArrayList<Character>();
        StackAsMyArrayList bottle1 = new StackAsMyArrayList<Character>();
        StackAsMyArrayList bottle2 = new StackAsMyArrayList<Character>();
        StackAsMyArrayList bottle3 = new StackAsMyArrayList<Character>();
        StackAsMyArrayList bottle4 = new StackAsMyArrayList<Character>();
        
        StackAsMyArrayList[] bottles = new StackAsMyArrayList[5];
        bottles[0] = bottle0;
        bottles[1] = bottle1;
        bottles[2] = bottle2;
        bottles[3] = bottle3;
        bottles[4] = bottle4;
        
        mixBottles(bottles);
        
        boolean finished = false;
        int sourceBottle;
        int targetBottle;
        Scanner input = new Scanner(System.in);
        showAll(bottles);
        while (!finished)
        {
            System.out.println("Choose source bottle: ");
            sourceBottle = input.nextInt();
            System.out.println("Choose target bottle: ");
            targetBottle = input.nextInt();
            pour(bottles, sourceBottle, targetBottle);
            showAll(bottles);
            finished = testSolved(bottles);
        }
    }
    
    public static boolean testSolved(StackAsMyArrayList[] bottles)
    {
        int numFullBottles = 0;
        for (int i = 0; i <= 4; i++)
        {
            if ((bottles[i].getStackSize() == 4) && (bottles[i].checkStackUniform() == true))
            {
                numFullBottles++;
            }
        }
        if (numFullBottles == 3)
        {
            System.out.println("Congratulations! You solved the puzzle!");
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void pour(StackAsMyArrayList[] bottles, int sourceBottle, int targetBottle)
    {
        if (sourceBottle > 4 || sourceBottle < 0) 
        {
            System.out.print("Source bottle incorrect index");
            return;
        }
        if(targetBottle > 4 || targetBottle < 0)
        {
            System.out.print("Target bottle incorrect index");
            return;
        }
        
        if ((bottles[targetBottle].getStackSize() == 4) || (bottles[sourceBottle].getStackSize() == 0))
        {
            if (bottles[targetBottle].getStackSize() == 4)
            {
            System.out.println("Target bottle is full.");
            }
            else
            {
                System.out.println("Source bottle is empty.");
            }
        }
        else
        {
            Object colorToPour = bottles[sourceBottle].pop(); 
            bottles[targetBottle].push(colorToPour);
            while ((bottles[sourceBottle].peek().equals(colorToPour) && (bottles[targetBottle].getStackSize() < 4)))
            {
                bottles[targetBottle].push(bottles[sourceBottle].pop());
            }
        }
    }
    
    public static void showAll(StackAsMyArrayList[] bottles)
    {
        System.out.println("___________________________________________");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Bottle " + i + ": " + bottles[i].toString());
        }
    }
    
    public static void mixBottles(StackAsMyArrayList[] bottles)
    {
        Random rand = new Random();
        int redInkLeft = 4; // redColor = 0
        int greenInkLeft = 4; // greenColor = 1
        int blueInkLeft = 4; // blueColor = 2
        for (int bottleIndex = 0; bottleIndex < 3; bottleIndex++) 
        {
            while (bottles[bottleIndex].getStackSize() <= 3)
            {
                int colorNum = rand.nextInt(3);
                if (colorNum == 0 && redInkLeft != 0)
                {
                    bottles[bottleIndex].push('r');
                    redInkLeft--;
                }
                else if (colorNum == 1 && greenInkLeft != 0)
                {
                    bottles[bottleIndex].push('g');
                    greenInkLeft--;
                }
                else if (colorNum == 2 && blueInkLeft != 0)
                {
                    bottles[bottleIndex].push('b');
                    blueInkLeft--;
                }
            }
        }
    }
}


