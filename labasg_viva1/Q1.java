package labasg_viva1;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter hours studied: ");
        double hoursStud = s.nextDouble();
        if(hoursStud <0 ||hoursStud>24 )
        {
            System.out.println("Invalid value. Please enter correctly between 0-24 hours only");
        }
        System.out.print("Enter hours slept: ");
        double hoursSlept = s.nextDouble();
        if(hoursSlept <0 ||hoursSlept>24 )
        {
            System.out.println("Invalid value. Please enter correctly between 0-24 hours only");
        }
        System.out.print("Enter number of breaks: ");
        int numOfBreaks = s.nextInt();
        if(numOfBreaks <0 ||numOfBreaks >10 )
        {
            System.out.println("Invalid value. Breaks are allowed from 0 to maximum 10 times only");
        }
        double score = (hoursStud * 10) - ((hoursSlept)+ (numOfBreaks * 2));
        System.out.println("your productivity score is " +score);
        if(score>60)
        {
            System.out.println("Excellent, keep up the great work!"); 
        }
        else if(score<=60 && score>=30)  
        {
            System.out.println("Good effort, but balance your breaks");
        }
        else
        {
            System.out.println("Try to plan your day better!");
        }
        
        Random r = new Random();
        int num = r.nextInt(3);
        switch(num)
        {  
            case 0:
                System.out.println("Tip of your day: Revise your notes before sleeping.");
                break;
            case 1:
                System.out.println("Tip of your day: Work smart not work hard.");    
                break;
            case 2:
                System.out.println("Tip of your day: Start to do something instead of preparing to do so.");  
                break;
        }  
                
    }
    
}
