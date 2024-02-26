class Arrays{
public static void main(String[] args){
//declaring arrays
int a[]=new int[5];
a[0]=45;
a[1]=12;
a[2]=56;
a[3]=89;
a[4]=50;
//printing it
for(int i=0;i<a.length;i++)
System.out.println(a[i]);


//declaring, initialising and instantation of arrays at once
int n[]={33,5,3,2};
//printing the values
for(int l=0;l<n.length;l++)
System.out.println(n[l]);

//multi-dimensional arrays
int[][] arr=new int[3][3];
arr[0][0]=1;
arr[0][1]=2;
arr[0][2]=3;
arr[1][0]=4;
arr[1][1]=5;
arr[1][2]=6;
arr[2][0]=7;
arr[2][1]=8;
arr[2][2]=9;

//printing a multi-dimensional array
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}//end of public class
}//end of main class arrays