package asg06;

public class Subtraction extends BinaryExpression{
	Expression left, right;
	public Subtraction(Expression left, Expression right){
		this.left = left;
		this.right = right;
	}
	public Expression left(){
		return left;
	}
	
	public Expression right(){
		return right;
	}
	public String toString(){
		String s = String.format("(%s - %s)", left.toString(),right.toString());
		return s;
	}
	public int evaluate(){
		return left.evaluate() - right.evaluate();
	}
}