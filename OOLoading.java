class OOLoading{
//declaring methods that will be used


public static void main(String []args){
/*
//display all the Command Line Arguments used(you have to type in the words for it to displat the array e.g java OOLoading Hi, my name is Wamuyu) to print out args[0]="Hi"
for(int i=0;i<args.length;i++){
System.out.println("args["+ i +"]:"+args[i]);
}//end of for loop
*/

//adding all the integers that are being passed as arguments -- implement the same but using a method instead
int sum=0;
for(int i=0;i<args.length;i++){
sum+=Integer.valueOf(args[i]);
System.out.println("Total Sum is:"+sum);
}//end of for loop 2

}//end of public class
}//end of main class
