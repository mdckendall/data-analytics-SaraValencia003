
import java.io.*;
import java.io.FileReader;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
  Scanner option = new Scanner(System.in);
      
      
  boolean Continue = true;
    while (Continue == true) {
      System.out.println("Press 1 to learn about salary. \nPress 2 to   learn about the job. \nPress 3 to learn about demand. \nPress 4 to view current students. \nPress 5 to quit.");
  String choice = option.nextLine();
      
      if(choice.equals("1")){
        System.out.println("$98,345 average salary in South Florida!");
        
        
      } if(choice.equals("2")){
        System.out.println("US News - 100 Best Jobs!");
      
                
      }if(choice.equals("3")){
        System.out.println("Top 10 Forbes In-Demand Jobs!");
        
                
      }if(choice.equals("4")){
        try{
      
      FileReader fr = new FileReader("names.txt");
      BufferedReader br = new BufferedReader(fr);
      
      String line = br.readLine();
      
      while(line!=null){
        
        System.out.println(line);
        line = br.readLine();
        
      }
      
      br.close();
      fr.close();
    
      
    }catch(IOException e2){}
                      
      }if(choice.equals("5")){
        Continue = false;
        break;
                
      }
        
      
     
      
    } 
  }
}