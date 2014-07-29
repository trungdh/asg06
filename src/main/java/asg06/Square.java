package asg06;

public class Square extends Expression{
	Expression expression;
	public Square(Expression expression){
		this.expression = expression;
	}
	public String toString(){
		String s = String.format("%s^%d", expression.toString(),2);
		return s;
	}
	public int evaluate(){
		return expression.evaluate()*expression.evaluate();
	}
}