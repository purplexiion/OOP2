public class MathRandom{
public static void main(String[]args){
//Generating a random between 0 and 1
System.out.println(Math.random());
//generating a random value between 0 and 10
System.out.println(Math.random()*10);
//Generating from 0 to 99.9999999
System.out.println(Math.random()*100);
//random value between 0 and 9.999, value rounded up
System.out.println(Math.ceil(Math.random()*10));
//random value between 0 and 99.99, value rounded up
System.out.println(Math.ceil(Math.random()*100));
//random value between 0 and 19.99, rounded up and added to 5
System.out.println(5+Math.ceil((Math.random()*20)));
}
}