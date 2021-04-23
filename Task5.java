import java.util.Scanner;
public class Task5{
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
     
    String myString= sc.nextLine();
    int a[]=new int [100];
    for(int i=0; i<myString.length();i++){
      int n=myString.codePointAt(i);
      for(int j=0;j< myString.length();j++){
        if(a[j]==a[i]){ 
      a[n]++;
    }
      }
      }
    for(int i=65;i<=90;i++){
      System.out.println((char)i+" which is "+ i+ " was found "+a[i]+ " times");  
  }
}
}

  
  
  
  
