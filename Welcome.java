/*
This is a block comment
code written by:Wamuyu
Date: 16th January 2024
This is the first code that I have ever written in Java
*/
import java.util.Scanner;
//A program must always start with class in Java
class Welcome{
// the second line is important and used in every java program - indicates that everything inside the function is to be excecuted
public static void main(String []args){
//1.printing out statements
System.out.println("Welcome to Java Programming language\n What a wonderful programming language");
System.out.println("Oh LORD, I thank you and praise you most sincerely that you gave me brains that can do programming in Java");
System.out.println("Wow! A programming language that is able to:\n 1.Write secure programs\n 2.Writes stable programs and more");

//2. Using basic arithmetic operations
//Example:calculating the area and perimeter of a rectangle


short l=100;
short w=50;

int a= l*w;
int p= 2*(l+w);
System.out.println("Perimeter of the rectangle is\t"+ p +"\nand its area is\t"+ a);

//making the example above more interactive by fetching input from the keyboard
//achieved by scanner class -> gives methods that can read data from the keyboard
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value of the length");
l=scan.nextShort();
System.out.println("Enter the value of the width");
w=scan.nextShort();
a= l*w;
p= 2*(l+w);
System.out.println("Perimeter of the rectangle is\t"+ p +"\nand its area is\t"+ a);



}//End of main function

}//end of class
