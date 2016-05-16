package demo;

public class Triangle extends Area {
  int base;
  int height;
  
  public Triangle(int b, int h) {
    this.base = b;
    this.height = h;
  }

  void calArea() {
    System.out.println("\tArea of triangle is " + (0.5 * base * height) + "mts.");
  }

  void welcome() {
    System.out.println("Welcome to Triangle class.");
  }

  void param() {
    System.out.println("Triangle with base "
        + base + "mts, and height "
        + height + "mts.");
  }

}  // Triangle