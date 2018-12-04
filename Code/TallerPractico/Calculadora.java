import java.io.*;


public class Calculadora {
    
  public static int suma(int a,int b){ //
               int c = a + b;          //the two variables add up and the answer be stored in the variable C
      return c;                        //
           }
 
  public static int resta(int a,int b){
               int c = a - b;   //the two variables subtract up  and the answer be stored  in the variable C
      return c;
           }
 
  public static int multi(int a,int b){         
      if (b==1){                           // variable b are the time to repeat the variable a
                return a;               
                }else{
                return a + multi(a, b-1);  //Recursion is to get to b equal to 1 and add up the all until getting the call of start
                }
           }
 
  public static int division(int a,int b){
      if(b==0){
          BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
          wr.write("La division no es posible");
          return b;
      }else{
      int c = a / b;               // the variable a is divide in b and the answer be to stored in the variable c
      return c;
      }
           }
  
  public static int potencia(int a,int b){
               if (b==0){
                  return 1;
              }
              if (b==1){
                 return a; 
              }else
                return  a*potencia(a,b-1); 
           }
  
  public static double raizQ(int a){
      double b =Math.sqrt(a);        // this fuction make to varible change for answre  
      return b;
  }
  
  public static int residuo(int a, int b){
      int c= a%b;                    //the variable a is divide in b and the answer is the residue to stored in the variable c
      return c;
  }
  
  public static String menu(){
       String menu = "\n\n  Calculadora " + "\n1. Suma" + "\n2. Resta" + "\n3. Multiplicación" + "\n4. División"+
                    "\n5. Potencia"+"\n6. Raiz cuadrada"+"\n7. Residuo de la division"+"\n8. Salir"+"\n\n Opcion:";
                      //this is the menu that to appear in the start
       return menu;
   }

    public static void main(String[] args) {
        String op; 
        String a;
        String b;
        int opt,s1,s2;
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        BufferedWriter wr= new BufferedWriter (new OutputStreamWriter(System.out));
       try{             
        do{
            wr.write(menu());//invoke the function of menu
            wr.flush();
            op=br.readLine();           //this is to read the option that the usuary chosee          
             opt= Integer.parseInt(op); // this is to the variable turning into one number integer
            switch(opt){
                case 1:
                    wr.write("Digite el Primer Numero ");
                    wr.flush();
                    a = br.readLine();               //this is to read the value that the usuary chosee      
                    s1 = Integer.parseInt(a);        // this is to the variable turning into one number integer
                    wr.write("Digite el Segundo Numero ");
                    wr.flush();
                    b = br.readLine();               //this is to read the value that the usuary chosee
                    s2 = Integer.parseInt(b);        // this is to the variable turning into one number integer
                    wr.write("El resultado es " + suma(s1, s2)); // invoke the function add up
                        break;
                case 2: 
                    wr.write("Digite el Primer Numero ");
                    wr.flush();
                    a = br.readLine();              //this is to read the value that the usuary chosee
                    s1 = Integer.parseInt(a);       // this is to the variable turning into one number integer
                    wr.write("Digite el Segundo Numero ");
                    wr.flush();
                    b = br.readLine();                //this is to read the value that the usuary chosee
                    s2 = Integer.parseInt(b);         // this is to the variable turning into one number integer
                    wr.write("El resultado es " + resta(s1, s2)); //invoke the function subtract up
                        break;
                case 3:
                    wr.write("Digite el Primer Numero ");
                    wr.flush();
                    a = br.readLine();                   //this is to read the value that the usuary chosee 
                    s1 = Integer.parseInt(a);            // this is to the variable turning into one number integer
                    wr.write("Digite el Segundo Numero ");
                    wr.flush();
                    b = br.readLine();                   //this is to read the value that the usuary chosee
                    s2 = Integer.parseInt(b);            // this is to the variable turning into one number integer
                    wr.write("El resultado es " + multi(s1, s2)); //invoke the function of multiply recursively
                    break;
                case 4:
                    wr.write("Digite el Primer Numero ");
                    wr.flush();
                    a = br.readLine();                    //this is to read the value that the usuary chosee
                    s1 = Integer.parseInt(a);             // this is to the variable turning into one number integer
                    wr.write("Digite el Segundo Numero ");
                    wr.flush();
                    b = br.readLine();                   //this is to read the value that the usuary chosee
                    s2 = Integer.parseInt(b);            // this is to the variable turning into one number integer
                    wr.write("El resultado es " + division(s1, s2)); //invoke the function of to divide
                    break;
                case 5:
                    wr.write("Digite el Primer Numero ");
                    wr.flush();
                    a = br.readLine();                    //this is to read the value that the usuary chosee
                    s1 = Integer.parseInt(a);             // this is to the variable turning into one number integer
                    wr.write("Digite el Segundo Numero ");
                    wr.flush();
                    b = br.readLine();                    //this is to read the value that the usuary chosee
                    s2 = Integer.parseInt(b);             // this is to the variable turning into one number integer
                    wr.write("El resultado es " + potencia(s1, s2)); //invoke the function of power
                        break;
                case 6:
                    wr.write("Digite el Numero ");
                    wr.flush();
                    a = br.readLine();                   //this is to read the value that the usuary chosee
                    s1 = Integer.parseInt(a);            // this is to the variable turning into one number integer
                    wr.write("El resultado es " + raizQ(s1)); //invoke the function of square root
                        break;
                case 7:
                    wr.write("Digite el Primer Numero ");
                    wr.flush();
                    a = br.readLine();                  //this is to read the value that the usuary chosee
                    s1 = Integer.parseInt(a);           // this is to the variable turning into one number integer
                    wr.write("Digite el Segundo Numero ");
                    wr.flush();         
                    b = br.readLine();                    //this is to read the value that the usuary chosee
                    s2 = Integer.parseInt(b);             // this is to the variable turning into one number integer
                    wr.write("El resultado es " + residuo(s1, s2)); //invoke the function of residue
                        break;
                default:
                        if (opt > 8)                       //this is for say that the option is incorrect
                            System.out.println("\n\n: Opción no valida");
            }
       wr.flush();
        }while(opt!=8);  //this is for exit the program
       }catch (Exception ex){   
       }  
    }         
}
