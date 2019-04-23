package mahmoud.maari.calculetor2;

public class Calcouletor {
	
	private double num1;
	private double num2;
	private String op;
	private double result;
	
	public Calcouletor(double num1, String op, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	public Calcouletor() {}
	
	public double add(double num1,  double num2) {
	 return result = num1+num2;
	}
	public double sub(double num1,  double num2) {

		return result = num1-num2;
		}
	public double malt(double num1,  double num2) {
		
		return result=num1*num2;
		}
	public double deva(double num1,  double num2) {

		
		if ( num1 == 0 || num2 ==0) {
			return result = 0;
		}else {
			return result = num1/num2;
		}
		}
	@Override
	public String toString() {
		return   num1 +" "+ op +" "+ num2 + " = " + result ;
	
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public double getResult() {
		return result;
	}
	public double setResult(double result) {
		return this.result = result;
	}
	
	

}
