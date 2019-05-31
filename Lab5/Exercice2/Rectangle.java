/**
 * 
 */
package Lab5.Exercice2;

/**
 * @author pogoromuald
 *
 */
public final class Rectangle implements Figure {
	
	final double width;
	
	final double length;
	
	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width*length;
	}
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	
}
