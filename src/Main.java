import java.util.Scanner;

public class Main {
  //Menu
  //1.Draw the triangle
  //2.Draw the square
  //3.Draw the rectangle
  //4.Exit
  //Enter your choice:
  public static void main(String[] args) {
    hien();
  }

  static void hien() {
    System.out.println("-------Menu-------");
    System.out.println("1.Draw the triangle");
    System.out.println("2.Draw the square");
    System.out.println("3.Draw the rectangle");
    System.out.println("4.Exit");
    switch (nhap()) {
      case 1:
        drawTriangle();
        break;
      case 2:
        drawSquare();
        break;
      case 3:
        drawRectangle();
        break;
      case 4:
        System.out.println("Exited !!!");
        break;
      default:
        System.out.println("Nhap lai !!!");
        hien();
    }
  }

  static int nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your choice: ");
    int number = scanner.nextInt();
    return number;
  }

  static void drawTriangle() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap chieu cao cua tam giac: ");
    int h = scanner.nextInt();
    for (int i = h; i > 0; i--) {
      for (int j = i; j <= h; j++) {
        System.out.print(" * ");
      }
      System.out.print("\n");
    }
  }

  static void drawSquare() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap canh cua vuong: ");
    int h = scanner.nextInt();

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < h; j++) {
        System.out.print(" * ");
      }
      System.out.print("\n");
    }
  }

  static void drawRectangle() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap chieu rong cua vuong: ");
    int w = scanner.nextInt();
    System.out.println("Nhap chieu dai cua vuong: ");
    int h = scanner.nextInt();
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        System.out.print(" * ");
      }
      System.out.print("\n");
    }
  }
}
