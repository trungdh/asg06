package asg06;

import asg06.Addition;
import asg06.Expression;
import asg06.Numeral;
import asg06.Square;
//import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;

/*
 * Created with IntelliJ IDEA.
 * User: chauttm
 * Date: 10/19/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestExpression {
    @Test
    public void testNumeralEvaluate() {
        Expression two = new Numeral(2);
        assertEquals(2, two.evaluate());
    }

    @Test
    public void testNumeralToString() {
        Expression two = new Numeral(2);
        assertEquals("2", two.toString());
    }

    @Test
    public void testSquareEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals(4, twoSquare.evaluate());
    }

    @Test
    public void testSquareToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals("2^2", twoSquare.toString());// nhu thang nay no so sah chuoi string mau vs chuoi string tra ve cua minh ne
    }

    @Test
    public void testAdditionEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals(6, twoPlusTwoSquare.evaluate());
    }
    @Test
    public void testAdditionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals("(2 + 2^2)", twoPlusTwoSquare.toString());
    }

    @Test
    public void testAdditionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Addition(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 + 1)^2", theBigSquare.toString());// ham assertEquals chi tra ve gia tri true or false khi so sanh thoi no cho biet pass test hay ko
    }
	@Test
	public void testMultiplication(){
		Expression left = new Numeral(2);
		Expression right = new Numeral(3);
		Expression towMulti = new Multiplication(left,right);
		assertEquals(6,towMulti.evaluate());
	}
	@Test
	public void testSubtraction(){
		Expression left = new Numeral(6);
		Expression right = new Numeral(2);
		Expression towSubtraction = new Subtraction(left,right);
		assertEquals(4,towSubtraction.evaluate());
	}
}
