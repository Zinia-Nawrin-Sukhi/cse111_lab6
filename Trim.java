public class Trim{
  public static char [] trim(char [] input){
    char[]a =new char[input.length];
      for(int i=0;i<a.length;i++){
        if(input[i]!=' '){
          a[i]=input[i];
        }
        else if(input[i+1]!=' '){ 
                  a[i]=input[i];      
      }    
    }
      return a;
  }

  public static void main(String [] args){
    char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
    for (int i = 0; i< input.length; i++){
      System.out.print(input[i]);
    }
    System.out.println("");
    char []  output = trim(input);
    for (int i = 0; i< output.length; i++){
      System.out.print(output[i]);
    }
    System.out.println("");    
  }
}
