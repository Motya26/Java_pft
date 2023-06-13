package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
	hello();

  double len = 5;
  System.out.println("Square with length " + len + " = " + area (len));

    double a = 4;
    double b = 6;
    System.out.println("reqtangle with lengths " + a + " and " + b + " = " + area (a, b));
	}

  public static void hello() {
    System.out.println("Hello, world!");
  }
public static double area (double l) {
    return l * l;
}
  public static double area (double a, double b) {
    return a * b;
  }
}