
public class loops{
public static void main(String[]args){
/*
//use of switch case(selection)
int number=20;
switch(number){
//case 10:System.out.println("10");break;
//case 20:System.out.println("20");break;
//case 30:System.out.println("30");break;
//default:System.out.println("Not in 10,20 or 30");
}
//Question 1 - USING A FOR LOOP
int sum1=0;
int x=1;

for(x=2;x<=30;x++){
sum1=sum1+x;
System.out.println("Sum for for-loop:"+sum1);
//System.out.println(x);
}
//USING A WHILE
int n=1;
int sum2=0;
while (n<=30){
sum2=sum2+n;
System.out.println("Sum for while loop:"+sum2);
System.out.println(n);
n++;
}

//Using a while and for loop to generate 20 random numbers and find their sum
//For Loop
int sum3=0;
for(n=1;n<=20;n++){
double randomint=Math.round(Math.random()*30);
sum3+=randomint;
System.out.println("RandomInt:"+randomint);
System.out.println(sum3);
}
*/
int sum4=0;
for(int p=1;p<=20;p++){
double randint=Math.round(Math.random()*67);
if(randint%2==1){
sum4+=randint;
System.out.println("RandomInt:"+randint);
//System.out.println(sum4);
}
}

}
}