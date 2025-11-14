package labasg_viva1;

import java.util.Random;
import java.util.Scanner;


public class Q5 {

    public static void main(String[] args) {
        while(true)
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter spacecraft name: ");          
            String name = s.nextLine();
            if(name.equalsIgnoreCase("STOP")) {
                System.out.println("End.");
                break;
            }
            System.out.print("Enter distance traveled(in km): ");
            double dis = s.nextDouble();
            if(dis <=0)
            {
                System.out.println("Invalid input! Distance and fuel must be positive numbers");
                continue;

            }
            System.out.print("Enter fuel used (liters): ");
            double fuel = s.nextDouble();
            if(fuel <=0)
            {
                System.out.println("Invalid input! Distance and fuel must be positive numbers");    
                continue;
            }

            System.out.println("Select spacecraft type (1-Rocket, 2-Shuttle, 3-Probe): ");
            int type = s.nextInt();


            System.out.println("Spacecraft: " + name);
            switch(type)
            {
                case 1: 
                    System.out.println("Type: Rocket");
                    break;
                case 2:
                    System.out.println("Type: Shuttle");
                    break;
                case 3: 
                    System.out.println("Type: Probe");
                    break;
                default:
                    System.out.println("No types above are chosen");
                    break;


            }
            double eff = dis/fuel;
            System.out.println("Fuel efficiency: "+ eff + "km/l");
            if(eff<5)
            {
                System.out.println("Performance: Needs improvement! High fuel consumption.");
            }
            else if(eff <=10)
            {
                System.out.println("Performance: Good performance! Efficient mission.");   
            }
            else
            {
                System.out.println("Performance: Outstanding performance! Minimal fuel usage.");
            }
            
            Random r = new Random();
            int tips = r.nextInt(3);
            switch(tips)
            {
                case 0: 
                    System.out.println("Mission Tip: Always monitor fuel ratios before takeoff!\n");
                    break;
                case 1:
                    System.out.println("Mission Tip: Make sure all parts are in good condition.\n");
                    break;
                case 2: 
                    System.out.println("Mission Tip: Make sure you are mentally prepared for the launch.\n");
                    break;               
            }
        }
    }
    
}



