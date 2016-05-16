package demo;

public class Circle extends Area {
  double radius;
  
  Circle(double rad) {
    this.radius = rad;
  }

  void calArea() {
    System.out.println("\tArea of circle is " + (3.14 * radius * radius) + "mts.");
  }

  void welcome() {
    System.out.println("Welcome to Circle class.");
  }

  void param() {
    System.out.println("Circle with radius " + radius + "mts.");
  }

}  // Circle