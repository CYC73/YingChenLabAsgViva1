package labasg_viva1;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true) {
            System.out.print("Customer type: ");
            String type = s.nextLine().trim();
            
            if(type.equals("0")) 
            {
                System.out.println("Exit");
                break;
            }
            
            if(!type.equalsIgnoreCase("residential") && !type.equalsIgnoreCase("commercial")) 
            {
                System.out.println("Invalid choice! Please type either residential or commercial.\n");
                continue;
            }

            double liters = 0;
            do 
            {
                System.out.print("Enter liters: ");
                liters = s.nextDouble();
                s.nextLine();
                
                 if(liters < 0 || liters > 50000) 
                {
                    System.out.println("Invalid input! Please enter a number between 0 and 50000.\n");
                }
            }
            while(liters < 0 || liters > 50000);
            

            double sum = 0;
            if(type.equalsIgnoreCase("residential")) 
            {
                if(liters <= 1000) 
                {
                    sum = liters * 0.02;
                } 
                else if(liters <= 5000) 
                {
                    sum = liters * 0.05;
                } 
                else 
                {
                    sum = liters * 0.08;
                }
            } 
            else 
            { 
                if(liters <= 10000) 
                {
                    sum = liters * 0.06;
                } 
                else 
                {
                    sum = liters * 0.10;
                }
            }

            System.out.println("\nCustomer Type: " + type);
            System.out.printf("Water Usage: %.2f \n", liters);
            System.out.printf("Total Bill: RM%.2f \n", sum);
            System.out.println("Thank you for conserving water!\n");
        }
        
        
    }
}
