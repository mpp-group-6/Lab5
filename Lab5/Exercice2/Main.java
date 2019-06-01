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
		figures.add(new Rectangle(2.00, 5.00));
		figures.add(new Triangle(4.00,3.00));
		
		figures.stream().
		forEach(
				figure -> 
					System.out.println("Area of "+ figure.getClass()+"  area : "+String.format("%.2f",figure.computeArea())+"\n" ));
		
		Double sumArea = figures.stream().
				mapToDouble(figure -> figure.computeArea()).sum();
		
		System.out.println("Sum of figures' area : "+String.format("%.2f", sumArea));
	}

}
