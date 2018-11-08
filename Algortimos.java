
package algortimos;
import java.io.*;

public class Algortimos {
            static BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
            static BufferedWriter wr= new BufferedWriter (new OutputStreamWriter(System.out));
   
    public static void main(String[] args) {
        // TODO code application logic here
    try{
             int array [] = new int [10];
    
            cargarArray(array, 1 , 200);
    
            wr.write("Desordenado");
            wr.flush();
            imprimirArray(array);
            insertion_sort(array);
            wr.write("\nOrdenado por bubble");
            wr.flush();
            imprimirArray(array);
            wr.write("\nElemento buscado: "+array[5]);
            wr.flush();
            wr.write("El elemnto se encuentra en la posicion: "+interpolationSearchRecursive(array, array[5],0,array.length-1));
            wr.flush();
        }catch(Exception ex){
			ex.printStackTrace();
		} 
    }
    
    
    public static void cargarArray(int array[], int min, int max){
        for(int i=0;i<array.length;i++){
            array[i]= max-((int)Math.round((Math.random())*max-min));
        }
    
    }
    
    public static void imprimirArray(int array[]){
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
    
    
    public static void bubble_sort(int array[]){
       for (int i=0;i<array.length-1;i++){
           
           int s=0;
           for(int j=0;j<array.length-1;j++){
               if (array[j]>array[j+1]){
                s=array[j];
                array[j]=array[j+1];
                array[j+1]=s;
                
               }
               
           }
           
       }   
    }
    
    public static void insertion_sort(int array[]){
        int x;
        int index;
        for(int i=0;i<array.length;i++){
            x=array[i];
            index=i;
            
            while (index>0&&array[index-1]>x){
                array[index]=array[index-1];
                index=index-1;
            }
            array[index]=x;
        }
    }
    
    public static int lineal_search(int array[],int a){
        int index=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==a){
                index=i;
                break;
            }
        }
        return index;
    }
    
    public static int Binary_Search(int array[],int a){
        int lowerBound=0;
        int upperBound= array.length-1;
        int index=-1;
        while (lowerBound<upperBound){
            int middlePoint= (lowerBound+upperBound)/2;
            if (a==array[middlePoint]){
                index=middlePoint;
                break;
            }else{
                if (a<array[middlePoint]){
                    upperBound=middlePoint-1;
                }else{
                    lowerBound=middlePoint+1;
                }
            }
        }
        if (lowerBound==upperBound && array[lowerBound]==a){
            index=lowerBound;
        } 
        return index;
    }
    
    public static int Binary_SearchRecursive(int array[],int a,int iB,int uB){
        int middlePoint=(iB+uB)/2;
        if(iB==uB){
            if(a==array[middlePoint]){
                return middlePoint;
            }else{
                return -1;
            }
        }else{
            if(a==array[middlePoint]){
                return middlePoint;
            }else{
                if (a<array[middlePoint]){
                    return Binary_SearchRecursive(array,a,iB,middlePoint);
                }else{
                    return Binary_SearchRecursive(array,a,middlePoint+1,uB);
                }
            }
        }
    }
    
    public static int interpolationSearch(int array[],int a){
        int lowerBound=0;
        int upperBound= array.length-1;
        int index=-1;
        while (lowerBound<upperBound){
            int middlePoint= lowerBound+((upperBound-lowerBound)/(array[upperBound]-array[lowerBound]))*(a-array[lowerBound]);
            if (a==array[middlePoint]){
                index=middlePoint;
                break;
            }else{
                if(a<array[middlePoint]){
                    upperBound=middlePoint-1;
                }else{
                    lowerBound=middlePoint+1;
                }
            }
        }
        if (lowerBound==upperBound && array[lowerBound]==a){
            index=lowerBound;
        }
        return index;
    }
    public static int interpolationSearchRecursive(int array[],int a,int iB,int uB){
        int middlePoint= iB+((uB-iB)/(array[uB]-array[iB]))*(a-array[iB]);
        if(iB==uB){
            if(a==array[middlePoint]){
                return middlePoint;
            }else{
                return -1;
            }
        }else{
            if(a==array[middlePoint]){
                return middlePoint;
            }else{
                if (a<array[middlePoint]){
                    return interpolationSearchRecursive(array,a,iB,middlePoint);
                }else{
                    return interpolationSearchRecursive(array,a,middlePoint+1,uB);
                }
            }
        }
    }
    
}
