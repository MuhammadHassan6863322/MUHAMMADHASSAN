
package onlinelabtask2;

import java.util.Scanner;

public class OnlineLabtask2 {
    
      public static int cbinary(int num) {

        if (num == 0) {
            return 0;
        } 
        else {
            
            int d;
            d=num % 2 + 10*cbinary(num / 2);
                        
            
            return d;
        }
      }
   
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a_num;
        System.out.println("Please enter a number that you want to convert into binary :");

        a_num = s.nextInt();
        System.out.println(cbinary(a_num));
    }
    
}
