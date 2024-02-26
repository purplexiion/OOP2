public class OperatorOverloading{
//DEFINING METHODS(SUM)
public static int sum(int a, int b, int c){
return a+b+c;
}//end of i.sum
public static double sum(double a,double b,double c){
return a+b+c;
}//end of d.sum
public static double sum(int a,int b, double c){
return a+b+c;
}//end of i and d.sum
public static void main(String args[]){
int m=sum(1,2,3);
System.out.println("Sum:"+m);
int n=sum(2.3,4.5,6);
System.out.println("Sum:"+n);
int n=sum(2.3,4.5,6.7);
System.out.println("Sum:"+o);


}//end of public class
}//end of main class
