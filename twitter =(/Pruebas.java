/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.*;


/**
 *
 * @author Camilo Rojas
 */
public class Pruebas {
        static BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        static BufferedWriter wr= new BufferedWriter (new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
	    
	    //Aqui debo poner una string, a esa String le voy a dar un split primero por saltos de lineas(va a un array) para clasificar 
	    //cada tweet, depues hare otro split por el caracter especial si lo almacenare en un array en este caso seria tweet en la 
	    //posicion 0= ustuarios, posicion 1=tweet,posicion 2=fecha,posicion 3=ubicacion
        String tweet[]={"@lol","#esto @gg #la ...... @gg aoiq aiqnw #lol ioqn @oanq @gg #la ","fecha","ubicacion" };
        int hast[]=new int[5];
        String hast2[]=new String[5];
        int tag[]=new int[5];
        String tag2[]=new String[5];
        int nick[]=new int[10];
        String nick2[]=new String[10];
        String text="@oa onw @oa @honey aoqni kqowbe @honey @oqw @dkopq ioqwjod oqwbno @dpqn @op231 @213";
        String text2[]= text.split(" ");
        
        String twe= tweet[1];
            String[] m= twe.split(" ");
        String con[]= new String[m.length];
        for(int i=0;i<con.length;i++){
              con[i]=m[i];
        }
        imprimir(con);
        cona(con,hast,hast2,"#");
        cona(con,tag,tag2,"@");
        contador(con);
        imprimir(hast);
        imprimir(hast2);
        imprimir(tag);
        imprimir(tag2);
    }
    public static void contador(String array[]){
         int has=0; int arr=0; int oth=0; int has2=0; int arr2=0; int other2=0;
         for(int i=0;i<array.length;i++){
             String c= array[i].substring(0);
             if(c.contains("@")){
                 arr++;
             }
             if(c.contains("#")){
                 has++;
             }
             if(!c.contains("@")&&!c.contains("#")){
                 oth++;
             }   //System.out.println(c+" posicion:"+i);
         }
         System.out.println("@= "+arr+" #= "+has+" otros= "+oth);
     }
    public static void cona(String []a,int b[],String []d,String v){
            int count2=0;
            String c="";
           
        for(int i=0;i<a.length;i++){
             String c2= a[i].substring(0);
             //System.out.println(i+" : "+c2);
            int count=0;
            count2=0;
            if(c2.contains(v)){
            for(int j=i;j<a.length;j++){
                //System.out.println(j+" : "+a[j]);
                 if(a[i].equals(a[j])){
                     count++;
                 }
                 if(count2<count){
                     count2=count;
                     c=a[i];
                 }
                // System.out.println("mas "+count2+" mas "+c);  
            }
           Acttop(b,d,count2,c);
            }
        }
    }
    public static void imprimir(int array[]){
        try{
                for(int i=0;i<array.length;i++){
                wr.write("["+array[i]+"]");
                wr.flush();
                }
            }
                catch(Exception ex){
			ex.printStackTrace();
		} 
    }
     public static void imprimir(String array[]){
        try{
                for(int i=0;i<array.length;i++){
                wr.write("["+array[i]+"]");
                wr.flush();
                }
            }
                catch(Exception ex){
			ex.printStackTrace();
		} 
    }
    
    public static void Acttop(int array[],String array2[],int a,String c){
        int x;
        String c2;
        int index;
	    //otra forma para el top 10 o 20, recorre el array y compara c.equals(i o j), si existe una igualdad un contador aumentara en 1
	    // en la condicion ademas pondre si el contador es igual a 0 cumple,el 4 debe ser remplazado por i del ciclo o un valor que 
	    //tenga encuenta el tamaño del vector
        if(array[4]<a && !c.equals(array2[0]) &&!c.equals(array2[1]) &&!c.equals(array2[2]) &&!c.equals(array2[3]) &&!c.equals(array2[4])){
            array[4]=a;
            array2[4]=c;
        for(int i=0;i<array.length;i++){
            x=array[i];
            c2=array2[i];
            index=i;
            while (index>0&&array[index-1]<x){
                array[index]=array[index-1];
                array2[index]=array2[index-1];
                index=index-1;
            }
            array[index]=x;
            array2[index]=c2;
        }
        }
    }
    }
