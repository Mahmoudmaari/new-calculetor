package mahmoud.maari.calculetor2;

import java.util.Scanner;

public class Cases {
Scanner sc = new Scanner(System.in);
Scanner in = new Scanner(System.in);
Scanner ins = new Scanner(System.in);
	public void cases() {
		boolean run = false,math=true;
		
		double r=0;
		while (math) {
		do {
		Calcouletor result = new Calcouletor(Num1(), op(), Num2(),r);
		String op = result.getOp();
		double num1 = result.getNum1();
		double num2 = result.getNum2();
		switch(op) {
		case "+":
			result.add(num1, num2, r);
			System.out.println(result);
			math=true;
			break;
		case"-":
			result.sub(num1, num2, r);
			System.out.println(result);
			break;
		case "*":
			result.malt(num1, num2, r);
			System.out.println(result);
			break;
		case "/":
			result.deva(num1, num2, r);
			System.out.println(result);
			break;
			default:
				System.out.println("Not valid oparetion");
		}
		}while(run);
		System.out.println("Press (y) to continue or any key to end");
		String answer;
		switch (answer=ins.nextLine()) {
		case "y": 
			math =true;
			run=true;
			break;
		default:
			math=false;
			System.out.println("good bye");
		}
		}
		}
				
		
		
		
	
	
	public double Num1() {
		double d;
		System.out.println("But the first number");
		return d= sc.nextDouble();
	}
	public String op() {
		String o ;
		System.out.println("but the operator");
		return o =in.nextLine();
	}
	public double Num2() {
		double d;
		System.out.println("But the second number");
		return d= sc.nextDouble();
	}
	
}