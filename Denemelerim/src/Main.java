


import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

     File file = new File("kod.txt");
     if(!file.exists()){
         file.createNewFile();
     }
     String val = "Kodlama Vakti ";
     FileWriter yazi = new FileWriter(file,false);
     BufferedWriter byazi = new BufferedWriter(yazi);

     byazi.write(val);
     byazi.close();

     FileReader yazi = new FileReader(file);
     String Line;

     BufferedReader byazi = new BufferedReader(yazi);

    }
}