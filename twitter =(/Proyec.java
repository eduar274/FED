
package proyec;



import java.io.*;



public class Proyec {

static BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
static BufferedWriter wr= new BufferedWriter (new OutputStreamWriter(System.out));
static String tex;
    public static void main(String[] args) throws IOException {
   
      
      
                         int hast[]=new int[5];            String hast2[]=new String[5];
                         int tag[]=new int[5];             String tag2[]=new String[5];
                         int nick[]=new int[10];           String nick2[]=new String[10];
                       String r[]=readArrayFromFile("\\Users\\Camilo Rojas\\Desktop\\tweets.txt");
                       
                       String twe= r[1];
                        String[] m= twe.split(" ");
                        String con[]= new String[m.length];
                        for(int i=0;i<con.length;i++){
                        con[i]=m[i];
                         }
                        imprimir(con);
    }
   public static void Acttop(int array[],String array2[],int a,String c){
        int x;
        String c2;
        int index;
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
    public static String[] readArrayFromFile(String pathFile)throws FileNotFoundException, IOException{
                        String text;
                        
			FileReader fr = new FileReader(pathFile);
			BufferedReader br = new BufferedReader( fr );
                        while((text = br.readLine())!=null){
                        
			String[] numbers = text.split("►");
			
                       
                            
                                            
                        }
                        
		  br.close();
		return null;
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
     public static void contador(String array[]){
         int has=0; int arr=0; int oth=0;
         for(int i=0;i<array.length;i++){
             String c= array[i].substring(0);
             if(c.contains("@"))
                 arr++;
             if(c.contains("#"))
                 has++;
             if(!c.contains("@")&&!c.contains("#"))
                 oth++;
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
   


}
