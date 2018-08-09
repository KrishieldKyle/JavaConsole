
package banana;

import java.util.Scanner;


public class RemoveDistinc {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Enter String: ");
        String str= scan.nextLine();
        String copy ="";
       
        for(int x=0; x<str.length(); x++)
        {
               if(str.charAt(x)!=' ')
               {
                   copy+=str.charAt(x);
                   str = str.replaceAll(str.charAt(x)+"", " ");
               }
        }
        System.out.println("Output: "+copy);
    }//main
    
}//class
