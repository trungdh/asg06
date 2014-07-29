package asg06;

public class Numeral extends Expression{
	int value;
	public Numeral(int value){
		this.value = value;
	}
	public String toString(){
		String s = String.format("%d", value);
		return s;
	}
	public int evaluate(){
		return value;
	}

}