/**
 * 
 */
package Lab5.Exercice2;

/**
 * @author pogoromuald
 *
 */
public final class Triangle implements Figure {
	
	final Double base;
	
	final Double height;
	
	public Triangle(Double base, Double height) {
		this.height = height;
		this.base = base;
	}
	
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return height*base/2;
	}

	public Double getBase() {
		return base;
	}

	public Double getHeight() {
		return height;
	}


}
