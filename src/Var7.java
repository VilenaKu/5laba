import java.io.*;
import java.util.Scanner;

public class Var7 {

    public static void main(String[] args) throws IOException{
        FileReader fr= new FileReader("file.txt");
        Scanner scan = new Scanner(fr);
        FileWriter fw = new FileWriter("result.txt");
        double x;
        double max=-1;
        boolean find=false;
        while(scan.hasNextDouble()) {
            x=scan.nextDouble();
            if (x>0) {
                fw.write(String.valueOf(x)+" ");
                find =true;
                if(x>max)
                    max=x;
            }
        }
        if(find)
            fw.write(String.valueOf(max));
        else
            fw.write("В исходном файле нет положительных чисел");
        fr.close();
        fw.close();
    }

}
