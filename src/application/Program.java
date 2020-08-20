package application;

import java.util.*;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<Shape>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		Color color; 
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle(r/c)? ");
			char option = sc.next().charAt(0);
			
			switch (option) {
			
			case 'r':
			
				System.out.print("Color (BLACK/BLUE/RED)?: ");
				color = Color.valueOf(sc.next());
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));	
				break;
				
			case 'c': 
			
				System.out.print("Color (BLACK/BLUE/RED)?: ");
				color = Color.valueOf(sc.next());
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				break;
			
			default: 
				System.out.println("Invalid Option! ");
				--i;
				break;
				
			}	
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape x: list) {
			System.out.println(String.format("%.2f", x.area()));
		}
		
		sc.close();
	
	}
}