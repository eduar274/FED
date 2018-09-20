import java.io.*;
public class Palindromo {
    /**
     * 
     * @param b
     * @return 
     */
    public static String Palind(String b){
        boolean rep = true;
        int c = b.length();  //This is the size of the sequence of characters
        int m = c/2;         //This is the middle of size the sequence of characters
        for (int i=0;i < m;i++)
            if (b.charAt(i)!= b.charAt(c -1 -i)){ //This compares whether the characters are different
             rep = false;                         //If the conditional is true, returns False
             break;
            }  
            if (rep){
               return "verdadero";  
               }else {
                 return "falso";    
            }  
    }   
      
    public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
    
    try{
    
    String b;
    bw.write((Palind(b=br.readLine()))); //invoke the function of palindrome
   
    bw.flush();
    }
    catch (Exception ex){
        
    }
    }
} 

