package demo;

public class Rectangle extends Area {
  int length;
  int bredth;

  public Rectangle(int l, int b) {
    this.length = l;
    this.bredth = b;
  }
  
  void calArea() {
    System.out.println("\tArea of rectangle is " + (length * bredth) + "mts.");
  }  // calArea()

  void welcome() {
    System.out.println("Welcome to Rectangle class.");
  }

  void param() {
    System.out.println("Rectangle with length "
        + length + "mts, and bredth "
        + bredth + "mts.");
  }

}  // Rectangle
