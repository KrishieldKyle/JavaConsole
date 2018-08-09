
package banana;

import java.util.Scanner;


public class CountLetters {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter String: ");
        String input = scan.nextLine();
        
        input = input.replaceAll(" ", "");
        
        int [] counter = new int[26];
        
        
            for(int y=0; y<26; y++)
            {
               counter[y]=0;
            }
        char abc='a';
        
        for(int x=0; x<input.length(); x++)
        {
            for(int y=0; y<26; y++)
            {
                if(input.charAt(x)==abc++)
                {
                    counter[y]++;
                }
            }
            abc='a';
        }
        abc='A';
        System.out.println("");
        System.out.println("OUTPUT");
        for(int x=0; x<26; x++)
        {
            System.out.println((abc++)+": "+counter[x]);
        }
    }//main
    
}//class
