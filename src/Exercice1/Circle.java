package Exercice1;

public class Circle {
	
	public int rayon;
	
	public double getArea() {
		double area = Math.PI * Math.pow(rayon, 2);
		
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * rayon;
		
		return perimeter;
	}
	

}
