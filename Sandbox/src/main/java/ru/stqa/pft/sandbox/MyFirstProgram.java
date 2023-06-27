package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
	hello();

  System.out.println( 72855000 / 900);

  Square s = new Square(6);
  System.out.println("Square with length " + s.l + " = " + s.area());

  Rectangle r = new Rectangle(4, 8);
    System.out.println("rectangle with lengths " + r.a + " and " + r.b + " = " + r.area ());

	}

  public static void hello() {
    System.out.println("Hello, world!");
  }

}