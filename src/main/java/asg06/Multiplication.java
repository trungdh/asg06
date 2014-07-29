package asg06;

public class Multiplication extends BinaryExpression {
	
	private Expression left;
	private Expression right;
	
	public Multiplication(Expression left, Expression right){
		this.left = left;
		this.right = right;
	}
	
	public Expression left(){
		return left;
	}
	
	public Expression right(){
		return right;
	}
	
	public String toString() {
		String s = String.format("%s * %s", left.toString(),right.toString());
		return s;
	}

	public int evaluate() {
		return left.evaluate() * right.evaluate();
	}
}