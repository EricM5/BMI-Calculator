import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    System.out.print("Please enter your first name: ");
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();
    System.out.println();
    System.out.print("Enter your height in feet: ");
    int height = in.nextInt();
    System.out.print("Enter the remaining inches of your height: ");
    int inches = in.nextInt();
    System.out.print("Enter your weight in pounds: ");
    int weight = in.nextInt();
    System.out.println();
    //height in inches
    double totalheight = height * 12;   
    /*
    BMI
    */
    double firstpart = (weight * 704);
    double secondpart = (totalheight + inches) * (totalheight + inches);
    double bmi = firstpart / secondpart;
    double totalbmi = Math.round(bmi * 10000)/ 10000.00;
    System.out.println(name + " your BMI is: " + totalbmi );
  }
}