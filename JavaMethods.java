import java.util.Scanner;//importing the scanner class
class JavaMethods{
//DECLARING THE METHODS
public static int Area(int a, int b){
return a*b;
}//end of Area Method
public static int Perimeter(int a, int b){
return 2*(a+b);
}//end of Perimeter Method

//declaring the Volume and Surface Area Method
public static void Volume(double r,double h){
int Vol=(int)Math.round(Math.PI*r*r*h);
System.out.println("Volume:"+Vol+"cm3");
}//end of volume method

public static void SurfaceArea(double r,double h){
int SA=(int)Math.round(2*Math.PI*r*(h+r));
System.out.println("Surface Area:"+SA+"cm2");
}//end of Surface Area Method

public static void main(String args[]){
//CALLING THE Area and Perimeter Method
int a=10;
int b=15;
int c=Area(a,b);//calling the area method
int d=Perimeter(a,b);//calling the perimeter method
System.out.println("Area:"+c+"cm2");
System.out.println("Perimeter:"+d+"cm");

//CALLING THE SA and VOLUME Method
double H=30;
double r=40;
Volume(H,r);//calling the Volume Method
SurfaceArea(H,r);//calling the Surface Area Method

//CALLING BUT WE ARE RECEIVING INPUT FROM THE KEYBOARD
Scanner sc=new Scanner(System.in);
System.out.println("Input Height and Radius");
double Height=sc.nextInt();
double Radius=sc.nextInt();
Volume(Height, Radius);
SurfaceArea(Height, Radius);

}//end of main class
}//end of class JavaMethods