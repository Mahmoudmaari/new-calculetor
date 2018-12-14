package mahmoud.maari.calculetor2;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{

	private static Scanner in = new Scanner (System.in);
	private static Scanner um = new Scanner (System.in);
	
	
    public static void main( String[] args )
    
    {
    	boolean com = true;
    	double result = 0;
    	
        System.out.println("put operator");
    	String operator = in.nextLine();
    	
    	System.out.println("first number");
    	double num1 = in.nextDouble();
    	
    	System.out.println("second number");
    	double num2 = in.nextDouble();
    	
    	
    	switch(operator) {
    	case"+":result= num1+ num2;
    	break;
    	case"-":result= num1-num2;
    	break;
    	case"*":result= num1* num2;
    	break;
    	case"/":
    		if (num1 == 0 || num2 ==0) {
        		result =0 ;
        	}else {
        		result= num1/ num2;
        	}
    		
    		break;
    	default:System.out.println("      " + "("+operator+")" + "  Error put right operator");}
    	System.out.println(result); 
    	

    	System.out.println("press any key");
    	String com1 = um.nextLine();
    	
    	switch (com1) {
    	case "n":com = false;
    	default :
    	
    	
        System.out.println("good bye");
    	}
  	}
}


	
	
    	
    		
		
    	
