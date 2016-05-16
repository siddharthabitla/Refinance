package demo;

public abstract class Area {
  void newline() {
    System.out.println();
    System.out.println("+------------------+------------------+");
    System.out.println();
  }
  abstract void welcome();
  
  abstract void calArea();
  
  abstract void param();
}  // Area