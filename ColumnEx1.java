class ColumnEx1{

public static void main(String args[]){
/*DONE ON:6TH FEB 2024
 //making a multiplication table
 for(int i=1;i<=10;i++){
 for(int j=1;j<=10;j++){
 //System.out.println("multiplication table");
 System.out.print(i*j+" ");
 }
 System.out.println("\n");
 }//end of for loop
 
  //making a multiplication table
 for(int i=1;i<=10;i++){
 for(int j=1;j<=10;j++){
 //System.out.println("rectangle");
 System.out.print("r"+" ");
 }
 System.out.println("\n");
 }//end of for loop
 
//making a triangle shape
 for(int i=1;i<=10;i++){
 for(int j=1;j<=i;j++){
  //System.out.println("triangle");
 System.out.print("t"+" ");
 }
 System.out.println("\n");
 }//End of for loop
 
 for(int i=1;i<=10;i++){
 for(int j=10;j>=i;j--){
 //System.out.println("Inverted Triangle");
 System.out.print("It"+" ");
 }
 System.out.println("\n");
 }//end of for loop
 */

 /*A program to print integer numbers from 1 to 100 in columns of 10
 Date:13th February 2024 
 Author:Mr.Kamau*/
 for(int i=1;i<=100;i++){
 System.out.print(i+"  ");
  if(i%10 ==0)
  /* if 10/10 is equal to 0, then an new line is printed
  Can be adjusted for any value, e.g. if you run it using i%9, the value will start from
  1 to 9, then next line print from 10 to 18
  */
  {
  System.out.println("\n");
  }//end of if statement
 }//end of for loop
 
}//end of public(main)
}//end of class