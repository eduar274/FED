import java.io.*;


public class Recursividad {
    
    public static int pascal (int n, int k){
if ((k == 0)|(k == n)) {
    return 1;
    }else 
    return pascal(n-1,k-1) + pascal(n-1,k);
}
    
   public static int Fibonacci(int n){
       if (n==1){                                         //If the number is equal to one returns 0
           return 0;
       }else {
           if (n==2){                                    //if the number is equal to one returns 1
             return 1;  
           }else{                                         //If the number is greater than 2 the recursion applies
               return Fibonacci(n-1)+Fibonacci(n-2);      //You add the first term minus one with the second minus two
           }
       }
     
   } 
 
   public static int Fac(int n){
       if(n>1){                     //if the numer is greater than 1 returns the number is multiplied by the function minus one
           return n*Fac(n-1);
       }else
           return 1;
   }
 
   public static String menu(){
       String menu = "\n\n1. Pascar" + "\n2. Fibonacci" + "\n3. Factorial" + "\n4. Salir" + "\n\n Opcion:";
                         //this is the menu that to appear in the start
       return menu;
   }
   
    public static void main(String[] args) {
        
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        BufferedWriter wr= new BufferedWriter (new OutputStreamWriter(System.out));
        
        int a=0;
        int n=0;
        String b;
        try{
        do{
            wr.write(menu());              //invoke the function of menu
            wr.flush();                    
            b=br.readLine();               //this is to read the option that the usuary chosee 
            a = Integer.parseInt(b);       //this is to the variable turning into one number integer
        switch(a){
            case 1:
            for(int i=0; i< 20; i++){
                    for(int j=0; j <=i; j++){
                    wr.write(pascal(i,j)+"\t\n");
                     wr.flush();
                    }
                  }
              break;
            case 2:
                wr.write("Digite el numero: ");
                wr.flush();
                b=br.readLine();                //this is to read the option that the usuary chosee 
                n = Integer.parseInt(b);        //this is to the variable turning into one number integer
                wr.write("\n" + Fibonacci(n));  // invoke the fuction of Fibonacci
              break;              
            case 3:
                wr.write("Digite ");
                wr.flush();
                b=br.readLine();                //this is to read the option that the usuary chosee 
                n = Integer.parseInt(b);        //this is to the variable turning into one number integer
                wr.write("\n" + Fac(n));        // invoke the fuction of Factorial
              break;
              default:
                        if (a > 4)                       //this is for say that the option is incorrect
                            System.out.println("\n\n: Opción no valida");
    }
        wr.flush();
        }while(a!=4); //this is for exit the program
        }
        catch (Exception ex){
           
        }
}
    
}
