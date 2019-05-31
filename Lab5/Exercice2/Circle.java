/**
 * 
 */
package Lab5.Exercice2;

/**
 * @author pogoromuald
 *
 */
public final class Circle implements Figure {
	
	final Double radius;
	
	public Circle(Double radius) {
		this.radius = radius;
	}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
	public Double getRadius() {
		return radius;
	}
	

}
