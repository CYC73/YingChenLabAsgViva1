package labasg_viva1;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] binary = new String[20];    
        int[] decimals = new int[20];       
        int[] eO = new int[20];           
        int count = 0;                      

        System.out.println("Enter binary code (type 'STOP' to finish):");

        while(count < 20) {
            String bi = s.nextLine();

            if(bi.equalsIgnoreCase("STOP")) {
                break;
            }
            
            boolean value = true;
            for(int i = 0; i < bi.length(); i++) {
                char c = bi.charAt(i);
                if(c != '0' && c != '1') {
                    System.out.println("Invalid value, only 0 and 1 allowed");
                    value = false;
                    break;
                }
            }
            
            if(!value)
            {
                continue;
            }

            int dec = 0;
            for(int i = 0; i < bi.length(); i++) {
                char c = bi.charAt(bi.length() - 1 - i);
                if(c == '1') {
                    dec += Math.pow(2, i); 
                }
            }

            binary[count] = bi;
            decimals[count] = dec;
            if(dec % 2 == 0) 
            {
                eO[count] = 0;  
            } 
            else 
            {
                eO[count] = 1;  
            }
            count++;
        }

        int sumIM = 0;
        int sumCA = 0;
        int iMCount = 0;
        int cACount = 0;

        for(int i = 0; i < count; i++) {
            if(eO[i]==0) {
                System.out.printf("Code %s -> Decimal %d -> Iron Man's Team\n", binary[i], decimals[i]);
                sumIM += decimals[i];
                iMCount++;
            } else {
                System.out.printf("Code %s -> Decimal %d -> Captain America's Team\n", binary[i], decimals[i]);
                sumCA += decimals[i];
                cACount++;
            }
        }

        if(iMCount > 0) {
            System.out.printf("Iron Man Team: %d codes | Average Power: %.2f\n", iMCount, (double)sumIM / iMCount);
        } else {
            System.out.println("Iron Man Team: 0 codes | Average Power: 0");
        }

        if(cACount > 0) {
            System.out.printf("Captain America Team: %d codes | Average Power: %.2f\n", cACount, (double)sumCA / cACount);
        } else {
            System.out.println("Captain America Team: 0 codes | Average Power: 0");
        }

        System.out.println("Mission Accomplished: Message Decrypted! ");
    }
}
