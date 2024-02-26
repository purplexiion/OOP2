class OperatorEx{
public static void main(String args[]){
System.out.println(!(3<10)); // using the logical NOT OperatorEx

//needs some clarification on the bitwise exclusive OR
System.out.println((0)^(1)); //false -> 0 and true -> 1
System.out.println((3>2)^(8>7));
System.out.println((3>4)|(8>7));

//shift operators
System.out.println("USE OF SHIFT OPERATORS");
System.out.println(13>>2);//assigned shift
System.out.println(13>>>2);//unassigned shift
System.out.println(78>>3);
System.out.println(13<<2);
System.out.println(78<<3);

// use of postfix and prefix operator -- used mostly in loops
int c=2,d=6;
System.out.println("Use of postfix and prefix operators");
System.out.println(c++);//this statement displays 2 then, only c incremented by 1 to 3.
System.out.println(d++);//this statement displays 2 then, only d incremented by 1 to 7.
System.out.println(++c);//this statement increments 1 to c then, only c is displayed
System.out.println(++d);//this statement increments 1 to d then, only d is displayed

//use of ternary operators - A Simplified if statement
System.out.println("TERNARY OPERATORS");
int marks;
marks=30;
char grade=(marks>=20)? 'P':'F';
System.out.println("The grade is:" + grade);

//ternary operator working with string object
String grd;
grd=(marks>=40)?String.valueOf("Pass"):String.valueOf("Fail");
System.out.println( "The mark generated is : " + marks + " and the grade is"+ grd);

//won't work in this case, might need to make a variable
int m=30;
System.out.println("Sample exercise but with random number");
System.out.println(m+=75);
System.out.println(m*=12);
System.out.println(m/=56);
System.out.println(m%=34);
System.out.println(m+=70);
System.out.println(m+=70);


// for loop that shifts the binary digit in each loop
int x=1;
for(int i=1;i<=10;i++)
System.out.println(i+"\t"+(x<<i));
}
}
/*
x=1 and i= 0
i is incremented to 1
now it becomes 1<<1
1 in binary is 1 shift bits to the right it becomes 10 -> which becomes 2
then the loop continues
x=1 and i=1
i is incremented to 2, 1<<2; 100 -> 4
x	value after being shifted
0       1
1       2
2       4
3       8
4       16
5       32
6       64
7       128
8       256
9       512
10      1024
*/