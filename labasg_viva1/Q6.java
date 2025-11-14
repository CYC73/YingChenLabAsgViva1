package labasg_viva1;

import java.util.Random;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total=0;
        int act = 0;
        int actDay=0;
        for(int i =1;i<=7;i++)
        {
            System.out.print("Enter steps for Day " + i + " : ");
            int steps = s.nextInt();
            if(steps<0 || steps > 50000)
            {
                System.out.println("Invalid input! Please enter a number between 0 and 50000");
                break;
            }        
            if(steps>act)
            {
                actDay = i;
                act = steps;
            }
            total +=steps;
        }
        double avg =(double)total/7;
        
        System.out.println("Total Steps This Week: " + total);
        System.out.printf("Average Daily Steps: %.2f \n" , avg);
        System.out.printf("Most active day: Day %d with %d steps\n",actDay ,act);
        if(total<40000)
        {
            System.out.println("You can do better, small steps daily make a big difference");
        }
        else if(total<=69999)
        {
            System.out.println("Good job! Keep pushing for consistency!");     
        }
        else
        {
            System.out.println("Amazing! You’re smashing your goals!");
        }
        
        Random r = new Random();
            int tips = r.nextInt(3);
            switch(tips)
            {
                case 0: 
                    System.out.println("Tip of the Day: Stay hydrated and stretch after walks!\n");
                    break;
                case 1:
                    System.out.println("Tip of the Day: Remember to cool down after exercises.\n");
                    break;
                case 2: 
                    System.out.println("Tip of the Day: Remember to wear a pair of suitable sport shoes before running.\n");
                    break; 
            }
    }     
    
}


