import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Input_OutputStream {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease Enter your Name: ");

        try {
            String name = sc.next();
            FileOutputStream fileoutputStream = new FileOutputStream("names");
            BufferedOutputStream bufferedStream = new BufferedOutputStream(fileoutputStream);

            byte b[] = name.getBytes();
            bufferedStream.write(b);
            bufferedStream.flush(); //clears buffered file stream
            bufferedStream.close(); //closes buffered stream
            fileoutputStream.close(); //closes file output stream

            System.out.println("Success in writing to file");

            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("names"));
            int i;

            while ((i = inputStream.read()) != -1){
                System.out.print((char) i);
            }
            inputStream.close();

        } catch(Exception ex){
            System.out.println(ex);
        }
    }
}
