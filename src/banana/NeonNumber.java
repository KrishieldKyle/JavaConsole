
package banana;

import java.util.Scanner;


public class NeonNumber {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int input = scan.nextInt();
        int copy = input;
        
        int mul=input*input;
        
        String copymul=mul+"";
        int finall=0;
        if(copymul.length()>1)
        {
            for(int x=0; x<copymul.length(); x++)
            {
                finall+= Integer.parseInt(copymul.charAt(x)+"");
            }
            if(finall==input)
            {
                System.out.println(input+" is a Neon number");
            }
            else
            {
                System.out.println(input+" is NOT a Neon number");
            }
        }
        else
        {
            if(mul==input)
            {
                System.out.println(input+" is a Neon number");
            }
            else
            {
                System.out.println(input+" is NOT a Neon number");
            }
        }
        
        
        
        
        
        
        
    }//main 
    
}//class
