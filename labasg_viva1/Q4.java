package labasg_viva1;

import java.util.Random;
import java.util.Scanner;


public class Q4 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a non-negative number 0-20: ");
        int num = s.nextInt();
        
        if (num < 0 || num >20)
        {
            System.out.println("Invalid input! Please enter a number between 0 and 20");            
        }
        else
        {
            long fac = 1;
            for(int i = 1; i <= num;i++ )
            {
                fac *= i;
            }
            System.out.printf("Factorial of %d is %d \n" , num, fac);
            System.out.print("Choose mode (1-Combinatorics, 2-Security, 3-Game): ");
            int mode = s.nextInt();
            switch(mode)
            {
                case 1: 
                    System.out.println("In Combinatorics Mode: There are "+ fac + " of ways to arrange " + num + " unique items.");
                    break;
                case 2: 
                    System.out.println("In Security Mode: You can create "+ fac + " unique password combinations using " + num + " characters.");
                    break;
                case 3: 
                    System.out.println("In Game Mode: There are "+ fac + " unique levels can be made from " + num + " elements.");
                    break;
                default:
                    System.out.println("Invalid input, only 1-3");
                    break;
            }
            
            Random r = new Random();
            int tips = r.nextInt(3);
            switch(tips)
            {
                case 0: 
                    System.out.println("Tip of the Day: Factorials grow very fast; optimize your code for efficiency!");
                    break;
                case 1:
                    System.out.println("Tip of the Day:Factorials grow very fast, just as your knowledge.");
                    break;
                case 2: 
                    System.out.println("Tip of the Day:Factorials grow very fast, just as your path to suceed as well.");
                    break;
            }
           
                   
        }
        
        
            

    }
    
}
