/**
 * 
 */
package Lab5.Exercice2;

import java.util.*;
import java.util.List;

/**
 * @author pogoromuald
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Figure> figures = new ArrayList<Figure>();
		figures.add(new Circle(4.00));
		figures.add(new Rectangle(2.00, 3.00));
		figures.add(new Triangle(4.00,3.00));
		Double sumArea = figures.stream().mapToDouble(figure -> figure.computeArea()).sum();
		
		System.out.println("Sum of figures' area : "+String.format("%.2f", sumArea));
	}

}
