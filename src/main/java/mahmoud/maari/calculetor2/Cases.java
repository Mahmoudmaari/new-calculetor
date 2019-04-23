package mahmoud.maari.calculetor2;

import java.util.Scanner;

public class Cases {
	Scanner sc = new Scanner(System.in);
	Scanner in = new Scanner(System.in);
	Scanner ins = new Scanner(System.in);

	public void cases() {
		boolean run = false, math = true;
		while (math) {
			do {
				Calcouletor result = new Calcouletor();
				info(result);
				String op = result.getOp();
				double num1 = result.getNum1();
				double num2 = result.getNum2();
				switch (op) {
				case "+":
					result.add(num1, num2);
					run = true;
					break;
				case "-":
					result.sub(num1, num2);
					run = true;
					break;
				case "*":
					result.malt(num1, num2);
					run = true;
					break;
				case "/":
					result.deva(num1, num2);
					run = true;
					break;
				default:
					System.out.println("Not valid oparetion");
					run = true;
				}
				System.out.println(result);
			} while (!run);
			System.out.println("Press (y) to continue or any key to end");
			String answer= ins.nextLine();
			switch (answer ) {
			case "y":
				math = true;
				run = true;
				break;
			default:
				math = false;
				System.out.println("good bye");
			}
		}
	}

	public void info(Calcouletor result) {
		System.out.println("But the first number");
		double num1 = sc.nextDouble();
		System.out.println("but the operator");
		String op = in.nextLine();
		System.out.println("But the second number");
		double num2 = sc.nextDouble();

		result.setNum1(num1);
		result.setOp(op);
		result.setNum2(num2);
	}

}
