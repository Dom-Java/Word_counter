import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class counter{

    public static void main(String[] args) throws IOException{
        Scanner scnr = new Scanner("counter.txt");
        String read = scnr.next();
        String j = "java";
        String h = "hello";
        String w = "world";
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 0;
        List<String> words = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("src\\counter.txt"));
        String word = reader.readLine();
        while (word != null) {
            words.add(word);
            word = reader.readLine();
        }
        reader.close();
        String[] array = words.toArray(new String[0]);


        
        for(i = 0; i < array.length; ++i){
            if(h.compareTo(array[i]) == 0){
                a +=1;
            }
            if(w.compareTo(array[i]) == 0){
                b +=1;
            }
            if(j.compareTo(array[i]) == 0){
                c +=1;
            }
                    
                    
                }
                
                  
                String hello = (h + " " + a);
                String java = (j + " " + c);
                String world = (w+ " "+ b);
            
            try {
                PrintWriter counterWriter = new PrintWriter("src\\countercomplete.txt");
                
                counterWriter.println(hello);
                counterWriter.println(java);
                counterWriter.println(world);
                counterWriter.close();
                }           
                catch (IOException e) {
                
                e.printStackTrace();
                }
            }
             
        
        }
    
    
         
  
        
 
    

