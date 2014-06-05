package codigo;

public class Sumar {

	private int num1=0;
	private int num2=0;
	
	
	public Sumar(int num1,int num2){
		this.num1=num1;
		this.num2=num2;	
	}
	
	public Sumar(){
		this.num1=2;
		this.num2=0;
		
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int suma(){
		return this.num1+this.num2;
	}
	
	public int resta(){
		return this.num1-this.num2;
	}
	
	public int multiplica(){
		return this.num1*this.num2;
	}
	
}
