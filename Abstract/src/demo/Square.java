package demo;

public class Square extends Area {
  int side;
  
  Square(int s) {
    this.side = s;
  }

  void calArea() {
    System.out.println("\tArea of square is " + (side * side) + "mts.");
  }

  void welcome() {
    System.out.println("Welcome to Square class.");
  }

  void param() {
    System.out.println("Square with side " + side + "mts.");
  }

}
