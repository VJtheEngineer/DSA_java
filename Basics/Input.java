
 
import java.util.*;

public class Input
{
	public static void main(String[] args) {
	    //input and output
        
	    Scanner scn = new Scanner(System.in);
	    
        String str1 = scn.next();
 
        System.out.println("Entered String str1 : " + str1);
 
        String str2 = scn.next();
 
        System.out.println("Entered String str2 : " + str2);
 
        int x = scn.nextInt();
 
        System.out.println("Entered Integer : " + x);
 
        float f = scn.nextFloat();
 
        System.out.println("Entered FloatValue : " + f);
	}
}
