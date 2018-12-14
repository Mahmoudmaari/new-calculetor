package mahmoud.maari.calculetor2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{ private static Scanner in = new Scanner (System.in);
    public static void main( String[] args )
    {
    	boolean run = true, stop = false;
    	
    	while (run) {
    		double num1, num2, result;
    		
    		result = 0;
    		System.out.println("put your opretor");
    		String op = getInput();	
    		
    		System.out.println("first number");
    		num1 = getValidNumber();
    		
    		System.out.println("second number");
    		num2 = getValidNumber();
    		
    		
    		switch (op) {
    		
    		case "+" : result = num1 + num2; 
    		break;
    		case "-" : result = num1 - num2; 
    		break;
    		case "*" : result = num1 * num2; 
    		break;
    		case "/" : if (num1 == 0 || num2 == 0) {
    			result = 0;
    		}else {
    			result = num1 / num2;
    		}
    		break;
    		
    		
    		}
    		
    		
    		System.out.println ( num1 + op + num2 + "=" + result);
    	
    	
    	System.out.println("press (y) to continue or press any key to end");
		String op1 = getInput();	
    		switch (op1) {
    		case "Y"  :
    		case "y" : run = true;
    		break;
    		default : run = false;
    		System.out.println("good bye");
    		}
    	
    	}
    	
    
    
    }
   
 
   

   public static String getInput() {
   	return in.nextLine();
   }
   
   public static double getValidNumber() {
   	boolean valid = false;
   	double number = 0;
   	while(!valid) {
   		try {
       		number = Double.parseDouble(getInput());
       		valid = true;
       	}catch(NumberFormatException e) {
       		System.out.println("You did not enter a valid number");
       	}
   	}
   	return number;    	
   }
 
    
    
  
    
    
    
  	  
    
}
