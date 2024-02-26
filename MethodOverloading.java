class MethodOverloading{
//Declaring the methods
public static double min(double n1,double n2){
double min;
if (n1 > n2)
min = n2;
else
min = n1;
return min;
}//end of min class 1
public static int min(int n1,int n2){
int min;
if (n1 > n2)
min = n2;
else
min = n1;
return min;
}//end of min class 2

public static void main(String args[]){
int a=5;
int b=4;
double c=8;
double d=4;
//calling the methods
int f=min(a,b);
System.out.println("min:"+f);
double g=min(c,d);
System.out.println("min:"+g);

}//end of public class
}//end of main class
